package BIBLIOTECA;

public class Cd extends ElementiBiblioteca{

    private String genereCd; //film,gioco,applicazione,etc.
    private int peso; //peso espresso in kb
    

    public Cd(String titolo, String autore, String genereCd, int peso) {
        super(titolo, autore);
        this.genereCd = genereCd;
        this.peso = peso;
    }
}
