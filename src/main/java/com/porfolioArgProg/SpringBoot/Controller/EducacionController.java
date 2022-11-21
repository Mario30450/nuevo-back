package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Educacion;
import com.porfolioArgProg.SpringBoot.Service.EducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@CrossOrigin (origins = "https://argenprogfront.web.app")
public class EducacionController {


    @Autowired
    private EducacionService educacionService;

    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion(){
        return EducacionService.getEducacion();
    }
    @PostMapping("/educacion/agregar")
    public String addEducacion(@RequestBody Educacion educacion){
        educacionService.addEducacion (educacion);
        return "se agrego educacion";
    }

    @PostMapping("/educacion/editar/{id}")
    public String editEducacion (@PathVariable Long id, @RequestBody Educacion educacion){
        Object Educacion = null;
        EducacionService.editEducacion(id, educacion);
        return "se edito educacion";
    }


}
