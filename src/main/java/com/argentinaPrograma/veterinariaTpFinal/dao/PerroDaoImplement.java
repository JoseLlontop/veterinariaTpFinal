package com.argentinaPrograma.veterinariaTpFinal.dao;

import com.argentinaPrograma.veterinariaTpFinal.models.Perro;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class PerroDaoImplement implements PerroDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Perro> getPerros() {

        String query = "FROM Perro";
        return entityManager.createQuery(query, Perro.class).getResultList();

    }


    @Override
    public void eliminar(int id) {

        Perro perro = entityManager.find(Perro.class, id);
        entityManager.remove(perro);
    }

    @Override
    public void registrar(Perro perro) {

        entityManager.merge(perro);
    }

    @Override
    public void actualizar(int id, Perro perro) {

        Perro perroActualizar = entityManager.find(Perro.class, id);

        //Actualizo sus propiedades con los nuevos valores
        perroActualizar.setNombre(perroActualizar.getNombre());
        perroActualizar.setTamano(perroActualizar.getTamano());
        perroActualizar.setDueno(perroActualizar.getDueno());
        perroActualizar.setEdad(perroActualizar.getEdad());

        entityManager.merge(perroActualizar);
    }
}