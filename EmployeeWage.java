public class EmployeeWage {
	public static void main(String[] args) {
   	int isPresent = 1;
	int empRatePrHr = 20;
	int empHr = 8;
    double empCheck = Math.floor(Math.random() * 10) % 2;
    System.out.println(empCheck);
    if (empCheck == isPresent) {
		System.out.println("employee is present");
		int perDaySalary = empRatePrHr * empHr;
		System.out.println("Employee per day salary = "+perDaySalary);
	}
    else
		System.out.println("absent");
	}
}
