/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobiblioteca;

/**
 *
 * @author TI-02
 */
public class Livros implements Publicacao {
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoas leitor;

    public String detalhes() {
        return "Livros{" + "titulo=" + titulo + "\n, autor=" 
                  + autor + "\n, totPagina=" + totPagina 
                  + "\n, pagAtual=" + pagAtual + ", aberto=" 
                  + aberto + ", leitor=" + leitor.getNome() +
                  ",idade="+leitor.getIdade()+
                  ",sexo="+leitor.getSexo()+'}';
    }

  

    public Livros(String titulo, String autor, int totPagina, Pessoas leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina =totPagina;
        this.aberto=false;
        this.pagAtual=0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto =true;
    }

    @Override
    public void fechar() {
        this.aberto =false;
    }

    @Override
    public void folhear(int p) {
        if (p> this.totPagina) {
            this.pagAtual =0;
        } else {
            this.pagAtual =p;
        }
   
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

   

   

    
    
}
