package lucafavaretto.U5W3D3.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Official captain = new Official(Rank.CAPTAIN, "Antonio");

        FilterCash filterCash = new FilterCash(1500);

        filterCash.check(captain);
    }
}
