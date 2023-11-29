package com.argentinaPrograma.veterinariaTpFinal.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "turnos_medico")
public class TurnoMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    @Temporal(TemporalType.TIME)
    @Column(name = "hora")
    private Date hora;

    @ManyToOne
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;

    @Column(name = "descripcion")
    private String descripcion;


}
