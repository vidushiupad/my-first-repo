package com.activity.hexa;
import java.util.Scanner;
public class BankAccountManagementSystem {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BankAccount account = null;

	        while (true) {
	            try {
	                System.out.println("\n1. Create a New Bank Account");
	                System.out.println("2. Deposit Money");
	                System.out.println("3. Withdraw Money");
	                System.out.println("4. Check Balance");
	                System.out.println("5. Exit");
	                System.out.print("Enter choice: ");
	                int choice = scanner.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter Initial Deposit: ");
	                        double initialDeposit = scanner.nextDouble();
	                        account = new BankAccount(initialDeposit);
	                        System.out.println("Account created.");
	                        break;

	                    case 2:
	                        if (account == null) {
	                            throw new NullPointerException("Create an account first.");
	                        }
	                        System.out.print("Enter deposit amount: ");
	                        double deposit = scanner.nextDouble();
	                        account.deposit(deposit);
	                        break;

	                    case 3:
	                        if (account == null) {
	                            throw new NullPointerException("Create an account first.");
	                        }
	                        System.out.print("Enter withdrawal amount: ");
	                        double withdrawal = scanner.nextDouble();
	                        account.withdraw(withdrawal);
	                        break;

	                    case 4:
	                        if (account == null) {
	                            throw new NullPointerException("Create an account first.");
	                        }
	                        System.out.println("Current balance: " + account.getBalance());
	                        break;

	                    case 5:
	                        System.out.println("Exiting...");
	                        scanner.close();
	                        return;

	                    default:
	                        System.out.println("Invalid choice. Try again.");
	                }

	            } catch (InvalidAmountException | InsufficientFundsException e) {
	                System.out.println(e.getMessage());
	            } catch (NullPointerException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	}


