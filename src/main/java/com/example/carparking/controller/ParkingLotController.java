package com.example.carparking.controller;

import com.example.carparking.entity.ParkingLot;
import com.example.carparking.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/lots")
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping
    public Collection<ParkingLot> getParkingLots(){
        return parkingLotService.getParkingLots();
    }
}
