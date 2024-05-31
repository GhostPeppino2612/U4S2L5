package giuseppeacquaviva;

import giuseppeacquaviva.Enums.Periodicita;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoBibliotecario  {
    private List<Elemento> catalogo = new ArrayList<>();

    public void aggiungiElemento(Elemento elemento) {
        catalogo.add(elemento);
    }
    public void rimuoviElemento(String codiceISBN, Elemento elemento) {
        if (elemento.getCodiceISBN().equals(codiceISBN)) catalogo.remove(elemento);
    }
    public List<Elemento> ricercaPerAnno(int anno) {
        return catalogo.stream()
                .filter(e -> e.getAnnoPubblicazione() == anno)
                .collect(Collectors.toList());
    }
    public List<Elemento> ricercaPerAutore(String autore) {
        return catalogo.stream()
                .filter(e -> e instanceof Libro)
                .map(e -> (Libro) e)
                .filter(l -> l.getAutore().equals(autore))
                .collect(Collectors.toList());
    }
    public void salvaSuDisco(String nomeFile) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
            oos.writeObject(catalogo);
        }
    }

    public void caricaDaDisco(String nomeFile) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeFile))) {
            catalogo = (List<Elemento>) ois.readObject();
        }
    }
    public static void main(String[] args) {
        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();
        Libro libro1 = new Libro("123456", 2000, 300, "Autore1", "Fantasy", "Titolo1");
        Rivista rivista1 = new Rivista("789012", 2021, 50, "Titolo2", Periodicita.MENSILE);

        catalogo.aggiungiElemento(libro1);
        catalogo.aggiungiElemento(rivista1);
        System.out.println("Catalogo completo:");
    }
}
