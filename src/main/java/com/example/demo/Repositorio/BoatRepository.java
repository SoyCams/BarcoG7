/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Modelo.Boat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.Interface.BoatInterface;

/**
 *
 * @author danielcasallas
 */
@Repository
public class BoatRepository {

    @Autowired
    private BoatInterface extencionesCrud;

    public List<Boat> getAll() {
        return (List<Boat>) extencionesCrud.findAll();
    }

    public Optional<Boat> getBoat(int id) {
        return extencionesCrud.findById(id);
    }

    public Boat save(Boat boat) {
        return extencionesCrud.save(boat);
    }

    public void delete(Boat boat) {
        extencionesCrud.delete(boat);
    }
}
