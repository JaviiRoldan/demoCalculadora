package com.example.demoCalculadora.domain;

import org.springframework.stereotype.Component;

@Component
public abstract class Operando {
    private Float arg1;
    private Float arg2;

    public Operando(Float arg1, Float arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public Operando() {

    }

    public Float getArg1() {
        return arg1;
    }

    public void setArg1(Float arg1) {
        this.arg1 = arg1;
    }

    public Float getArg2() {
        return arg2;
    }

    public void setArg2(Float arg2) {
        this.arg2 = arg2;
    }

    public Float realizaOperacion(Float arg1, Float arg2){
        return 0.0F;
    }
}
