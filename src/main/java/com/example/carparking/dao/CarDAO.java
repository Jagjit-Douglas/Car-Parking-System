package com.example.carparking.dao;

import com.example.carparking.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CarDAO {
    @Autowired
    private CarRepository carRepository;

    public Collection<Car> getCars(){
        return carRepository.findAll();
    }

    public Car createCar(Car car){
        return carRepository.insert(car);
    }
}
