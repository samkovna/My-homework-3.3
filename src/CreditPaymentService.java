public class CreditPaymentService {
    public int calculate(int loanBalance, double interestRate, int loanTerm) {

        double result = loanBalance * (interestRate / (100 * 12)) / (1 - Math.pow(1 + (interestRate / (100 * 12)), - loanTerm)) ;
        return (int) result;

    }

}
