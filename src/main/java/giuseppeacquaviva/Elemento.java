package giuseppeacquaviva;

public class Elemento {
        private String codiceISBN;
        private String titolo;
        private int annoPubblicazione;
        private int numeroPagine;

        public Elemento(String codiceISBN, int annoPubblicazione, int numeroPagine, String titolo) {
            this.codiceISBN = codiceISBN;
            this.annoPubblicazione = annoPubblicazione;
            this.numeroPagine = numeroPagine;
            this.titolo = titolo;
        }

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(String codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}
