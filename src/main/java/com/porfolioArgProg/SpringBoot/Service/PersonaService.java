package com.porfolioArgProg.SpringBoot.Service;

import com.porfolioArgProg.SpringBoot.Model.Persona;
import com.porfolioArgProg.SpringBoot.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService() {
    }

    public void addPersona(Persona persona){
        personaRepository.save(persona);
    }

    public void editPersona(Long id, Persona persona){
        Persona antPersona = personaRepository.findById(id).orElse(null);
        if (persona.getNombre() != null){
            antPersona.setNombre(persona.getNombre());
        }
        personaRepository.save(antPersona);
    }

    public List<Persona> getPersona(){
        return (List<Persona>) personaRepository.findAll();
    }
}
