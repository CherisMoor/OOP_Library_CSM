interface Loanable {

    boolean isLoanable();

    int getMaximumLoanDays();

    void lateFee(Charges fee);
}