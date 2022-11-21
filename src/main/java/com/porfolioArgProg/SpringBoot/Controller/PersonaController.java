package com.porfolioArgProg.SpringBoot.Controller;

import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@CrossOrigin (origins = "https://argenprogfront.web.app")
public class PersonaController {


    @Autowired
    private PersonaService personaService;

    @GetMapping("/persona/traer")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }
    @PostMapping("/persona/agregar")
    public String addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
        return "se agrego";
    }

    @PostMapping("/persona/editar/{id}")
    public String editPersona(@PathVariable Long id, @RequestBody Persona persona){
        personaService.editPersona(id, persona);
        return "se edito";
    }


}
