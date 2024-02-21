package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Book implements BookElement, Print {
    private String title;
    private Set<Author> author;
    private Set<BookElement> bookEl;
    private double price;

    public Book(String title, Set<Author> author, Set<BookElement> bookEl, double price) {
        this.title = title;
        this.author = author;
        this.bookEl = bookEl;
        this.price = price;
    }

    public void addBookEl(BookElement bookEl) {
        this.bookEl.add(bookEl);
    }

    @Override
    public int getNumPage() {
        int sum = 0;
        for (BookElement bookEl : bookEl) {
            sum += bookEl.getNumPage();
        }
        return sum;
    }

    @Override
    public void print() {
        System.out.println(title);
    }
}
