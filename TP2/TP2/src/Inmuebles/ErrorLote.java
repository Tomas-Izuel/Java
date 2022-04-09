/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmuebles;

/**
 *
 * @author tomas
 */
public class ErrorLote extends Exception{
    
    public ErrorLote(String m){
        super("Se ha producido un error: " + m);
    }
}
