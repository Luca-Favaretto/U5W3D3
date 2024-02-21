package lucafavaretto.U5W3D3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class RunnerExercise implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info infoUser=new Info("luca","favaretto",new Date(1995, Calendar.NOVEMBER,16));
        AdapterInfo adapterInfo= new AdapterInfo(infoUser);
        UserData user= new UserData();
        user.getData(adapterInfo);
        System.out.println(user);
    }
}
