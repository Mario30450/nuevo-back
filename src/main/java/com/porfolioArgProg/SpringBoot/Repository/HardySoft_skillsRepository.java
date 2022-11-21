

package com.porfolioArgProg.SpringBoot.Repository;

        import com.porfolioArgProg.SpringBoot.Model.HardySoft_skills;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository

public interface HardySoft_skillsRepository extends JpaRepository<HardySoft_skills, Long> {

}
