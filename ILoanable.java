interface ILoanable {

    boolean isLoanable();

    int getMaximumLoanDays();

    void lateFee(Charges fee);
}