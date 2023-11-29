package com.argentinaPrograma.veterinariaTpFinal.dao;

import com.argentinaPrograma.veterinariaTpFinal.models.Gato;
import org.springframework.stereotype.*;

import java.util.List;

@Repository
public interface GatoDao {

    List<Gato> getGatos();

    void eliminar(int id);

    void registrar(Gato gato);

    void actualizar(int id, Gato gato);
}
