package lucafavaretto.U5W3D3.chain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterCash extends Filter {
    private int value;

    public FilterCash(int value) {
        this.value = value;
    }

    public void check(Official official) {
        if (official.getRank().getSalary() >= value) {
            System.out.println("The Official with rank " + official.getRank() + " earn:" + official.getRank().getSalary());
        } else {
            System.out.println("The Official with rank " + official.getRank() + " earn less than value:" + value);

        }
    }
}
