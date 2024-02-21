package lucafavaretto.U5W3D3.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Official captain = new Official(Rank.GENERAL, "Antonio");

        FilterCash filterCash = new FilterCash(1000);
        FilterCash filterCash2 = new FilterCash(2000);
        FilterCash filterCash3 = new FilterCash(3000);
        FilterCash filterCash4 = new FilterCash(4000);
        FilterCash filterCash5 = new FilterCash(5000);
        FilterCash filterCash6 = new FilterCash(6000);

        filterCash.setNextFilter(filterCash2);
        filterCash2.setNextFilter(filterCash3);
        filterCash3.setNextFilter(filterCash4);
        filterCash4.setNextFilter(filterCash5);
        filterCash5.setNextFilter(filterCash6);

        filterCash.check(captain);
    }
}
