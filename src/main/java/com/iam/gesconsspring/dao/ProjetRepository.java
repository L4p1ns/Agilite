package com.iam.gesconsspring.dao;

import com.iam.gesconsspring.entities.Projet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//@CrossOrigin("*")
//@RepositoryRestResource
@Repository
public interface ProjetRepository extends CrudRepository<Projet, Long> {
    //Projet findById(Long id);
    Projet findByCode(String code);
    boolean existsByCode(String code);

//    @RestResource(path = "/byNom")
//    public List<Projet> findByNomContains(@Param("mc") String nom);
//    @RestResource(path = "/byNomPage")
//    public Page<Projet> findByNomContains(@Param("mc") String nom, Pageable pageable);
}
