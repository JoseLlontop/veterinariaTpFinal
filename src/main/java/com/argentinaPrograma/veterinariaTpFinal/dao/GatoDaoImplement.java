package com.argentinaPrograma.veterinariaTpFinal.dao;

import com.argentinaPrograma.veterinariaTpFinal.models.Gato;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class GatoDaoImplement implements GatoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Gato> getGatos() {

        String query = "FROM Gato";
        return entityManager.createQuery(query, Gato.class).getResultList();

    }


    @Override
    public void eliminar(int id) {

        Gato producto = entityManager.find(Gato.class, id);
        entityManager.remove(producto);
    }

    @Override
    public void registrar(Gato producto) {

        entityManager.merge(producto);
    }

    @Override
    public void actualizar(int id, Gato producto) {

        Gato gatoActualizar = entityManager.find(Gato.class, id);

        //Actualizo sus propiedades con los nuevos valores
        gatoActualizar.setNombre(gatoActualizar.getNombre());
        gatoActualizar.setRaza(gatoActualizar.getRaza());
        gatoActualizar.setDueno(gatoActualizar.getDueno());
        gatoActualizar.setEdad(gatoActualizar.getEdad());

        entityManager.merge(gatoActualizar);
    }
}