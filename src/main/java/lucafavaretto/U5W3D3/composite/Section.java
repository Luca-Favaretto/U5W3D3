package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Section implements BookElement, Print {
    private String nome;
    private Set<BookElement> bookElements = new HashSet<>();

    public Section(String nome) {
        this.nome = nome;
    }

    public void addBookEl(BookElement bookEl) {
        this.bookElements.add(bookEl);
    }

    @Override
    public int getNumPage() {
        int sum = 0;
        for (BookElement bookElement : bookElements) {
            sum += bookElement.getNumPage();
        }

        return sum;
    }

    @Override
    public void print() {
        System.out.println(nome);

    }
}
