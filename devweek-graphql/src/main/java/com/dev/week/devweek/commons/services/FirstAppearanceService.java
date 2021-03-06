package com.dev.week.devweek.commons.services;

import java.util.List;

import com.dev.week.devweek.commons.model.FirstAppearance;
import com.dev.week.devweek.commons.repositories.IFirstAppearanceRepository;

import org.springframework.stereotype.Service;

@Service
public class FirstAppearanceService implements IFirstAppearanceService {

    private final IFirstAppearanceRepository firstAppearanceRepository;

    public FirstAppearanceService(IFirstAppearanceRepository firstAppearanceRepository) {
        this.firstAppearanceRepository = firstAppearanceRepository;
    }

    @Override
    public List<FirstAppearance> getAllFirstAppearances() {
        return this.firstAppearanceRepository.findAll();
    }
    
}
