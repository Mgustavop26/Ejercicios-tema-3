package ParteB;

public class Coche {
    private int nroPuertas;

     public Coche(int nropuertas){
        this.nroPuertas=nropuertas;
     }
     public Coche(){

     }
    public int getPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public void agregarPuertas(int nropuertas){
        this.nroPuertas= this.nroPuertas+nropuertas;

    }

}
