package com.porfolioArgProg.SpringBoot.Service;

import com.porfolioArgProg.SpringBoot.Model.Experiencia;
import com.porfolioArgProg.SpringBoot.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService{
    @Autowired
    private ExperienciaRepository experienciaRepository;

    public ExperienciaService() {
    }

    public void addExperiencia(Experienciaa experiencia){
        experienciaRepository.save(experiencia);
    }

    public void editExperiencia(Long id, Experiencia Experiencia){
        Experiencia antExperiencia = experienciaRepository.findById(id).orElse(null);
        if (experiencia.getNombre() != null){
            antExperiencia.setNombre(experiencia.getNombre());
        }
        ExperienciaRepository.save(antExperiencia);
    }

    public List<Experiencia> getExperiencia(){
        return (List<Experiencia>) experienciaRepository.findAll();
    }
}