package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Libro implements CalcolaPagine, Stampa {
    private String titolo;
    private Set<Autore> autori;
    private Set<Sezione> sezioni = new HashSet<>();
    private Set<Pagine> pagine = new HashSet<>();
    private double prezzo;

    public Libro(String titolo, Set<Autore> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    @Override
    public int getNumeroPagine() {
        int sum = 0;
        for (Sezione sezioni : sezioni) {
            sum += sezioni.getNumeroPagine();
        }
        for (Pagine pagina : pagine) {
            sum += 1;
        }
        return sum;
    }

    @Override
    public void stampa() {
        System.out.println(titolo);
    }
}
