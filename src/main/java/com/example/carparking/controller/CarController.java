package com.example.carparking.controller;

import com.example.carparking.entity.Car;
import com.example.carparking.service.CarService;
import com.example.carparking.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @GetMapping
    public Collection<Car> getCars(){
        return carService.getCars();
    }
}
