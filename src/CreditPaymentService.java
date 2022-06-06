public class CreditPaymentService {

    public int calculate(int sum, float monthProcent, double razdel) {

        int platezh = (int) (sum * (monthProcent + (monthProcent / razdel)));


        return platezh;
    }
}
