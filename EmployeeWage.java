public class EmployeeWage {
	public static void main(String[] args) {
		int isFullTime = 1;
		int isPartTime = 2;
		int empRatePrHr = 20;
		int empHr = 0;
		int perDaySalary = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		System.out.println(empCheck);
		switch ((int)empCheck)
		{
			case 1 :
				empHr = 8;
				System.out.println("Full time Employee");
				perDaySalary = empRatePrHr * empHr;
				System.out.println("Employee per day salary = "+perDaySalary);
				break;
			case 2 :
				empHr = 4;
				System.out.println("Part time Employee");
				perDaySalary = empRatePrHr * empHr;
				System.out.println("Employee per day salary = "+perDaySalary);
				break;
			default :
				empHr = 0;
				perDaySalary = 0;
				System.out.println("Employee per day salary = "+perDaySalary);
		}//switch
	}//main()
}//class
