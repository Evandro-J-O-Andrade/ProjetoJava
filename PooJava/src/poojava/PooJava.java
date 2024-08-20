
package poojava;

/**
 *
 * @author TI-02
 */
public class PooJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo ="Bick";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Black";
        c2.cor ="Preta";
        c2.ponta = 0.7f; 
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
