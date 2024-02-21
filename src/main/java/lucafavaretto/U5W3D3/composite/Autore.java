package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;

@Setter@
Getter
public class Autore {
    private String nome;
    private String cognome;

    public Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}
