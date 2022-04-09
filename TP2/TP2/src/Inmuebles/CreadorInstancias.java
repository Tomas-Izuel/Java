
package Inmuebles;

import java.util.Scanner;

// Se creo esta clase para poder crear objetos de las clases de manera ilimitada, dando asi un uso mas real del sistema.
public class CreadorInstancias {
    Scanner leer = new Scanner(System.in);
    
    public Registro crearRegistro(){
        System.out.println("Ingrese un municipio");
        Registro R1 = new Registro(leer.nextLine());
        return R1;
    }
    
    public Lote crearLote (){
        System.out.println("Ingrese un domicilio");
        String dom = leer.nextLine();
        System.out.println("Ingrese la superficie");
        Lote L1 = new Lote(12345, dom, 10000, leer.nextInt());
        return L1;
    }
    
    public Edificio construirEdificioLote(Lote L1){
        int u;
        System.out.println("1- Construir casa");
        System.out.println("2- Construir departamento");
        Edificio edificacion;
        u = leer.nextInt();
        
        switch (u){
            case 1: Edificio casa = new Casa();
                    edificacion = casa;
                    break;
            case 2: Edificio edificio;
                    edificio = new Departamento((byte)4, 'A', 10, (byte)5); //tuve que cambiar de byte a int
                    edificacion = edificio;
                    break;
            default:Edificio casa1 = new Casa();
                    edificacion = casa1;
                    break;
        }
        return edificacion;
    }
}
