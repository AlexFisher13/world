package com.fisher.world.controller;

import com.fisher.world.controller.dao.CountyDao;
import com.fisher.world.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountyDao countryDao;

    @GetMapping("/country")
    public List<Country> getCountry() {
        return countryDao.findAll();
    }
}
