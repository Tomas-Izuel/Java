
package Inmuebles;


public abstract class Edificio {
    protected float avaluoXmt;

    public float valuar(Lote L1){
        return L1.valuar() * avaluoXmt;
    }
    
    public void demoler(Lote L1) throws ErrorLote{
        L1.setConstruccion(null);
    }

    public float getAvaluo() {
        return avaluoXmt;
    }

    public void setAvaluo(float avaluoXmt) {
        this.avaluoXmt = avaluoXmt;
    }
    
    
}
