package com.example.demoCalculadora.consola;

import com.example.demoCalculadora.domain.Operando;
import com.example.demoCalculadora.servicios.IOperaciones;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Controller
public class ControlerConsola {
    private IOperaciones operaciones;

    public ControlerConsola(IOperaciones operaciones) {
        this.operaciones = operaciones;
    }

    @PostConstruct
    public void init(){
        Scanner sc = new Scanner(System.in);
        String entradaConsola;
        int opcion = 1;
        while(opcion!=0){
            System.out.println("Menu por consola, elige un tipo de operación");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplica");
            System.out.println("4.- Divide");
            System.out.println("0.- Salir");
            System.out.println("Ingresa la accion a realizar");

            entradaConsola = sc.next();
            Float arg1 = 0.0F;;
            Float arg2 = 0.0F;;
            Float resultado = 0.0F;

            try{
                opcion = Integer.parseInt(entradaConsola);
            }catch(Exception e){
                System.out.println("Opcion no válida, ingresa un número");
            }
            switch (opcion){
                case 0:
                    System.out.println("Hasta luego");
                    break;
                case 1:
                    System.out.println("Ingrese primer argumento: ");
                    arg1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo argumento: ");
                    arg2 = Float.parseFloat(sc.next());
                    resultado = operaciones.sumar(arg1,arg2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 2:
                    System.out.println("Ingrese primer argumento: ");
                    arg1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo argumento: ");
                    arg2 = Float.parseFloat(sc.next());
                    resultado = operaciones.restar(arg1,arg2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 3:
                    System.out.println("Ingrese primer argumento: ");
                    arg1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo argumento: ");
                    arg2 = Float.parseFloat(sc.next());
                    resultado = operaciones.multiplicar(arg1,arg2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 4:
                    System.out.println("Ingrese primer argumento: ");
                    arg1 = Float.parseFloat(sc.next());
                    System.out.println("Ingrese segundo argumento: ");
                    arg2 = Float.parseFloat(sc.next());
                    resultado = operaciones.dividir(arg1,arg2);
                    System.out.println("Resultado: "+resultado);
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
