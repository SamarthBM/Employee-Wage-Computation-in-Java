
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		
		int is_present_full = 1;
		int wage_per_hour = 20;
		int working_hour = 0 ;
		
		double EmpCheck = Math.floor(Math.random() * 10) %2;
		
		if (EmpCheck == is_present_full)
		{
			System.out.println("Employee is present");
			working_hour = 8;
		}
		else
		{
			System.out.println("Employee is absent");
			working_hour = 0;
		}
		int Emp_wage = working_hour * wage_per_hour;
		System.out.println("Employee daily wage is " + Emp_wage);
				
	}

}
