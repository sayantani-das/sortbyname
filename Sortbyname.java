package collectionframework;

import java.util.Comparator;

public class Sortbyname implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2)
	{
		String s1=e1.getname();
		String s2=e2.getname();
		return s1.compareTo(s2);
	}

}
