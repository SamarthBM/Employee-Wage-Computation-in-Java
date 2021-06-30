
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		
		int is_present_full = 1;
		double EmpCheck = Math.floor(Math.random() * 10) %2;
		
		if (EmpCheck == is_present_full)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
				
	}

}
