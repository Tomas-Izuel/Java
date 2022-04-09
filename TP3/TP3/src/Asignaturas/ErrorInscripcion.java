/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;

/**
 *
 * @author tomas
 */
public class ErrorInscripcion extends Exception{
    
    public ErrorInscripcion (String s){
        super("No es posible realizar la inscripcion, " + s);
    }
}
