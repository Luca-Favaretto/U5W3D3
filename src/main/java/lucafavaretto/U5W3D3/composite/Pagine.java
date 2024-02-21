package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagine implements Stampa {
    private String contento;
    private int numeroPagina;

    public Pagine(String contento, int numeroPagina) {
        this.contento = contento;
        this.numeroPagina = numeroPagina;
    }

    @Override
    public void stampa() {

    }

}
