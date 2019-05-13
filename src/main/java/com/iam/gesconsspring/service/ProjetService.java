package com.iam.gesconsspring.service;

import com.iam.gesconsspring.dao.ProjetRepository;
import com.iam.gesconsspring.entities.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetService {
    @Autowired
    private ProjetRepository projetRepository;

    public Projet saveOrUpdate(Projet projet) {
        return projetRepository.save(projet);
    }

    public boolean verifyCode(String code) {
        return projetRepository.existsByCode(code);
    }

    public Iterable<Projet> findAll() {
        return projetRepository.findAll();
    }

    public Projet findByCode(String code) {
        return projetRepository.findByCode(code);
    }

    public void delete(String code) {
        Projet projet = projetRepository.findByCode(code);
        projetRepository.delete(projet);
    }
}
