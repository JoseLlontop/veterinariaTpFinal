package com.argentinaPrograma.veterinariaTpFinal.controllers;

import com.argentinaPrograma.veterinariaTpFinal.dao.templateTurno.TurnoService;
import com.argentinaPrograma.veterinariaTpFinal.models.Gato;
import com.argentinaPrograma.veterinariaTpFinal.models.Perro;
import com.argentinaPrograma.veterinariaTpFinal.models.TurnoMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping("/generarGato")
    public TurnoMedico generarTurnoGato(
            @RequestParam String descripcion,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
            @RequestParam @DateTimeFormat(pattern = "HH:mm:ss") Date hora,
            @RequestBody Gato gato
    ) {
        return turnoService.generarTurnoGato(descripcion, fecha, hora, gato);
    }

    @GetMapping("/generarPerro")
    public TurnoMedico generarTurnoPerro(
            @RequestParam String descripcion,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
            @RequestParam @DateTimeFormat(pattern = "HH:mm:ss") Date hora,
            @RequestBody Perro perro
    ) {
        return turnoService.generarTurnoPerro(descripcion, fecha, hora, perro);
    }
}
