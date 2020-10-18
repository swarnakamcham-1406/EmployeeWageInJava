
public class EmployeeWageComputation {

   public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int isPartTime=1;
		int isFullTime=2;
		int empRatePerHr=20;
		int empHr;
		int totalSalary=0;
		int salary=0;
		int numWorkingDays=20;
			for(int day=1;day<=numWorkingDays; day++)
      			{

		double empcheck=Math.floor(Math.random() * 10) % 3;
		int intValue=(int) Math.round(empcheck);
			switch (intValue) {
			  case 1:
					empHr=8;  
				
                                break;			
          			case 2:

            				empHr=12;
	         			
		
				break;
				default:
				         empHr=0;
				break;
			}
			  

				salary=empHr*empRatePerHr;
			System.out.println("The salary is :" + salary);
				
                        totalSalary=totalSalary+salary;
			System.out.println("The Total salary is :" + totalSalary);
}
}
}
