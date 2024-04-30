public class RewardValue {

    double cash;
    double miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
