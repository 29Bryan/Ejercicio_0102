/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_0102;

/**
 *
 * @author PCG
 */
public class Empleado {
    
    public String nombre;
    private int horasTrabajados;
    private double costoHora;
    private int anioIngreso;
    
    public Empleado() {
    }

    public Empleado(String nombre, int horasTrabajados, double costoHora, 
                    int anioIngreso) {
        this.nombre = nombre;
        this.horasTrabajados = horasTrabajados;
        this.costoHora = costoHora;
        this.anioIngreso = anioIngreso;

    }

    int AnioActual=0;
    public double calcularIngreso(int horasTrabajo, double costoHora, int anioIngreso, 
                                  int AnioActual){
        int aniosLaborales = AnioActual-anioIngreso;
        double extraIngreso = aniosLaborales*0.02;
        double ingresoBasico = horasTrabajo*costoHora; 
        double aumentoIngreso = ingresoBasico*extraIngreso;
        double totalIngreso =ingresoBasico+aumentoIngreso;
        return totalIngreso;
    }
    
    int maximoHorasTrabajadas=0;
    public double calcularBonoHorasExtra(int horasTrabajo,int maximoHorasTrabajadas, 
                                         double costoHora){
        double pagoDoble =0;
        if (horasTrabajo>maximoHorasTrabajadas){
            var horasExtras = horasTrabajo-maximoHorasTrabajadas;
             pagoDoble = horasExtras*(costoHora*2);
            return pagoDoble;
        }
        return pagoDoble;
    }
    
    int limite1=0;
    int limite2=0;
    int limite3=0;
    
    public double calcularImpuesto(int limite1, int limite2, int limite3, 
                                   double costoHora, int horasTrabajo){
        
        double ingresoBasico= costoHora*horasTrabajo;
        if(ingresoBasico<limite1){
            ingresoBasico=ingresoBasico+0;
        }
        else if (ingresoBasico>limite1 && ingresoBasico<limite2){
            double rango1Impuesto= ingresoBasico*0.05;
            ingresoBasico = rango1Impuesto;
        }
        else if(ingresoBasico>=limite2 && ingresoBasico<limite3){
            double rango2Impuesto=ingresoBasico*0.12;
            ingresoBasico = rango2Impuesto;
        }
        else if(ingresoBasico>limite3){
              double rango3Impuesto=ingresoBasico*0.25;
              ingresoBasico=rango3Impuesto;
        }  
        return ingresoBasico;
    }
}
