package Midterm_Exam_Practice;

public class employee {
    private double salary;
    protected double bonusPercentage;

    private double calculatebonus(){
        return salary * (bonusPercentage/100);
    }
    public double calculateTotal(){
        return salary + calculatebonus();
    }

    employee(double salary, double bonusPercentage){
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }
}
