package lucafavaretto.U5W3D3.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Info {
    private String name;
    private String surname;
    private Date birthdate;

    public Info(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }


}
