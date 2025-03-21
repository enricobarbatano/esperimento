package BIBLIOTECA;

public class Rivista extends ElementiBiblioteca {

    private String genere_rivista; //esempio sport,cultura,innovazione
    private int annoDiUscita; //anno in cui la rivista è uscita

    public Rivista(String titolo, String autore, String genere_rivista,  int annoDiUscita) {
        super(titolo, autore);
        this.genere_rivista = genere_rivista;
        this.annoDiUscita = annoDiUscita;
    }

}

