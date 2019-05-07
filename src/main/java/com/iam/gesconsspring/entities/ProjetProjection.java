package com.iam.gesconsspring.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Projet.class)
public interface ProjetProjection {
    public String getNom();
    public String getCode();
}
