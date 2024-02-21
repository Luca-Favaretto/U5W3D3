package lucafavaretto.U5W3D3.chain;

public enum Rank {
    LIEUTENANT(1000),
    CAPTAIN(2000),
    MAJOR(3000),
    COLONEL(4000),
    GENERAL(5000);

    private int salary;

    Rank(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
