	package telran.employee.controller;

	import telran.employee.entity.*;

	public class EmployeeApp {

		public static void main(String[] args) {
			
			SalesManager sm1= new SalesManager(777, "Denis", "Brovarnyy", 20, 10000, 0.1);
			WageEmployee wm1= new WageEmployee(888, "Misha", "Krug", 50, 12);
			
			System.out.println(sm1.calculateSalary());
			System.out.println(wm1.calculateSalary());
System.out.println();

}
}
	