
package Domain;


public class deportivo extends Zapatos{
    
    private String deporte;
    
   public deportivo( ){
       super();   
       
   }

   
     public deportivo(String deporte, int numCalzado) {
        super(numCalzado);
        this.deporte = deporte;
    }
     
   public deportivo(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString()+"deportivo{" + "deporte=" + deporte + '}';
    }

  
   

}
