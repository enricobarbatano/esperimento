package BIBLIOTECA;

public class Libro extends ElementiBiblioteca{
    private String genere; //esempio giallo,horror..
    private int numPagine; //numero di pagine
    private boolean disponibile;
    public Libro(String titolo, String autore,String genere, int numPagine, boolean disponibile) {
        super(titolo, autore);
        this.genere = genere;
        this.numPagine = numPagine;
        this.disponibile = disponibile;
    }
    public String getGenere() {
        return this.genere;
    }
    public int getNumPagine() {
        return this.numPagine;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }
}
