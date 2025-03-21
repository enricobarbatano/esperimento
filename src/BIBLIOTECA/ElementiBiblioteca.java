package BIBLIOTECA;



public class ElementiBiblioteca {

    private String titolo;
    private String autore;

    public ElementiBiblioteca(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }
    public String getTitolo() {
        return this.titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getAutore() {
        return this.autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }

}
