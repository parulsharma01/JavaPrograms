import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Employee{
   String fullName;
   Long salary;
   String city;
   String firstName,middleName,lastName;
   
   public Employee(String fullName,Long sal,String city){
   	this.fullName = fullName;
   	this.salary = sal;
   	this.city = city;
   	String[] names = fullName.split(" ");
   	int i = 0;
   	while(i<names.length){
   		if(i==0)
   		firstName = names[i];
   		else if(i==1)
   		middleName = names[i];
   		else
   		lastName = names[i];
   		
   		i++;
   	}
   }
   
   public String toString(){
   	return String.format("%s %d %s",this.fullName,this.salary,this.city);
   }
}
class StreamsLogic{
	public static void main(String ar[]){
	Employee emp1  = new Employee("Parul Sharma",10000L,"Delhi");
	Employee emp2  = new Employee("Govind Arya Sharma",3600L,"Delhi");
	Employee emp3  = new Employee("Parul Govind Arya",4700L,"Mumbai");
	Employee emp4  = new Employee("Geet Govindam",4000L,"Delhi");
		List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4);
		
		System.out.println("All unique firstNames of employees where their salary is less than 5000 and who live in delhi from list are : \n\n"+ list.stream().filter(e -> {
		System.out.println("e>>>"+e);
		boolean retValue=false;
		String ans="";
		if(e.salary<5000&&e.city.equalsIgnoreCase("Delhi")){
			retValue = true;
			ans = String.format("%s %d %s",e.firstName,e.salary,e.city);
		}
                System.out.println("Output>>>>" + ans+"\n");
                return retValue;
		}).collect(Collectors.toList()));
		
	}
}
/*
Output : 

e>>>Parul Sharma 10000 Delhi
Output>>>>

e>>>Govind Arya Sharma 3600 Delhi
Output>>>>Govind 3600 Delhi

e>>>Parul Govind Arya 4700 Mumbai
Output>>>>

e>>>Geet Govindam 4000 Delhi
Output>>>>Geet 4000 Delhi

All unique firstNames of employees where their salary is less than 5000 and who live in delhi from list are : 

[Govind Arya Sharma 3600 Delhi, Geet Govindam 4000 Delhi]



Given a list of objects of following class:
           class Employee{
           String fullName;
           Long salary;
           String city;
           }
          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between.  

*/
