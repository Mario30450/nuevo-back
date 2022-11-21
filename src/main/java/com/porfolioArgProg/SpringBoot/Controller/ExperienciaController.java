package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Experiencia;
import com.porfolioArgProg.SpringBoot.Service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@CrossOrigin (origins = "https://argenprogfront.web.app")
public class ExperienciaController {


    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return experienciaService.getExperiencia();
    }
    @PostMapping("/experiencia/agregar")
    public String addExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.addExperiencia(experiencia);
        return "se agrego experiencia";
    }

    @PostMapping("/experiencia/editar/{id}")
    public String editExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        experienciaService.editExperiencia(id, Experiencia);
        return "se edito experiencia";
    }


}

