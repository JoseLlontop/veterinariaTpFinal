package com.argentinaPrograma.veterinariaTpFinal.dao;

import com.argentinaPrograma.veterinariaTpFinal.models.Perro;
import com.argentinaPrograma.veterinariaTpFinal.models.Perro;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerroDao {

    List<Perro> getPerros();

    void eliminar(int id);

    void registrar(Perro perro);

    void actualizar(int id, Perro perro);
}
