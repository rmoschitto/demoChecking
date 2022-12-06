package com.exampleChecking.demo;

import java.io.PrintStream;

public class AccountManagement {
    private final PrintStream printStream;
    private final LineReader lineReader;

    public AccountManagement(PrintStream printStream, LineReader lineReader) {
        this.printStream = printStream;
        this.lineReader = lineReader;
    }

    public void submit() {
        printStream.println("Please provide account holder name:");
        String accountHolderName = lineReader.readLine();
        printStream.println("Account for " + accountHolderName + " was created!");

        Account newAccount = new Account(accountHolderName);
    }

    public void viewBalance() {

        printStream.println("Do you want to see account balance? (Y/N)");
        String tellerResponse = lineReader.readLine();
        if (tellerResponse == "Y") {
            System.out.println(newAccount.balance);
        }
    }
}