package com.example.tp_11.entities.projections;

import com.example.tp_11.entities.Compte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = Compte.class)
public interface CompteProjection1 {
    double getSolde();
}
