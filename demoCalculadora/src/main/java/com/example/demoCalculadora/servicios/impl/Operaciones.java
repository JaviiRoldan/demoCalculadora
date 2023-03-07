package com.example.demoCalculadora.servicios.impl;

import com.example.demoCalculadora.servicios.IOperaciones;
import org.springframework.stereotype.Service;

@Service
public class Operaciones implements IOperaciones {
    public Float sumar(Float arg1, Float arg2) {
        return arg1+arg2;
    }
    public Float restar(Float arg1, Float arg2) {
        return arg1-arg2;
    }
    public Float multiplicar(Float arg1, Float arg2) {
        return arg1*arg2;
    }
    public Float dividir(Float arg1, Float arg2) {
        return arg1/arg2;
    }


}
