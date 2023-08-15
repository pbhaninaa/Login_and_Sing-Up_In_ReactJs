package com.example.BackEnd.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HotelId")
    private Long id;
    private String name;
    @Lob
    private byte[] hotelView;
    @Lob
    private byte[] inside1;
    @Lob
    private byte[] inside2;
    private boolean parking;
    private boolean wifi;

}
