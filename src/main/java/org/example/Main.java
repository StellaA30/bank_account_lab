package org.example;

public class Main {
    public static void main(String[] args) {

        BankAccount person = new BankAccount("Stella", "Annor", "30.05.97", 12345, "current");
//        BankAccount person2 = new BankAccount("John", "Snow", "29.03.2023", 54321,);


//        checking the setters
        person.setFirstName("Florian");
        person.setLastName("Adams");
        person.setDateOfBirth("13.04.2001");
        person.setBalance(250);
        person.setAccountNumber(696926);
        person.setAccountType("savings");
        person.setOverdraft(-300);

//        checking the getters
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getDateOfBirth());
        System.out.println(person.getBalance());
        System.out.println(person.getAccountNumber());
        System.out.println(person.getAccountType());
        System.out.println(person.getOverdraft());

//        checking the methods
        int withdrawalAmount = 50;
        System.out.println(person.withdrawal(withdrawalAmount));

        int depositAmount = 100;
        System.out.println(person.deposit(depositAmount));

//        fixed interest rate of 1.5% for current account
        double interestRate = 1.5;
        System.out.println(person.payInterest(interestRate));

    }
}