
package Domain;


public class Zapatos {
    
    private int numCalzado;

    public Zapatos() {
    }

    public Zapatos(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    public int getNumCalzado() {
        return numCalzado;
    }

    public void setNumCalzado(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "numCalzado=" + numCalzado + '}';
    }
    
    
}
