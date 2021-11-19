package com.dev.week.devweek.rest.resources;

import java.util.List;

import com.dev.week.devweek.commons.model.FirstAppearance;
import com.dev.week.devweek.commons.services.IFirstAppearanceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/firstAppearances")
public class FirstAppearanceResource {
    
    private final IFirstAppearanceService firstAppearanceService;

    public FirstAppearanceResource(IFirstAppearanceService firstAppearanceService) {
        this.firstAppearanceService = firstAppearanceService;
    }

    @GetMapping
    public List<FirstAppearance> getAllFirstAppearances() {
        return this.firstAppearanceService.getAllFirstAppearances();
    }
}
