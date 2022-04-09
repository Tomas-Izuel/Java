/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author tomas
 */
public class Escritura {
    private Integer numero = 0;
    private int superficie;
    private String domicilio;

    public Escritura(int superficie, String domicilio) {
        numero ++;
        this.superficie = superficie;
        this.domicilio = domicilio;
    }
    
}
