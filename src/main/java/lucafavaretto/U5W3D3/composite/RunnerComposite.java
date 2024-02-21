package lucafavaretto.U5W3D3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RunnerComposite implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Page pag1 = new Page("pagina 1", 1);
        Page pag2 = new Page("pagina 2", 2);
        Page pag3 = new Page("pagina 3", 3);
        Page pag4 = new Page("pagina 4", 4);
        Page pag5 = new Page("pagina 5", 5);
        Page pag6 = new Page("pagina 6", 6);

        Set<BookElement> listP1 = new HashSet<>();
        listP1.add(pag1);
        listP1.add(pag2);
        listP1.add(pag3);

        Set<BookElement> listP2 = new HashSet<>();
        listP2.add(pag4);
        listP2.add(pag5);
        listP2.add(pag6);

        Section sezione = new Section("sotto capitolo");
        sezione.setBookElements(listP1);

        Section sezioneC = new Section("capitolo");
        sezioneC.setBookElements(listP2);
        sezioneC.addBookEl(sezione);

        Set<BookElement> listS = new HashSet<>();
        listS.add(sezioneC);

        Author autore = new Author("orman", "cagnoni");
        Set<Author> listA = new HashSet<>();
        listA.add(autore);

        Book libro = new Book("titolo", listA, listS, 12.20);

        System.out.println(libro);

        System.out.println("totale pagine " + libro.getNumPage());

    }
}
