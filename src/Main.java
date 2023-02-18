public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
     /*
        int loanBalance = 1_000_000;        // остаток суммы кредита, руб
        double interestRate = 9.99;     // месячная процентная ставка (рассчитывается как ставка по кредиту /100*12), %
        int loanTerm = 12;              // процентные периоды до окончания срока кредита, мес.
        int monthlyPayment = service.calculate(loanBalance, interestRate, loanTerm);            // размер ежемесячного платежа
     */

        System.out.println();
        System.out.println("Ежемесячный платеж при ежемесячной ставке 9,99% и сроке кредита 1 год: " + (service.calculate(1_000_000, 9.99, 12)) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платеж при ежемесячной ставке 9,99% и сроке кредита 1 год: " + (service.calculate(1_000_000, 9.99, 24)) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платеж при ежемесячной ставке 9,99% и сроке кредита 1 год: " + (service.calculate(1_000_000, 9.99, 36)) + " руб.");

    }
}
