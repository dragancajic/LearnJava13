package chapter05.lesson08;

public class Salary {
	
	public static double calculateSalary(int hoursPerWeek,
	                                     double hourlyRate,
	                                     int vacationDays) {
		double salaryPerMonth = hoursPerWeek * hourlyRate * 4;
		System.out.println(salaryPerMonth);
		double salaryPerYear = salaryPerMonth * 12 - vacationDays * 8 * hourlyRate;
		
		return salaryPerYear;
	}
	
	public static void main(String[] args) {
		double anualSalary = calculateSalary(50, 6.0, 0);
		System.out.println(anualSalary);
	}
}
