package com.nestdigital.carsbackendapp.dao;

import com.nestdigital.carsbackendapp.Model.CarsModel;
import org.springframework.data.repository.CrudRepository;

public interface CarsDao extends CrudRepository<CarsModel,Integer> {
}
