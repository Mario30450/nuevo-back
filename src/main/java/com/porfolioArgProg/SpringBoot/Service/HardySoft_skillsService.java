package com.porfolioArgProg.SpringBoot.Service;

import com.porfolioArgProg.SpringBoot.Model.HardySoft_skills;
import com.porfolioArgProg.SpringBoot.Repository.HardySoft_skillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardySoft_skillsService{
    @Autowired
    private HardySoft_skillsRepository hardySoft_skillsRepository;

    public HardySoft_skillsService() {
    }

    public void addHardySoft_skills (HardySoft_skills hardySoft_skills){
        hardySoft_skillsRepository.save(hardySoft_skills);
    }

    public void editHardySoft_skills (Long id, HardySoft_skills hardySoft_skills){
        HardySoft_skills antHardySoft_skills = HardySoft_skillsRepository.findById(id).orElse(null);
        if (hardySoft_skills.getNombre() != null){
            antHardySoft_skills.setNombre(hardySoft_skills.getNombre());
        }
        hardySoft_skillsRepository.save(antHardySoft_skills);
    }

    public List<HardySoft_skills> getHardySoft_skills(){
        return (List<HardySoft_skills>) HardySoft_skillsRepository.findAll();
    }
}