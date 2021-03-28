package com.example.carparking.dao;

import com.example.carparking.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class OwnerDAO {
    @Autowired
    private OwnerRepository ownerRepository;

    public Collection<Owner> getOwners(){
        return ownerRepository.findAll();
    }
}
