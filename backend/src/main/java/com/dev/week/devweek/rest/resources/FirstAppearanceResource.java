package com.dev.week.devweek.rest.resources;

import com.dev.week.devweek.commons.model.FirstAppearance;
import com.dev.week.devweek.rest.services.IFirstAppearanceService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/firstAppearances")
public class FirstAppearanceResource {
    
    private final IFirstAppearanceService firstAppearanceService;

    public FirstAppearanceResource(IFirstAppearanceService firstAppearanceService) {
        this.firstAppearanceService = firstAppearanceService;
    }

    @GetMapping("/{firstAppearanceId}")
    public FirstAppearance getFirstAppearanceById(@PathVariable Integer firstAppearanceId) {
        return this.firstAppearanceService.getFirstAppearanceById(firstAppearanceId);
    }
}
