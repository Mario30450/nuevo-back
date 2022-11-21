package com.porfolioArgProg.SpringBoot.Repository;

import com.porfolioArgProg.SpringBoot.Model.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepository extends JpaRepository<Educacion, Long> {

}
