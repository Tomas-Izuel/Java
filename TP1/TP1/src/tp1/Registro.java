/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.ArrayList;
import tp1.Lote;

/**
 *
 * @author tomas
 */
public class Registro {
    public static float coefAvaluoEdificio;
    public String municipio;
    private float tasa;
    
    public ArrayList<Lote> inmueble = new ArrayList<>();
    public ArrayList<Escritura> escrituras = new ArrayList<>();

    public Registro(String municipio) {
        this.municipio = municipio;
    }

    public void valuar(Lote L){
        System.out.println("El valor del lote " + L.idPatron.toString() + " es " + L.valuar());
    }
    
    public void registrar(Lote L1){
        inmueble.add(L1);
        L1.inscripto = this;
        escrituras.add(new Escritura(L1.superficie, L1.getDomicilio()));
    }
    
    public void emitirBoletos(){
        for (int i = 0; i < inmueble.size(); i++) {
            inmueble.get(i).mostrar();
        }
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    //Estos get y set no son necesarios, debido a que el atributo es publico, pero se implemento como esta en el enunciado.
    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public void setCoefAvaluoEdificio(float coefAvaluoEdificio) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
    }
    
    
}
