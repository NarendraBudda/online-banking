package com.banking;

public class RecurringDepositAccount extends BankAccount{

    public RecurringDepositAccount(long accountNumber,String accountOpeningDate,String modeOfOperation,boolean internetBankingIsEnabled,double totalBalance,double availableBalance,float rateOfInterest){
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBankingIsEnabled, totalBalance, availableBalance, rateOfInterest);
    }


    public double SowAccountBalance() {
        return super.getAvailableBalance();
    }

    public double DebitAmount(double debitcash){


            super.setAvailableBalance(super.getAvailableBalance() - debitcash);
            System.out.println("Amount debited from account " + debitcash);
            return super.getAvailableBalance();

    }
    public double CreditAmount(double creditCash) {

            super.setAvailableBalance(super.getAvailableBalance() + creditCash);
            System.out.println("amount credit to account " + creditCash);
            return super.getAvailableBalance();

    }

}
