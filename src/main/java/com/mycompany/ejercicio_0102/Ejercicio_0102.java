/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_0102;

/**
 *
 * @author PCG
 */
public class Ejercicio_0102 {

    public static void main(String[] args) {
        
        var nombreEmpleado1 = "Pedro";
        var horasTrabajoE1 = 100;
        var costoHoraE1 = 6;
        var añoIngresoE1 = 2010;
        var añoActualE1 = 2022;
        var maximoHorasTrabajadasE1 = 100;
        var limite1 = 500;
        var limite2 = 1000;
        var limite3 = 2000;        
        
        Empleado  x1 = new Empleado(nombreEmpleado1, horasTrabajoE1, costoHoraE1, 
                                    añoIngresoE1);
        System.out.println("Nombre = "+x1.nombre);
        
        System.out.println("Horas Trabajadas = "+horasTrabajoE1); 
        System.out.println("Costo de Hora = "+costoHoraE1); 
        System.out.println("Anio de Ingreso = "+añoIngresoE1); 
        
        x1.calcularIngreso(horasTrabajoE1, costoHoraE1, añoIngresoE1, añoIngresoE1);
        System.out.println("Ingreso Total = "+x1.calcularIngreso(horasTrabajoE1, 
                           costoHoraE1, añoIngresoE1, añoActualE1));
        
        x1.calcularBonoHorasExtra(horasTrabajoE1, maximoHorasTrabajadasE1, costoHoraE1);
        System.out.println("Bono = "+x1.calcularBonoHorasExtra(horasTrabajoE1, 
                           maximoHorasTrabajadasE1, costoHoraE1));
        
        x1.calcularImpuesto(limite1, limite2, limite3, costoHoraE1, horasTrabajoE1);
        System.out.println("Impuesto = "+x1.calcularImpuesto(limite1, limite2, 
                           limite3, costoHoraE1, horasTrabajoE1));
        
        var ingreso1=x1.calcularIngreso(horasTrabajoE1, costoHoraE1, añoIngresoE1, 
                                        añoActualE1); 
        var ingreso2=x1.calcularBonoHorasExtra(horasTrabajoE1, maximoHorasTrabajadasE1, 
                                              costoHoraE1); 
        var impuesto=x1.calcularImpuesto(limite1, limite2, limite3, costoHoraE1, 
                                        horasTrabajoE1); 
        var total= ingreso1+ingreso2-impuesto;
        
        System.out.println("Total a Pagar ="+total); 
                
        var nombreEmpleado2 = "Alejandra";
        var horasTrabajoE2 = 200;
        var costoHoraE2 = 5;
        var añoIngresoE2 = 2020;
        var añoActualE2 = 2022;
        var maximoHorasTrabajadasE2 = 100;
        
        Empleado  x2 = new Empleado(nombreEmpleado2, horasTrabajoE2, costoHoraE2, 
                                    añoActualE2);
        System.out.println("\nNombre = "+x2.nombre);
        
                System.out.println("Horas Trabajadas = "+horasTrabajoE2); 
                System.out.println("Costo de Hora = "+costoHoraE2); 
                System.out.println("Anio de Ingreso = "+añoIngresoE2); 
        
        x2.calcularIngreso(horasTrabajoE2, costoHoraE2, añoIngresoE2, añoActualE2);
        System.out.println("Ingreso Basico = "+x2.calcularIngreso(horasTrabajoE2, 
                           costoHoraE2, añoIngresoE2, añoActualE2));
        
        x2.calcularBonoHorasExtra(horasTrabajoE2, maximoHorasTrabajadasE2, costoHoraE2);
        System.out.println("Bono = "+x2.calcularBonoHorasExtra(horasTrabajoE2, 
                           maximoHorasTrabajadasE2, costoHoraE2));
        
        x2.calcularImpuesto(limite1, limite2, limite3, costoHoraE2, horasTrabajoE2);
        System.out.println("Impuesto = "+x2.calcularImpuesto(limite1, limite2, 
                           limite3, costoHoraE2, horasTrabajoE2));
        
        var ingreso1Empleado2=x2.calcularIngreso(horasTrabajoE2, costoHoraE2, 
                                                 añoIngresoE2, añoActualE2); 
        var ingreso2Empleado2=x2.calcularBonoHorasExtra(horasTrabajoE2, 
                                                        maximoHorasTrabajadasE2, costoHoraE2); 
        var impuestoEmpleado2=x2.calcularImpuesto(limite1, limite2, limite3, 
                                                  costoHoraE2, horasTrabajoE2); 
        var totalEmpleado2= ingreso1Empleado2+ingreso2Empleado2-impuestoEmpleado2;
        
        System.out.println("Total a Pagar ="+totalEmpleado2);
        
        var nombreEmpleado3 = "Arturo";
        var horasTrabajoE3 = 150;
        var costoHoraE3 = 8;
        var añoIngresoE3 = 2018;
        var añoActualE3 = 2022;
        var maximoHorasTrabajadasE3 = 100;
        
        Empleado  x3 = new Empleado(nombreEmpleado3, horasTrabajoE3, costoHoraE3, añoActualE3);
        System.out.println("\nNombre = "+x3.nombre);
        
        System.out.println("Horas Trabajadas = "+horasTrabajoE3); 
        System.out.println("Costo de Hora = "+costoHoraE3); 
        System.out.println("Anio de Ingreso = "+añoIngresoE3); 
        
        x3.calcularIngreso(horasTrabajoE3, costoHoraE3, añoIngresoE3, añoActualE3);
        System.out.println( "Ingreso Basico="+x3.calcularIngreso(horasTrabajoE3, 
                           costoHoraE3, añoIngresoE3, añoActualE3));
        
        x3.calcularBonoHorasExtra(horasTrabajoE3, maximoHorasTrabajadasE3, costoHoraE3);
        System.out.println("Bono="+x3.calcularBonoHorasExtra(horasTrabajoE3, 
                           maximoHorasTrabajadasE3, costoHoraE3));
        
        x3.calcularImpuesto(limite1, limite2, limite3, costoHoraE3, horasTrabajoE3);
        System.out.println("Impuesto = "+x3.calcularImpuesto(limite1, limite2, 
                           limite3, costoHoraE3, horasTrabajoE3));
        
        var ingreso1Empleado3=x3.calcularIngreso(horasTrabajoE3, costoHoraE3, 
                                                añoIngresoE3, añoActualE3); 
        var ingreso2Empleado3=x3.calcularBonoHorasExtra(horasTrabajoE3, maximoHorasTrabajadasE3, 
                                                       costoHoraE3); 
        var impuestoEmpleado3=x3.calcularImpuesto(limite1, limite2, limite3, 
                                                 costoHoraE3, horasTrabajoE3); 
        var totalEmpleado3= ingreso1Empleado3+ingreso2Empleado3-impuestoEmpleado3;
        
        System.out.println("Total a Pagar ="+totalEmpleado3);
    }
}
