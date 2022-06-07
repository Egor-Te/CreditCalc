public class CreditPaymentService {

    public int calculate(int sum, double percent, int period) {

        double payment = (((percent / 1200 * (Math.pow((1 + percent / 1200), period)))
                / (Math.pow((1 + percent / 1200), period) - 1)) * sum);

        return (int) payment;
    }

}
