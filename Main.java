package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> arr=new ArrayList<>();
		arr.add(new Employee("John","ADM"));
		arr.add(new Employee("Adam","CDB"));
		arr.add(new Employee("Selena","EAS"));
		arr.add(new Employee("Brian","CDB"));
		
		Collections.sort(arr,new Sortbyname());
		for(Employee e:arr)
		{
			System.out.println("Employee name:"+e.getname()+" Department:"+e.getdept());	
		}

	}

}
