public class Main {
    /* LoanAmount - Сумма кредита
     * LoanTerm - Срок кредита (в месяцах)
     * MonthlyPayment - Ежемесячный платеж
     * InterestRate - процентная ставка
     * InterestPeriod - процентный период
     * Переменная LoanTerm задаём напрямую в service.calculate (в месяцах).
     * */
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int LoanAmount = 1_000_000;
        double InterestRate = 9.99;

        System.out.println( "Ваш ежемесячный платеж составляет = " + service.calculate(LoanAmount, 12, InterestRate) + " Рублей ");
        System.out.println( "Ваш ежемесячный платеж составляет = " + service.calculate(LoanAmount, 24, InterestRate) + " Рублей ");
        System.out.println( "Ваш ежемесячный платеж составляет = " + service.calculate(LoanAmount, 36, InterestRate) + " Рублей ");
    }
}