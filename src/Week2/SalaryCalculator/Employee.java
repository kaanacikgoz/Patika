package Week2.SalaryCalculator;

public class Employee {
    //Variables
    String name;
    float salary;
    int workHours;
    int hireYear;

    //Constructor method of this class
    Employee(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Calculate tax according to salary
    private float tax() {
        float tax=0;
        if (this.salary>1000) {
            tax = this.salary * 0.03f;
        }
        return tax;
    }

    //Calculate bonus according to work hours
    private float bonus() {
        float bonus=0;
        if (this.workHours>40) {
            bonus = (workHours-40)*30;
        }
        return  bonus;
    }

    //Calculate raise according to work year
    private float raiseSalary() {
        float raise=0;
        int currentYear=2021;
        if (this.hireYear<=currentYear) {
            if (currentYear-this.hireYear<10) {
                raise = this.salary*0.05f;
            } else if (currentYear-this.hireYear>10&&currentYear-this.hireYear<20) {
                raise = this.salary*0.1f;
            } else {
                raise = this.salary*0.15f;
            }
        } else {
            System.out.println("Wrong hire year!");
        }
        return raise;
    }

    //Results print
    void printToString() {
        System.out.print("Name: "+this.name+
                "\nSalary: "+this.salary+
                "\nWork Hours: "+this.workHours+
                "\nHire Year: "+this.hireYear+
                "\nTax: "+tax()+
                "\nBonus: "+bonus()+
                "\nRaise Salary: "+raiseSalary()+
                "\nSalary with Tax and Bonus: "+(this.salary-tax()+bonus())+
                "\nTotal Salary: "+(this.salary-tax()+bonus()+raiseSalary()));
    }

}
