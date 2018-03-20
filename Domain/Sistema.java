
package Domain;

import java.util.ArrayList;


public class Sistema {
    
    private ArrayList<Organo> organos;
    private String nombre;

    public Sistema() {
    }
    
    

    public Sistema(ArrayList<Organo> organos, String nombre) {
        this.organos = organos;
        this.nombre = nombre;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(){
        System.out.println("Sistema: "+this.nombre);
    for(int i =0; i<this.getOrganos().size();i++){
        System.out.println(this.getOrganos().get(i));
        
        
        }
    }
    
    
}
