package Evolution5.problem1;

public abstract class Employee {
 protected int  employeeId;
   protected String employeeName;
protected   double  salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;

    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


   public void calculateSalary(){

    }
}
class PermanentEmployee extends Employee{

    double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

    public PermanentEmployee(double basicPay) {
        this.basicPay = basicPay;
    }


    public void calculateSalary(){

        double pfAmount  = basicPay * 0.12;

        salary = basicPay - (basicPay * 0.12);
        salary = salary;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(basicPay);
    }
}
class TemporaryEmployee extends Employee {

   int hoursWorked,
    hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    public TemporaryEmployee(int hoursWorked, int hourlyWages) {
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }
    public void calculateSalary(){
        salary = hoursWorked * hourlyWages;
        salary = salary;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}

class Loan{
    public double calculateLoanAmount(Employee employeeObj){
        if(employeeObj instanceof PermanentEmployee){
            return employeeObj.salary/15;
        }
        else {
return  employeeObj.salary/10;
        }
    }
}
class  Main {
    public static void main(String[] args) {
        Loan em1 = new Loan();
       double emP =  em1.calculateLoanAmount(new PermanentEmployee(1,"ram",20000));
        double emT =  em1.calculateLoanAmount(new TemporaryEmployee(2,"shyam",10,100));

        System.out.println("Loan Amount for Permanent Employee =>"+emP);
        System.out.println("Loan Amount for Temporary Employee =>"+emT);

    }
}
