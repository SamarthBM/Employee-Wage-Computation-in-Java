
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		
		final int IS_PRESENT_FULL = 1;
		final int IS_PRESENT_PART = 2;
		
		int wage_per_hour = 20;
		int working_hour = 0 ;
		int max_days = 0;
		int max_working_hour = 100;
		
		int emp_monthly_wage = 0;
		int total_working_hour = 0;
		
		while (max_days <= 20 && total_working_hour <= max_working_hour)
		{
		
		int EmpCheck = (int) (Math.random() * 10) %3;
		
		switch (EmpCheck)
		{
		case IS_PRESENT_FULL:
			System.out.println("Employee is present for full time");
			working_hour = 8;
			break;
			
		case IS_PRESENT_PART:
			System.out.println("Employee is present for part time");
			working_hour = 4;
			break;
			
		default:
			System.out.println("Employee is absent");
			break;
		}
		total_working_hour+=working_hour;
		int Emp_daily_wage = working_hour * wage_per_hour;
		System.out.println("Employee daily wage is " + Emp_daily_wage);
		emp_monthly_wage+=Emp_daily_wage;
		
		max_days++;
	
	}
		System.out.println("--------------------------------------------------");
		System.out.println("Employee total monthly wage is " + emp_monthly_wage);
	}

}
