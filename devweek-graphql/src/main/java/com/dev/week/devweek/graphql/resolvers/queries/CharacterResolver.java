package com.dev.week.devweek.graphql.resolvers.queries;

import com.dev.week.devweek.commons.model.Character;
import com.dev.week.devweek.graphql.context.dataloader.DataLoaderRegistryFactory;
import graphql.kickstart.tools.GraphQLResolver;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Component
public class CharacterResolver implements GraphQLResolver<Character> {

    /*
    * This resolver was created to solve the N+1 problem.
    *
    * This resolver is call everytime a Character is return by CharacterQueryResolver.
    *
    * The method allies is in charge to load in batch all characterName to be processed and then resolve them all
    * processing just once.
    */
    public CompletableFuture<List<Character>> allies(Character character, DataFetchingEnvironment environment) {
        DataLoader<String, List<Character>> dataLoader = environment.getDataLoader(DataLoaderRegistryFactory.CHARACTERS_DATA_LOADER);

        return dataLoader.load(character.getName());
    }

}
