/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto2;

/**
 *
 * @author lugca
 */
public class Usuario {
    protected String nombre;
    protected int identificacion;
    protected String email;
    protected int edad;
    protected String area;
    protected boolean jefe;
    protected float salario;
    public Usuario(String nombre, int identificacion, String email, int edad, String area, boolean jefe) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.jefe = jefe;
        float totalDevengado=0;
        if(this.area=="desarrollo"){
           if(this.jefe==true){
              totalDevengado=4500000f + 2500000f; 
           }else{
               totalDevengado=4500000f;
           }  
        }
        if(this.area=="administrativa"){
           if(this.jefe==true){
              totalDevengado=3500000f + 3000000f; 
           }else{
               totalDevengado=3500000f;
           }  
        }
        System.out.println(totalDevengado);
        this.salario=calcularSalario(totalDevengado);
        
    }
    
     public void info() {
      System.out.println("[Usuario]:");
      System.out.println("Nombre: "+this.nombre);
      System.out.println("Identificacion: "+this.identificacion);
      System.out.println("Email: "+this.email);
      System.out.println("Edad: "+this.edad);
      System.out.println("Area: "+this.area);
      System.out.println("Salario: "+this.salario);
    }
    public float calcularSalario(float devengado){
        float salari=0,descuento=0;
        
        if (devengado>908526*4){
           descuento=devengado*0.08f + devengado*0.01f; 
           
        }else{
            descuento=devengado*0.08f;
        }
        salari=devengado-descuento;
        return salari;
    } 
    
}
