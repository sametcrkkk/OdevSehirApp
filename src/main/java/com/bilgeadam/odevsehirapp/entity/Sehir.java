package com.bilgeadam.odevsehirapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sehir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;
    private String ad;
    private long bolumNo;



}
