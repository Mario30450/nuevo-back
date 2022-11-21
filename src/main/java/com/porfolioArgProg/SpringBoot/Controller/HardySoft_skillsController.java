

package com.porfolioArgProg.SpringBoot.Controller;

        import com.porfolioArgProg.SpringBoot.Model.HardySoft_skills;
        import com.porfolioArgProg.SpringBoot.Service.HardySoft_skillsService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;


@RestController

@CrossOrigin(origins = "https://argenprogfront.web.app")
public class HardySoft_skillsController {


    @Autowired
    private HardySoft_skillsService hardySoft_skillsService;

    @GetMapping("/hardySoft_skills/traer")
    public List<HardySoft_skills> getHardySoft_skills(){
        return hardySoft_skillsService.getHardySoft_skills();
    }
    @PostMapping("/hardySoft_skills/agregar")
    public String addHardySoft_skills(@RequestBody HardySoft_skills hardySoft_skills){
        HardySoft_skillsService.addHardySoft_skills(hardySoft_skills);
        return "se agrego HardySoft_skills";
    }

    @PostMapping("/hardySoft_skills/editar/{id}")
    public String editHardySoft_skills(@PathVariable Long id, @RequestBody HardySoft_skills hardySoft_skills){
        pardySoft_skillsService.editHardySoft_skills(id, hardySoft_skills);
        return "se edito HardySoft_skills";
    }


}
