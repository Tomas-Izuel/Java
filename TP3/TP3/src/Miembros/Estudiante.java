/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

import java.util.ArrayList;
import Asignaturas.*;

/**
 *
 * @author tomas
 */
public class Estudiante extends Persona{
    private Integer legajo;
    private ArrayList<Inscripcion> inscripto;

    public Estudiante(Integer legajo, String nombre) {
        super(nombre);
        this.legajo = legajo;
        inscripto = new ArrayList();
    }

    public void inscribir(Curso C){
        try{
            inscripto.add(new Inscripcion(this,C));
        }
        catch (ErrorInscripcion e){
            System.out.println(e.getMessage());
        }
    }
    
    public void MostrarCursos(){
        System.out.println("El alumno "+nombre+" esta inscripto en los siguientes cursos: ");
        
        for (int i = 0; i < inscripto.size(); i++) {
            System.out.println(" "+((Inscripcion) inscripto.get(i)).getCurso().getTitulo());
        }
    }
    
    public int getCantInscripciones(){
        return inscripto.size();
    }
    
        public Integer getLegajo() {
        return legajo;
    }
}
