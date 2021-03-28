package com.example.carparking.dao;

import com.example.carparking.entity.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ParkingLotDAO {
    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public Collection<ParkingLot> getParkingLots(){
        return parkingLotRepository.findAll();
    }
}
