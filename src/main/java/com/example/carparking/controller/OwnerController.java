package com.example.carparking.controller;

import com.example.carparking.entity.Owner;
import com.example.carparking.service.OwnerService;
import com.example.carparking.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @GetMapping
    public Collection<Owner> getOwners(){
        return ownerService.getOwners();
    }
}
