package com.teachmeskills.lesson_6.task_2;

public class TransferService {

    /**
     *
     * @param sum for add to balance credit card
     * @param creditCard user credit card
     */
    static void addTotBalance(int sum, CreditCard creditCard){
        if (sum <= 0) {
            System.out.println("Insert only numeric values, not negative!!");
        } else {
            creditCard.currentAccountBalance += sum;
        }
    }

    /**
     *
     * @param sum for remove from balance credit card
     * @param creditCard user credit card
     */
    static void removeFromBalance(int sum, CreditCard creditCard){
        if (sum <= 0) {
            System.out.println("Insert only numeric values, not negative!!");
        }if ( sum > creditCard.currentAccountBalance) {
            System.out.println("The balance is less than required for withdrawal!!");
        } else {
            creditCard.currentAccountBalance -= sum;
        }
    }

    /**
     *
     * @param creditCard user credit card
     */
    static void getInfoAboutCard(CreditCard creditCard){
        System.out.printf("Account №%d\t Balance: %d\n", creditCard.accountNumber, creditCard.currentAccountBalance );
    }

}
