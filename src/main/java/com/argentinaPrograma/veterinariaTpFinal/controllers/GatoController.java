package com.argentinaPrograma.veterinariaTpFinal.controllers;

import com.argentinaPrograma.veterinariaTpFinal.dao.GatoDao;
import com.argentinaPrograma.veterinariaTpFinal.models.Gato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GatoController {

    @Autowired
    GatoDao gatoDao;

    @RequestMapping(value = "api/gatos/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {

        gatoDao.eliminar(id);
    }


    @RequestMapping(value = "api/gatos", method = RequestMethod.GET)
    public List<Gato> getGatos() {

        return gatoDao.getGatos();
    }

    @RequestMapping(value = "api/gatos", method = RequestMethod.POST)
    public void registrarProducto(@RequestBody Gato gato) {

        gatoDao.registrar(gato);
    }

    @RequestMapping(value = "/api/gatos/{id}", method = RequestMethod.PUT)
    public void actualizarGato(@PathVariable int id, @RequestBody Gato gato) {

        gatoDao.actualizar(id, gato);
    }

}