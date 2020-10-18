
public class EmployeeWageComputation {

   public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int isPartTime=1;
		int isFullTime=2;
		int  empRatePerHr=20;
		int empHr;
		int salary=0;
		double empcheck=Math.floor(Math.random() * 10) % 3;
		int intValue=(int) Math.round(empcheck);
			switch (intValue) {
			  case 1:
					empHr=8;  
				salary=empHr * empRatePerHr;
				System.out.println("The Salary is :" + salary);
                                break;			
          			case 2:

            				empHr=12;
	         			salary=empHr * empRatePerHr;
		         		System.out.println("The Salary is :" + salary);
					break;
				default:
				empHr=0;
				System.out.println("The Salary is :" + salary);
					break;
			}
			  


}
}
