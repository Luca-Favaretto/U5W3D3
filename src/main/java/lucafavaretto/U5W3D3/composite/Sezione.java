package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Sezione implements CalcolaPagine, Stampa {
    private String nome;
    private Set<Pagine> pagine = new HashSet<>();
    private Set<Sezione> sezioni = new HashSet<>();

    public Sezione(String nome) {
        this.nome = nome;
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

    }
}
