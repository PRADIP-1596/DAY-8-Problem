  GNU nano 5.6.1                  EmployeeWage.java                   Modified






public class EmployeeWage {
	public static final int isFullTime = 1;
        public static final int isPartTime = 2;
	public static void main(String[] args) {
		int empRatePrHr = 20;
		int empHr = 0;
		int perDaySalary = 0;
		int mothWorkingDay = 20;
		int monthlySalary = 0;
		for (int i = 1;i <= mothWorkingDay;i++)
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck)
			{
				case isFullTime :
					empHr = 8;
					break;

				case isPartTime :
					empHr = 4;
					break;
				default :
					empHr = 0;
					break;

			}//switch
			perDaySalary = empRatePrHr * empHr;

			monthlySalary = perDaySalary + monthlySalary;

		}//forloop
		System.out.println("Monthly salary: "+monthlySalary);

	}//main()
}//class
