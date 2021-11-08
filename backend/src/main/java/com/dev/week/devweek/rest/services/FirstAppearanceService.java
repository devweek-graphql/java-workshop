package com.dev.week.devweek.rest.services;

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
    public FirstAppearance getFirstAppearanceById(Integer id) {
        return this.firstAppearanceRepository.findById(id).orElse(null);
    }
    
}
