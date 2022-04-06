/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Paul Aguaiza
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        var autoJuan = new auto();
        autoJuan.color="amarillo";
        autoJuan.marca="chevrolet";
        autoJuan.placa="ABC910";
        autoJuan.año=2020;
        autoJuan.precio=20000;
        
        System.out.println(autoJuan.color+"/ "+
                           autoJuan.marca+"/" +
                           autoJuan.placa+"/" +
                           autoJuan.año+"/");
        
        var esTaxi=false;
        esTaxi=autoJuan.esTaxi();
        if(esTaxi==true){
         System.out.println("El auto de placa "+autoJuan.placa
                 +"Es un taxi"+
                 autoJuan.esTaxi());
        }else{
            System.out.println("El auto de placa "+autoJuan.placa
                 +"Es un taxi"+
                 autoJuan.esTaxi());
        }
        System.out.println("El auto de precio "+ autoJuan.precio +
                "Debe pagar tasa solidaria ="+
                autoJuan.calcularTasaSolidaria());
            
        System.out.println("El auto de precio "+ autoJuan.precio +
                "Debe pagar matricula ="+
                autoJuan.calcularMatricula());
         
       
      
    }
}
