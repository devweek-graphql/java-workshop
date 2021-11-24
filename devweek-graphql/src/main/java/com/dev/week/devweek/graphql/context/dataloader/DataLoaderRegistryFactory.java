package com.dev.week.devweek.graphql.context.dataloader;

import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.commons.services.CharacterService;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Component
public class DataLoaderRegistryFactory {

    private final CharacterService characterService;

    public static final String CHARACTERS_DATA_LOADER = "CHARACTERS_DATA_LOADER";
    // Since data the data loader works asynchronously it needs to be executed in a different thread
    public static final Executor characterThreadPool = Executors
            .newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public DataLoaderRegistryFactory(CharacterService characterService) {
        this.characterService = characterService;
    }


    public DataLoaderRegistry create() {
        DataLoaderRegistry registry = new DataLoaderRegistry();

        registry.register(CHARACTERS_DATA_LOADER, createCharacterDataLoader());

        return registry;
    }

    private DataLoader<String, List<Character>> createCharacterDataLoader() {
        /*
         * The characterNames parameter comes from CharacterResolver which the class that loads the bacth to be execute
         */
        return DataLoader.newMappedDataLoader((Set<String> characterNames) -> {
            System.out.println("characterNames:::::::::::" + characterNames);
            return CompletableFuture.supplyAsync(() -> {
                // retrieve the information for all the characterNames in one shot
                return this.characterService.getCharactersFor(characterNames);
            }, characterThreadPool);
        });
    }

}
