public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        float procent = (float) 9.99;
        int srok = 12;
        float monthProcent = procent / 100 / srok;
        float hz = 1 + monthProcent;
        double hzStep = Math.pow(hz, srok);
        double razdel = (hzStep - 1);
        int platezh = service.calculate(sum, monthProcent, razdel);

        System.out.println("Сумма кредита" + sum);
        System.out.println("Процентная ставка" + procent);
        System.out.println("Срок кредита (месяцев)" + srok);
        System.out.println("Ежемесячный платёж" + platezh);
    }
}
