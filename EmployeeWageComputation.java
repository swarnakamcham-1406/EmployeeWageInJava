
public class EmployeeWageComputation {

   public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int isPresent=1;
		int  empRatePerHr=20;
		int empHr=8;
		int salary=0;
		double empcheck=Math.floor(Math.random() * 10) % 2;
			if (isPresent == empcheck) {
			   
				salary=empHr * empRatePerHr;
				System.out.println("The Salary is :" + salary);
			}
			else {
				System.out.println("The Salary is :" + salary);
			}
			  


}
}
