public class CreditPaymentService {
    /* формула :
    * LoanAmount - Сумма кредита
    * LoanTerm - Срок кредита (в месяцах)
    * MonthlyPayment - Ежемесячный платеж
    * InterestRate - процентная ставка
    * InterestPeriod - процентный период
    * */
    public int calculate (int LoanAmount, int LoanTerm , Double InterestRate) {
        double MonthlyPercent = InterestRate / ( 100 * 12 );
        double InterestPeriod = Math.pow((1 + MonthlyPercent), -(LoanTerm) );
        double MonthlyPayment = LoanAmount * (MonthlyPercent / (1 - InterestPeriod)); // формула рассчёта
        return (int) MonthlyPayment; // возврат расчёта по формуле
    }
}
