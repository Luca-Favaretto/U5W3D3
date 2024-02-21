package lucafavaretto.U5W3D3.chain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Official {
    private Rank rank;
    private String name;

    public Official(Rank rank, String name) {
        this.rank = rank;
        this.name = name;
    }
}
