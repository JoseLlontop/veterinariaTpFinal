package com.argentinaPrograma.veterinariaTpFinal.dao.templateTurno;

import com.argentinaPrograma.veterinariaTpFinal.models.Mascota;

public class TurnoGato extends TurnoBase {
    @Override
    public void asignarMascota(Mascota mascota) {

        turno.setMascota(mascota);
    }
}
