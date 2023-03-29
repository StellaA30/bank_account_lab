package org.example;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

//    constructor

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, String accountType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
        this.overdraft = -300;
    }

//    deposit method
    public double deposit(double amount){
        return this.balance += amount;
//        System.out.println("Your new balance is " + this.balance );
    }

//    original withdrawal method
    public double withdrawal(double amount){
        return this.balance -= amount;
//        System.out.println("Your new balance is " + this.balance );

    }


//    withdrawal method - extension work
     public String withdrawalWithOverdraft(double amount){
       if(this.balance - amount < this.overdraft){
           return "You cannot withdraw money now, you have reached your overdraft limit!!";
       } else {
           this.balance -= amount;
           return "Your new balance is " + this.balance;
      }
   }

// payInterest method

    public double payInterest(double interestRate){
        if(this.accountType.toLowerCase() == "current"){
            this.balance += this.balance * (interestRate/100);
//           assumes we add 2% extra if it's a savings account
        } else if(this.accountType.toLowerCase() == "savings"){
            this.balance += this.balance * ((2 + interestRate)/100);
        }
        return this.balance;
    }

//getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public double getOverdraft(){
        return this.overdraft;
    }

//    setters

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }


}
