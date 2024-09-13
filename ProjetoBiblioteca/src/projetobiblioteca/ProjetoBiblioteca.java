/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetobiblioteca;

/**
 *
 * @author TI-02
 */
public class ProjetoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoas[] p= new Pessoas[2];
        Livros[] l = new Livros[4];
        
        p[0] = new Pessoas("Pedro", 20, "M");
        p[1] = new Pessoas("Marua", 50, "F");
        l[0] = new Livros(" Aprendnendo Java Com Ganabara ", " Gustavo Ganabara ", 500, p[0]);
        l[1] = new Livros(" POO para Iniciantes "," Evandro Andrade ", 1000, p[1]);
        l[2] = new Livros(" JavaScript ", "BillGats", 1500, p[0]);
        l[3] =new Livros(" HTML ", " Marquinhos ", 500, p[1]);
        l[0].abrir();
        l[0].folhear(100);
        
        System.out.println(l[0].detalhes());
                System.out.println(l[1].detalhes());
                System.out.println(l[2].detalhes());
                System.out.println(l[3].detalhes());
    }
    
}
