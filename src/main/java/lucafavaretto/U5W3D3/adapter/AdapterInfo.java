package lucafavaretto.U5W3D3.adapter;

import java.util.Date;

public class AdapterInfo implements DataSource {
    private Info info;

    public AdapterInfo(Info info) {
        this.info = info;
    }
    @Override
    public String getNomeCompleto() {
        return info.getNome()+"_"+info.getCognome();
    }

    @Override
    public int getEta() {
        Date currentDate = new Date();
        long timeDifference = currentDate.getTime() - info.getDataDiNascita().getTime();
        return (int) (timeDifference / (365 * 24 * 60 * 60 * 1000L));
    }

}
