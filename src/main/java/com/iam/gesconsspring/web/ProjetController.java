//package com.iam.gesconsspring.web;
//
//import com.iam.gesconsspring.dao.ProjetRepository;
//import com.iam.gesconsspring.entities.Projet;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/projets")
//public class ProjetController {
//    @Autowired
//    private ProjetRepository projetRepository;
//
//    //    @PostMapping("/add")
////    public ResponseEntity<Projet> createNewProjet(@RequestBody Projet p) {
////        Projet projet = projetRepository.save(p);
////        return new ResponseEntity<Projet>(projet, HttpStatus.CREATED);
////    }
//    @PostMapping("/add")
//    public ResponseEntity<?> saveOrUpdateProject(Projet projet) {
//        if (projet.getDateFin().after(projet.getDateDebut())) {
//            Projet p = projetRepository.save(projet);
//            return new ResponseEntity<>(p, HttpStatus.CREATED);
//        } else {
//            return new ResponseEntity<>("Creation impossible", HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @GetMapping(value = "/listProjets")
//    public Iterable<Projet> findAll() {
//        return projetRepository.findAll();
//    }
////    @GetMapping(value = "/{id}")
////    public  ResponseEntity<Projet> findById(@PathVariable("id") Long id){
////        Projet projet = projetRepository.findById(id);
////        return new ResponseEntity<>(projet, HttpStatus.OK);
////    }
//
//    @GetMapping("/{code}")
//    public ResponseEntity<Projet> findByCode(@PathVariable String code) {
//        Projet projet = projetRepository.findByCode(code);
//        return new ResponseEntity<>(projet, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{code}")
//    public ResponseEntity<?> deleteByCode(@PathVariable String code) {
//        Projet projet = projetRepository.findByCode(code);
//        projetRepository.delete(projet);
//        return new ResponseEntity<>("Projet supprimer avec succes", HttpStatus.OK);
//    }
////    @GetMapping(value = "/listProjets")
////    public ResponseEntity<List<Projet>> listeDesProjets() {
////        List<Projet> projets = null;
////        projets = (List<Projet>) projetRepository.findAll();
////        return new ResponseEntity<>(projets, HttpStatus.OK);
////    }
//
//    @DeleteMapping(value = "deleteProject")
//    public ResponseEntity<?> deleteProject(@RequestBody Projet projet) {
//        projetRepository.delete(projet);
//
//        return new ResponseEntity<String>("Projet supprime", HttpStatus.OK);
//    }
//
//    /*@PutMapping(value = "updateProjet")
//    public ResponseEntity<Projet> updateProjet(Projet projet, Long idProjet,
//                                               @RequestParam(value = "nom", required = false) String nom,
//                                               @RequestParam(value = "code", required = false) String code,
//                                               @RequestParam(value = "description", required = false) String description,
//                                               @RequestParam(value = "dateDebut", required = false) Date dateDebut,
//                                               @RequestParam(value = "dateFin", required = false) Date dateFin) {
//
//        Projet proj = projetRepository.findById(idProjet);
//
//        if (nom == null) projet.setNom(proj.getNom());
//        else projet.setNom(nom);
//        if (code == null) projet.setCode(proj.getCode());
//        else projet.setCode(code);
//        if (description == null) projet.setDescription(proj.getDescription());
//        else projet.setDescription(description);
//        if (dateDebut == null) projet.setDateDebut(proj.getDateDebut());
//        else projet.setDateDebut(dateDebut);
//        if (dateFin == null) projet.setDateFin(proj.getDateFin());
//        else projet.setDateFin(dateFin);
//
//        projetRepository.save(projet);
//        return new ResponseEntity<>(projet, HttpStatus.OK);
//    }*/
//
//}
