package com.porfolioArgProg.SpringBoot.Repository;

import com.porfolioArgProg.SpringBoot.Model.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {

}