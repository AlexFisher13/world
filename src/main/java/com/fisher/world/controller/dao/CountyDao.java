package com.fisher.world.controller.dao;

import com.fisher.world.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountyDao extends JpaRepository<Country, String> {
}
