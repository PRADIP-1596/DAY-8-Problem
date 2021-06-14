public class EmployeeWageOops {
	public static void main(String[] args) {
   	int isPresent = 1;
      double empCheck = Math.floor(Math.random() * 10) % 2;
      System.out.println(empCheck);
      if (empCheck == isPresent)
      	System.out.println("present");
      else
      	System.out.println("absent");
	}
}
