package com.nestdigital.carsbackendapp.Controller;

import com.nestdigital.carsbackendapp.Model.CarsModel;
import com.nestdigital.carsbackendapp.dao.CarsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarsController {
    @Autowired
    private CarsDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcar",consumes = "application/json",produces = "application/json")
    public String Addcar(@RequestBody CarsModel cars){
        System.out.println(cars.toString());
        dao.save(cars);
        return "{Status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewcar")
    public List<CarsModel> Viewcar(){
        return (List<CarsModel>)dao.findAll();
    }
}
