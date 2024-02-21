package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page implements BookElement, Print {
    private String content;
    private int numPage;

    public Page(String contento, int numPage) {
        this.content = content;
        this.numPage = numPage;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    @Override
    public int getNumPage() {
        return 1;
    }
}
