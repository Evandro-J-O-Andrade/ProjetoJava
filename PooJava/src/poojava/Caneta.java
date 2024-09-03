
package poojava;

/**
 *
 * @author Evandro Andrade
 */
public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;
  void status(){
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Uma caneta " + this.cor);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Carga: " + this.carga);
      System.out.println("Esta tamapda? "  +this.tampada );
  }
   void rabiscar(){
       if (this.tampada == true) {
           System.out.println(" Erro! Nao posso rabiscar ");
       }
       else{
           System.out.println(" Eu estou rabiscando! ");
       }
   }
   void tampar(){
       this.tampada = true;
   }
   void destampar(){
       this.tampada =false;
   }
}
