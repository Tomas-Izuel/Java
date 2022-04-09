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
public class Lote {
    public  Integer idPatron;
    private final String domicilio;
    private float avaluoxmt;
    public int superficie;

    public Registro inscripto;
    private Edificio construccion;


    public Lote(Integer idPatron, String domicilio, float evaluoxmt, int superficie) {
        this.idPatron = idPatron;
        this.domicilio = domicilio;
        this.avaluoxmt = avaluoxmt;
        this.superficie = superficie;
    }
    
    public float valuar() {
        return avaluoxmt * superficie;
    }
    
    public void mostrar(){
        System.out.println("----------DATOS DEL LOTE----------------");
        System.out.println("Los datos del lote " + idPatron + " son:");
        System.out.println("Domicilio " + domicilio);
        System.out.println("Superficie " + superficie);
        System.out.println("Avaluo " + avaluoxmt);
        System.out.println("----------------------------------------");
    }

    //Set y get en caso de que se construya despues de haber registrado el lote.
    
    public Edificio getConstruccion() {
        return construccion;
    }

    public void setConstruccion(Edificio Construccion) throws ErrorLote{
        if (this.construccion == null && Construccion != null){
            this.construccion = Construccion;
        }
        else {
            throw new ErrorLote("Este lote ya tiene una construccion");
        }
        
    }
    //Se crea el get de domicilio para hacer la escritura
    public String getDomicilio() {
        return domicilio;
    }
    
}
