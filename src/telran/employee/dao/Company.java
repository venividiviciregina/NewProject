package telran.employee.dao;
 
import telran.employee.entity.Employee;
 
public class Company {
     
    private Employee[]employees;
    int companySize;
     
    public Company(int capacity) {
        employees=new Employee[capacity];
        companySize=0;
    }
 
    public int getCompanySize() {
        return companySize;
    }
     
    public boolean addEmployee(Employee employee) {
        if(companySize<employees.length) {
            employees[companySize]=employee;
            companySize++;
            return true;
        }
        return false;
    }
     
    public boolean removeEmployee(Employee employee) {
        for (int i = 0; i < companySize; i++) {
            if(employees[i].equals(employee)) {
                employees[i]=employees[companySize-1];
                companySize--;
                return true;
            }
             
        }
        return false;
    }
     
    public double minSalary() {
        double min= employees[0].calculateSalary();
        for (int i = 0; i < companySize; i++) {
            if(employees[i].calculateSalary()<min) {
                min=employees[i].calculateSalary();
            }
             
        }
        return min;
    }
     
    public double maxSalary() {
        double max=employees[0].calculateSalary();
        for (int i = 0; i < companySize; i++) {
            if(employees[i].calculateSalary()>max) {
                max=employees[i].calculateSalary();
            }
        }
        return max;
    }
     
    public double sumSalary() {
        double sum=0;
        for (int i = 0; i < companySize; i++) {
            sum=sum+employees[i].calculateSalary();
        }
        return sum;
    }
     
     
 
}
public class Company {
	

}




public Employee EmployeeMinSalary();

Employee min = employees;

public Employee[]PoorMen(int num){
	
	
	{
		
		public void display(Employee[]) {
			for(int i = 0; i < employees. length; i++ ) {
			System
			}
			
		
			
			
		}
	}
}