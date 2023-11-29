package com.argentinaPrograma.veterinariaTpFinal.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "perro")
public class Perro extends Mascota {

    @Column(name = "tamano")
    private String tamano;

}