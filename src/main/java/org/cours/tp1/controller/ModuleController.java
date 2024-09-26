package org.cours.tp1.controller;

import org.cours.tp1.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import org.cours.tp1.modele.Module;

@RestController
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @RequestMapping("/modules")
    public List<Module> getModules() {
        return moduleService.getModules();
    }

    @RequestMapping("/modules/{id}")
    public Module getModule(@PathVariable Integer id){
        return moduleService.getModule(id);
    }

    @PostMapping("/modules")
    public ResponseEntity<Module> ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
        return ResponseEntity.ok(module);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }

}
