package lucafavaretto.U5W3D3.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Info  {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    public Info(String nome, String cognome, Date dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }


}
