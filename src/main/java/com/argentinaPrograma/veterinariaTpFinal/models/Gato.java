package com.argentinaPrograma.veterinariaTpFinal.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "gato")
public class Gato extends Mascota {

    @Column(name = "raza")
    private String raza;

}
