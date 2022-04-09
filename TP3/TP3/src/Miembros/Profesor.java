/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

import Asignaturas.Curso;

/**
 *
 * @author tomas
 */
public class Profesor extends Persona{
    private Curso curso;

    public Profesor(String nombre) {
        
        super(nombre);
    }
    
    public void dicta (Curso c){
        this.curso=c;
    }
    
    public void MostrarCurso(){
        System.out.println("El profesor "+ nombre +" dicta en el curso "+ curso.getTitulo());
    }
    
    public Curso getCurso(){
        return curso;
    }
}
