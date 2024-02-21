package lucafavaretto.U5W3D3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RunnerComposite implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagine pag1 = new Pagine("pagina 1", 1);
        Pagine pag2 = new Pagine("pagina 2", 2);
        Pagine pag3 = new Pagine("pagina 3", 3);
        Pagine pag4 = new Pagine("pagina 4", 4);
        Pagine pag5 = new Pagine("pagina 5", 5);
        Pagine pag6 = new Pagine("pagina 6", 6);

        Set<Pagine> listP1 = new HashSet<>();
        listP1.add(pag1);
        listP1.add(pag2);
        listP1.add(pag3);

        Set<Pagine> listP2 = new HashSet<>();
        listP2.add(pag4);
        listP2.add(pag5);
        listP2.add(pag6);


        Sezione sezione = new Sezione("sotto capitolo");
        sezione.setPagine(listP1);
        Set<Sezione> listSez = new HashSet<>();
        listSez.add(sezione);


        Sezione sezioneC = new Sezione("capitolo");
        sezioneC.setPagine(listP2);
        sezioneC.setSezioni(listSez);

        Set<Sezione> listS = new HashSet<>();
        listS.add(sezioneC);


        Autore autore = new Autore("orman", "cagnoni");
        Set<Autore> listA = new HashSet<>();
        listA.add(autore);

        Libro libro = new Libro("titolo", listA, 12.20);
        libro.setSezioni(listS);

        System.out.println(libro);

        System.out.println("totale pagine " + libro.getNumeroPagine());


    }
}
