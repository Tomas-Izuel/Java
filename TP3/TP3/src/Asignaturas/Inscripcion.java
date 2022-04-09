/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;
import Miembros.Estudiante;
import java.util.Enumeration;

/**
 *
 * @author tomas
 */
public class Inscripcion {
    private Estudiante alumno;
    private Curso paraEl;
    
    public Inscripcion (Estudiante alumno, Curso paraEl) throws ErrorInscripcion{
        if(alumno.getCantInscripciones()>=3){
            throw new ErrorInscripcion("El alumno "+alumno.getNombre()+" ya alcanzo la cantidad maxima de inscripciones");
        }
        this.alumno = alumno;
        this.paraEl = paraEl;
        
        paraEl.put(this.alumno.getLegajo(), this);
    }
    
    public Curso getCurso(){
        return paraEl;
    }
    
    public Estudiante getEstudiante(){
        return alumno;
    }
    
    static public boolean EstaInscripto(Estudiante estudiante, Curso curso){
        Enumeration enumeration = curso.elements();
        Inscripcion i1;
        Estudiante e1;
        
        while(enumeration.hasMoreElements()) {
            i1 = (Inscripcion) enumeration.nextElement();
            e1 = i1.getEstudiante();
            if(e1.getNombre().equals(estudiante.getNombre())){
                return true;
            }
        }
        return false;
    }
}
