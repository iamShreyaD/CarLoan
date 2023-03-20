/*
 * Shreya B Deshpande
 * This Project is done through Codecademy 'Learn: java'
 * In this, project, a program has written to calculate the monthly car payment a user should expect
 * to make after taking out a car loan.
 * This CarLoan class includes car loan amount (carLoan), interest rate of the loan (interestRate),
 * length of the loan (in years) (loanLength), and down payment (downPayment).
 */


public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }
    
    else if (downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }

    else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }


	}
}
