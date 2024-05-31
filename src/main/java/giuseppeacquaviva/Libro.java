package giuseppeacquaviva;

public class Libro extends Elemento {
    private String autore;
    private String genere;

    public Libro(String codiceISBN, int annoPubblicazione, int numeroPagine, String autore, String genere, String titolo) {
        super(codiceISBN, annoPubblicazione, numeroPagine, titolo);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
