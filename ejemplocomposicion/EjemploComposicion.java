/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocomposicion;

import Domain.Organo;
import Domain.Sistema;
import Domain.Zapatos;
import Domain.deportivo;
import java.util.ArrayList;

/**
 *
 * @author Nelson
 */
public class EjemploComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema digestivo = new Sistema();
        Organo estomago= new Organo("Estomago", "Digerir alimentos");
        Organo boca= new Organo("Boca", "Masticar");
        
        ArrayList<Organo> organos = new ArrayList<Organo>();
        organos.add(boca);
        organos.add(estomago);
        
        digestivo.setOrganos(organos);
        digestivo.setNombre("Digestivo");
        digestivo.imprimir();
        
        Zapatos nike= new deportivo("Futbol",38);
        
        System.out.println(nike.toString());
        
        
    }
    
}
