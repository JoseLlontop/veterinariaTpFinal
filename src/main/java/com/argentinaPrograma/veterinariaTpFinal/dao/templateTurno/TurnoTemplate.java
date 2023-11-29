package com.argentinaPrograma.veterinariaTpFinal.dao.templateTurno;

import com.argentinaPrograma.veterinariaTpFinal.models.Mascota;
import com.argentinaPrograma.veterinariaTpFinal.models.TurnoMedico;

import java.util.Date;

public interface TurnoTemplate {
    void asignarDescripcion(String descripcion);

    void asignarFecha(Date fecha);

    void asignarHora(Date hora);

    void asignarMascota(Mascota mascota);

    TurnoMedico obtenerTurno();
}
