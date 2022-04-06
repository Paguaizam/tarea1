/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Paul Aguaiza
 */
public class auto {
    String color;
    String marca;
    int año;
    String placa;
    double precio;
    
    public boolean esTaxi(){
        var retorno= false;
        if(this.color=="amarillo"){
           retorno=true;
        }
        return retorno;
    }
     public int calcularTasaSolidaria(){
        var retorno= 1000000;
        if(this.precio>0 && this.precio<1000){
           retorno=0;    
        } else{
            if(this.precio>=1001&& this.precio<=10000){
                retorno=100;
            } else{
                if(this.precio>=10001&&this.precio<25000){
                    retorno = 250;
                }else{
                    retorno =370;
                }
            }
        }
        return retorno;
    }
     
     public double calcularMatricula(){
         var retorno=10000d;
         if(this.año>0 && this.año<=2010){
            if (this.precio>=0 && this.precio<=10000)
                retorno=this.precio*0.1;
            else
            retorno=this.precio*0.15;
         }else{
             if(this.precio>=0 && this.precio<=10000)
                 retorno=this.precio*0.20;
             else
                 retorno=this.precio*0.25;
         }
         return retorno;
    }
     
}

