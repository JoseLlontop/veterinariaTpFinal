package com.argentinaPrograma.veterinariaTpFinal.dao.templateTurno;

// services/TurnoService.java

import com.argentinaPrograma.veterinariaTpFinal.models.Mascota;
import com.argentinaPrograma.veterinariaTpFinal.models.TurnoMedico;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TurnoService {
    public TurnoMedico generarTurnoGato(String descripcion, Date fecha, Date hora, Mascota mascota) {
        TurnoTemplate turnoGato = new TurnoGato();
        turnoGato.asignarDescripcion(descripcion);
        turnoGato.asignarFecha(fecha);
        turnoGato.asignarHora(hora);
        turnoGato.asignarMascota(mascota);
        return turnoGato.obtenerTurno();
    }

    public TurnoMedico generarTurnoPerro(String descripcion, Date fecha, Date hora, Mascota mascota) {
        TurnoTemplate turnoPerro = new TurnoPerro();
        turnoPerro.asignarDescripcion(descripcion);
        turnoPerro.asignarFecha(fecha);
        turnoPerro.asignarHora(hora);
        turnoPerro.asignarMascota(mascota);
        return turnoPerro.obtenerTurno();
    }
}
