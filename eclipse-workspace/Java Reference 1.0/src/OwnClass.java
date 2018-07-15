import java.util.*;

public class OwnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee[] staff = new Employee[3];
			
			staff[0] = new Employee ("Peter Parker", 75000, 2001, 12, 15);
			staff[1] = new Employee ("Bruce Banner", 50000, 1989, 10, 1);
			staff[2] = new Employee ("Pepper Potts", 40000, 1990, 3, 15);
			
			for (Employee e : staff)
				e.raiseSalary(5);
			
			for (Employee e: staff)
				System.out.println("Name = " + e.getName()
					+ ",salary=" + e.getSalary()
					+ ",hireDay=" +e.getHireDay());
	}

}

class Employee
{
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
		
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary +=raise;
	}

	private String name;
	private double salary;
	private Date hireDay;
}