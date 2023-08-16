package com.example.BackEnd.controllers;

import com.example.BackEnd.entities.Hotel;
import com.example.BackEnd.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/save")
    public Hotel saveHotel(@RequestBody Hotel hotel) {
        return hotelService.saveHotel(hotel);
    }

    @GetMapping("/get/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return hotelService.getHotelById(id)
                .orElseThrow(() -> new RuntimeException("Hotel not found"));
    }

    @GetMapping("/getAll")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHotelById(@PathVariable Long id) {
        return hotelService.deleteHotelById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllHotels() {
        return hotelService.deleteAllHotels();
    }
}
