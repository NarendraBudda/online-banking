package com.banking;

public class SavingAccount {
    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean isInternetAndMobileBankingEnabled;
    private float interestRate;
    private String modeOfOperation;

    public SavingAccount(){
       String accountHolderName="Budda";
       long  accountNumber=356874125;
        String accountOpeningDate="21/04/2016";
        String accountStatus="Active";
        double availableBalance=5000;
        double totalBalance=10000;
        boolean isInternetAndMobileBankingEnabled=false;
        float interestRate=5.2f;
        String modeOfOperation="Joint Account";

    }


        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName=accountHolderName;
        }
        public String getAccountHolderName(){
            return accountHolderName;
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
        public void setAccountStatus(String accountStatus){
            this.accountStatus=accountStatus;
        }
        public String getAccountStatus(){
            return accountStatus;
        }
        public void setAvailableBalance(double availableBalance){
            this.availableBalance=availableBalance;
        }
        public double getAvailableBalance(){
            return availableBalance;
        }
        public void setTotalBalance(double totalBalance){
            this.totalBalance=totalBalance;
        }
        public double getTotalBalance(){
            return totalBalance;
        }
        public void setInternetAndMobileBankingEnabled(boolean internetAndMobileBankingEnabled){
            this.isInternetAndMobileBankingEnabled=internetAndMobileBankingEnabled;
        }
        public boolean isInternetAndMobileBankingEnabled(){
            return isInternetAndMobileBankingEnabled;
        }
        public void setInterestRate(float interestRate){
            this.interestRate=interestRate;
        }
        public float getInterestRate(){
            return interestRate;
        }
        public void setModeOfOperation(String modeOfOperation){
            this.modeOfOperation=modeOfOperation;
        }
        public String getModeOfOperation(){
            return modeOfOperation;
        }
    public double getCheckBalance(){

        return getAvailableBalance();
    }

    public double setWithdrawCashFromAccount( double withdrawCash) {

         setAvailableBalance(getAvailableBalance() - withdrawCash);
        System.out.println("Amount Debited from your account "+withdrawCash);

        return getAvailableBalance();
    }

    public double setDepositingCashToAccount(double depositCash) {

        setAvailableBalance(getAvailableBalance() + depositCash);
        System.out.println("Successfully cash deposit to Your account "+depositCash);

        return getAvailableBalance();
    }
    public void displaydetails(){
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account Holder Name: "+getAccountHolderName());
        System.out.println("Account Balance: "+getAvailableBalance());
        System.out.println("Account Status: "+getAccountStatus());
        System.out.println("Account Internet And Mobile Banking Enabled: "+isInternetAndMobileBankingEnabled);
        System.out.println("Account Opening date: "+getAccountOpeningDate());
        System.out.println("Account Mode Of Operation : "+getModeOfOperation());
        System.out.println("Interest Rate : "+getInterestRate());
    }



}
