package feb17;
//creating employee class
public class Employee {
	//problem 1
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;
    //double transportallowance
    public Employee(long Id, String Name, String Address, long Phone) {
    //overload constructor
        this.employeeId = Id;
        this.employeeName = Name;
        this.employeeAddress = Address;
        this.employeePhone = Phone;
        //this.basicSalary=Salary;
    }
    	//method for calculating salary
    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println("Salary of " + employeeName + " is: " + salary);
    }
    // method for calulating salary
    void calculateTransportAllowance() {
        double transportAllowance = 0.10 * basicSalary;
        System.out.println(employeeName + "Transport Allowance is: "  + transportAllowance);
    }
}
	//deriving Manger class from Employee class
class Manager extends Employee { //child class of Employee class
    public Manager(long Id, String Name, String Address, long Phone, double Salary) {
        super(Id, Name, Address, Phone);
        super.basicSalary = Salary;
      }
    void calculateTransportAllowance() {
        double transportAllowance = 15 * basicSalary/100;
        System.out.println( employeeName + "Transport Allowance is: "   + transportAllowance);
    }
}
  	// deriving Trainee class from Employee class

class Trainee extends Employee {
    public Trainee(long Id, String Name, String Address, long Phone, double Salary) {
        super(Id, Name, Address, Phone);
        super.basicSalary = Salary;
    }
}

