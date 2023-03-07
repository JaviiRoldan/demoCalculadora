package com.example.demoCalculadora.repository;

import com.example.demoCalculadora.domain.Operando;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryMemory implements IRepositoryMemory{
    private List<Operando> operaciones;

    public RepositoryMemory(List<Operando> operaciones) {
        this.operaciones = new ArrayList<>();
    }
}
