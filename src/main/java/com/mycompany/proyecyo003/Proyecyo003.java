/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecyo003;

/**
 *
 * @author PC-09
 */
public class Proyecyo003 {
    int codigo;
    String nombre;
    int horas;
    String nombreDocente;
    double costoHora;
    boolean vigente;
    
    String mostrarInformacion(){
        var retorno="La asignatura es: "+this.nombre+" el docente es:"+this.nombreDocente+" las horas de clases son "+ this.horas +",y el costo total es de"+
                this.costoHora +"y la clase esta"+this.vigente;
    
            

   
     }
}
