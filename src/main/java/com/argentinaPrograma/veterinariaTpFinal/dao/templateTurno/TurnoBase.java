package com.argentinaPrograma.veterinariaTpFinal.dao.templateTurno;

import com.argentinaPrograma.veterinariaTpFinal.models.Mascota;
import com.argentinaPrograma.veterinariaTpFinal.models.TurnoMedico;

import java.util.Date;

public abstract class TurnoBase implements TurnoTemplate {
    protected TurnoMedico turno = new TurnoMedico();

    @Override
    public void asignarDescripcion(String descripcion) {
        turno.setDescripcion(descripcion);
    }

    @Override
    public void asignarFecha(Date fecha) {
        turno.setFecha(fecha);
    }

    @Override
    public void asignarHora(Date hora) {
        turno.setHora(hora);
    }

    @Override
    public TurnoMedico obtenerTurno() {
        return turno;
    }
}
