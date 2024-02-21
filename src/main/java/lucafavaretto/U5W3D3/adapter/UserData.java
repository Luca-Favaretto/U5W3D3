package lucafavaretto.U5W3D3.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {


    private String fullName;
    private int age;

    public void getData(DataSource ds) {
        fullName = ds.getFullName();
        age = ds.getAge();
    }
}
