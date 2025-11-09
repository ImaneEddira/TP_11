package com.example.tp_11.entities.projections;

import com.example.tp_11.entities.Compte;
import com.example.tp_11.entities.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}
