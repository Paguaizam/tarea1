/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

public class Auto {
    String placa;
    String color;
    int year;
    double precio;
    String marca;
    
    public boolean esTaxi(){
        var retorno = false;
        
        if(this.color=="amarillo"){
            retorno=true;
        }
        
        return retorno;
        
    }
    public int calcularTasaSolidaria(){
        var retorno= 1000000;
        if(this.precio> 0 && this.precio< 1000){
            retorno= 0;
            
        }else{
            if(this.precio>=1001 && this.precio <=10000){
                retorno= 100;
            }else{
                    if(this.precio >= 10001 && this.precio <= 25000 ){
                        retorno= 250;
                    }else{
                        retorno= 370;
                    }
            }
        }
        return retorno;
    }
    
    public double calcularMatricula(int limitYear, int limitPrecio){
        var retorno=10000d;
        if(this.year>=0 && this.year<=limitYear){
            if(this.precio>=0 && this.precio<=limitPrecio)
                retorno=this.precio*0.1;
            else
                retorno=this.precio*0.2;
        }else{
             if(this.precio>=0 && this.precio<=limitPrecio)
                retorno=this.precio*0.15;
            else
                retorno=this.precio*0.25;           
        }
        return retorno;
    }
    
    public String obtenerProvincia(){
        var retorno="TBD";
        var primerCaracterPlaca=this.placa.charAt(0);
        switch(primerCaracterPlaca)
        {
            case 'A':
                retorno="Azuay";
                break;
            case 'B':
                retorno="Bolivar";
                break;
            case 'C':
                retorno="Carchi";
                break;
            case 'U':
                retorno="Cañar";
                break;
            case 'G':
                retorno="Guayas";
                break;
            case 'P':
                retorno="Pichincha";
                break;
            default:
                retorno="Provincia no disponible";
        }
        return retorno;
    }  
   
    public int calcularYears(int currentYear){
         return currentYear-year;
    }
 }


