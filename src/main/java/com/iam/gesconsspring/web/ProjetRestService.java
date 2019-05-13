package com.iam.gesconsspring.web;

import com.iam.gesconsspring.entities.Projet;
import com.iam.gesconsspring.service.MapValidationErrorService;
import com.iam.gesconsspring.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/projets")
@CrossOrigin
public class ProjetRestService {
    @Autowired
    private ProjetService projetService;
    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    // Add Projetct
    @PostMapping("")
    public ResponseEntity<?> addProjet(@Valid @RequestBody Projet projet, BindingResult result) {

        ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationService(result);
        if (errorMap != null) {
            return errorMap;
        }
        boolean verif = projetService.verifyCode(projet.getCode());
        if (verif) {
            return new ResponseEntity<>("Ce code existe deja", HttpStatus.BAD_REQUEST);
        } else {
            if (projet.getDateFin() != null && projet.getDateDebut() != null) {
                if (projet.getDateFin().after(projet.getDateDebut())) {
                    Projet projet1 = projetService.saveOrUpdate(projet);
                    return new ResponseEntity<>(projet1, HttpStatus.CREATED);
                } else {
                    return new ResponseEntity<>("La date de fin doit superieur a la date de debut ", HttpStatus.BAD_REQUEST);
                }
            } else {
                return new ResponseEntity<>("Les champs date debut et date fin sont obligation ", HttpStatus.BAD_REQUEST);
            }
        }
    }

    // List All Project
    @GetMapping("/all")
    public Iterable<Projet> getAll() {
        return projetService.findAll();
    }

    // Get project By Code
    @GetMapping("/{code}")
    public ResponseEntity<?> getByCode(@PathVariable String code) {
        Projet projet = projetService.findByCode(code);
        return new ResponseEntity<Projet>(projet, HttpStatus.OK);
    }
    // Delete projet By code

    @DeleteMapping("/{code}")
    public ResponseEntity<?> deleteProject(@PathVariable String code) {
        projetService.delete(code);
        return new ResponseEntity<String>("Projet supprimer avec succes", HttpStatus.OK);
    }
}
