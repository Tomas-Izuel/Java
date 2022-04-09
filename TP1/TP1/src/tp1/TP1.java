/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import tp1.*;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En este caso solo se hace con un lote, podria implementarse para multiples.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un municipio");
        Registro R1 = new Registro(leer.nextLine());
        System.out.println("Ingrese un domicilio");
        String dom = leer.nextLine();
        System.out.println("Ingrese la superficie");
        Lote L1 = new Lote(12345, dom, 10000, leer.nextInt());
        R1.registrar(L1);
        Edificio T1 = new Edificio();
        L1.setConstruccion(T1);
        R1.emitirBoletos();
    }
    
}
