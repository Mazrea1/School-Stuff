package midtermExamPractice;
import java.util.Scanner;

public class employeeApp {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter the designation of the employee: 1/2/3");
        int designation = scanner.nextInt();
        double bonusPercentage = 0;
        if (designation == 1) {
            bonusPercentage = 20;
        } else if (designation == 2) {
            bonusPercentage = 10;
        } else if (designation == 3) {
            bonusPercentage = 5;
        }
        employee employee1 = new employee(salary, bonusPercentage);


        double calculateBonus = employee1.bonusPercentage;
        double totalSalary = employee1.calculateTotal();
        System.out.println("The emplyee's total salary is: " + totalSalary);
        // emp.salary = 50000; // This line will cause an error because salary is private
        // System.out.println("Total Salary: " + emp.calculateTotal()); // This line will also cause an error because calculateTotal is not accessible
    }
}
