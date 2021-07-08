
public class EmpWage {

	public static final int IS_PRESENT_FULL = 1;
	public static final int IS_PRESENT_PART = 2;

	private final int wage_per_hour;
	private final int max_working_hour;
	private final int max_working_days;

	public EmpWage(int wage_per_hour, int max_working_hour, int max_working_days) {

		this.wage_per_hour = wage_per_hour;
		this.max_working_hour = max_working_hour;
		this.max_working_days = max_working_days;
	}

	/* Method to compute employee monthly wage */
	public int computeWage() {
		int working_hour = 0;
		int max_days = 0;
		int emp_monthly_wage = 0;
		int total_working_hour = 0;

		while (max_days <= max_working_days && total_working_hour <= max_working_hour) {

			int EmpCheck = (int) (Math.random() * 10) % 3;

			switch (EmpCheck) {
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
			total_working_hour += working_hour;
			int Emp_daily_wage = working_hour * wage_per_hour;
			System.out.println("Employee daily wage is " + Emp_daily_wage);
			emp_monthly_wage += Emp_daily_wage;
			max_days++;
		}
		return emp_monthly_wage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");

		/* Monthly wage of Jio company */
		EmpWage jio = new EmpWage(20, 100, 20);
		System.out.println("Employee total monthly wage of jio company is " + jio.computeWage());
		System.out.println("================================================");

		/* Monthly wage of Airtel company */
		EmpWage airtel = new EmpWage(50, 100, 20);
		System.out.println("Employee total monthly wage of Airtel company is " + airtel.computeWage());

	}

}
