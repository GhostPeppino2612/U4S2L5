package giuseppeacquaviva;

import giuseppeacquaviva.Enums.Periodicita;

public class Rivista extends Elemento {
    private Periodicita periodicita;
    public Rivista(String codiceISBN, int annoPubblicazione, int numeroPagine, String titolo,  Periodicita periodicita) {
        super(codiceISBN, annoPubblicazione, numeroPagine, titolo);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
}
