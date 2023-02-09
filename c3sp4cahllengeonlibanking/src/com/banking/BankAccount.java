package com.banking;

public abstract class BankAccount {
    private long accountNumber;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean internetBankingIsEnabled;
    private double totalBalance;
    private double availableBalance;
    private float rateOfInterest;

    public BankAccount(long accountNumber,String accountOpeningDate,String modeOfOperation,boolean internetBankingIsEnabled,double totalBalance,double availableBalance,float rateOfInterest){
        this.accountNumber=accountNumber;
        this.accountOpeningDate=accountOpeningDate;
        this.modeOfOperation=modeOfOperation;
        this.internetBankingIsEnabled=internetBankingIsEnabled;
        this.totalBalance=totalBalance;
        this.availableBalance=availableBalance;
        this.rateOfInterest=rateOfInterest;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountOpeningDate(String accountOpeningDate){
        this.accountOpeningDate=accountOpeningDate;
    }
    public String getAccountOpeningDate(){
        return accountOpeningDate;
    }
    public void setModeOfOperation(String modeOfOperation){
        this.accountOpeningDate=modeOfOperation;
    }
    public String getModeOfOperation(){
        return modeOfOperation;
    }
    public void setInternetBankingIsEnabled(boolean internetBankingIsEnabled){
        this.internetBankingIsEnabled=internetBankingIsEnabled;
    }
    public boolean isInternetBankingIsEnabled(){
        return isInternetBankingIsEnabled();
    }
    public void setTotalBalance(double totalBalance){
        this.totalBalance=totalBalance;
    }
    public double getTotalBalance(){
        return totalBalance;
    }
    public void setAvailableBalance(double availableBalance){
        this.availableBalance=availableBalance;
    }
    public double getAvailableBalance(){
        return availableBalance;
    }
    public void setRateOfInterest(float rateOfInterest){
        this.rateOfInterest=rateOfInterest;
    }
    public float getRateOfInterest(){
        return rateOfInterest;
    }
    public abstract double  SowAccountBalance();
    public abstract double DebitAmount(double debitcash);
    public abstract double CreditAmount(double creditCash);
}
