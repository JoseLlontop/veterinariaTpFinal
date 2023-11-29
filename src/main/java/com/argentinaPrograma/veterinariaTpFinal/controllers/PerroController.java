package com.argentinaPrograma.veterinariaTpFinal.controllers;

import com.argentinaPrograma.veterinariaTpFinal.dao.PerroDao;
import com.argentinaPrograma.veterinariaTpFinal.models.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerroController {

    @Autowired
    PerroDao perroDao;

    @RequestMapping(value = "api/perro/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {

        perroDao.eliminar(id);
    }


    @RequestMapping(value = "api/perros", method = RequestMethod.GET)
    public List<Perro> getPerros() {

        return perroDao.getPerros();
    }

    @RequestMapping(value = "api/perros", method = RequestMethod.POST)
    public void registrarProducto(@RequestBody Perro perro) {

        perroDao.registrar(perro);
    }

    @RequestMapping(value = "/api/perros/{id}", method = RequestMethod.PUT)
    public void actualizarPerro(@PathVariable int id, @RequestBody Perro perro) {

        perroDao.actualizar(id, perro);
    }

}