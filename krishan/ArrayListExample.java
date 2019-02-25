import java.util.*;

class Employee implements Comparable<Employee>{
	int id;
	String name;

	Employee(int id, String name){

		this.id = id;
		this.name = name;
	}

	public int compareTo(Employee e){
		if(id>e.id){return 1;}
		if(id<e.id){return -1;}
		if(id==e.id){return 0;}
return -1;
	}

}

class ArrayListExample
{
	public static void main(String []z)
	{
		ArrayList<Employee> list=new ArrayList<>();
		Employee e1=new Employee(1,"Krishan");
		Employee e2=new Employee(5,"Bhawesh");
		Employee e3=new Employee(2,"Sarth");
		Employee e4=new Employee(3,"Gulati");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println("Initally ArrayList :-");
		for(Employee e: list){

		System.out.println(""+e.id+" "+e.name);

		}

		Collections.sort(list,Collections.reverseOrder());
		System.out.println("\nAfter sorting on id ArrayList :-");
		for(Employee e: list){

		System.out.println(""+e.id+" "+e.name);

		}

	}
}