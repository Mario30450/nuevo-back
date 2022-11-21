package com.porfolioArgProg.SpringBoot.Repository;

import com.porfolioArgProg.SpringBoot.Model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}