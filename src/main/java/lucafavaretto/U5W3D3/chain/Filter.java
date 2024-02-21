package lucafavaretto.U5W3D3.chain;

public abstract class Filter {
    private Filter nextFilter;

    public abstract void check(Official official);

    public void next(Official official) {
        if (this.nextFilter != null) {
            this.nextFilter.check(official);
        } else {
            System.out.println("ACAB");
        }

    }
}
