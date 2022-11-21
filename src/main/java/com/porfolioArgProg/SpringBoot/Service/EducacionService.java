package com.porfolioArgProg.SpringBoot.Service;

import com.porfolioArgProg.SpringBoot.Model.Educacion;
import com.porfolioArgProg.SpringBoot.Repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService{
    @Autowired
    private EducacionRepository educacionRepository;

    public EducacionService() {
    }

    public void addEducacion(Educacion educacion){
        educacionRepository.save(educacion);
    }

    public void editEducacion(Long id, Educacion educacion){
        Educacion antEducacion = educacionRepository.findById(id).orElse(null);
        if (educacion.getEducacion() ){
            antEducacion.setEducacion(Educacion.getEducacion());
        }
        educacionRepository.save(antEducacion);
    }

    public List<Educacion> getEducacion(){
        return (List<Educacion>) educacionRepository.findAll();
    }
}



