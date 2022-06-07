public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double percent = 9.99;
        int period = 36;
        int payment = service.calculate(sum, percent, period);

        System.out.println("Сумма кредита" + sum);
        System.out.println("Процентная ставка" + percent);
        System.out.println("Срок кредита (месяцев)" + period);
        System.out.println("Ежемесячный платёж" + payment);
    }
}
