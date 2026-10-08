// import java.util.Scanner;

// public class MoneySurvival {

//     static int calculateExpenses(int rent, int food, int travel, int recharge, int entertainment) {
//         return rent + food + travel + recharge + entertainment;
//     }

//     static int calculateSavings(int income, int expenses) {
//         return income - expenses;
//     }

//     static boolean checkBudget(int savings) {
//         return savings >= 0;
// }
//     static void printBudgetResult(int income, int expenses, int savings) {
//         System.out.println("Income: " + income);
//         System.out.println("Expenses: " + expenses);
//         System.out.println("Savings: " + savings);

//         if (savings < 0)
//             System.out.println("Bhai, salary se pehle expenses aa gaye");
//         else if (savings == 0)
//             System.out.println("Balance: Zen mode");
//         else if (savings > 5000)
//             System.out.println("Future CEO detected");
//         else
//             System.out.println("Budget under control");

//         System.out.println("Budget: " + checkBudget(savings));
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Income: ");
//         int income = sc.nextInt();

//         System.out.print("Rent: ");
//         int rent = sc.nextInt();

//         System.out.print("Food: ");
//         int food = sc.nextInt();

//         System.out.print("Travel: ");
//         int travel = sc.nextInt();

//         System.out.print("Recharge: ");
//         int recharge = sc.nextInt();

//         System.out.print("Entertainment: ");
//         int entertainment = sc.nextInt();

//         int expenses = calculateExpenses(rent, food, travel, recharge, entertainment);
//         int savings = calculateSavings(income, expenses);

//         printBudgetResult(income, expenses, savings);

//         sc.close();
//     }
// }








