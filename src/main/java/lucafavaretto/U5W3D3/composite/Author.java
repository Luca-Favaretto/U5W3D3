package lucafavaretto.U5W3D3.composite;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
