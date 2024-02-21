package lucafavaretto.U5W3D3.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AdapterInfo implements DataSource {
    private Info info;

    public AdapterInfo(Info info) {
        this.info = info;
    }

    @Override
    public String getFullName() {
        return info.getName() + "_" + info.getSurname();
    }

    @Override
    public int getAge() {
        Date currentDate = new Date();
        long timeDifference = currentDate.getTime() - info.getBirthdate().getTime();
        return (int) (timeDifference / (365 * 24 * 60 * 60 * 1000L));
    }


}
