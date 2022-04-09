/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author tomas
 */
public class Curso extends Hashtable<Integer, Inscripcion>{
    private String titulo;
    
    public Curso(String titulo){
        this.titulo = titulo;
    }
    
    public void inscriptos(){
        Enumeration enum1 = elements();
        
        Inscripcion i1;
        
        System.out.println("Inscriptos en el curso "+titulo+" "+getCantidadInscriptos());
        
        while (enum1.hasMoreElements()){
            i1 = (Inscripcion) enum1.nextElement();
            System.out.println(" "+i1.getEstudiante().getNombre());
        }
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    int getCantidadInscriptos(){
        int CantidadInscriptos = 0;
        Enumeration enum1 = elements();
        
        while (enum1.hasMoreElements()){
            enum1.nextElement();
            CantidadInscriptos++;
        }
        
        return CantidadInscriptos;
    }
}
