package statements;

public class Investment {
    private double cost = 0.003;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate){
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund(){
        return fund;
    }

    public int getInterestRate(){
        return interestRate;
    }

    public double getYields(int days){
        return (fund * interestRate / 100.0) / 365 * days;
    }

    public double close(int days){
        double sum = active ?(fund + getYields(days)) * (1 - cost) : 0.0;
        active = false;
        return sum;
    }

    public boolean isActive(){
        return active;
    }
}
