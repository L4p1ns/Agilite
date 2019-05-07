package com.iam.gesconsspring.dao;

import com.iam.gesconsspring.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
