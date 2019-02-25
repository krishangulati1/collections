			//PRIORITY QUEUE

import java.util.*;

class Books implements Comparable<Books>{
	int id;
	String name,author;

	Books(int id, String name, String author){

		this.id=id;
		this.name=name;
		this.author=author;

	}

	public int compareTo(Books b){

		if(id>b.id){return 1;}
		else if(id==b.id){return 0;}
		else {return -1;}
	}
}

class LinkedListExample{
	public static void main(String []z){

		Books b1=new Books(1,"krishan","bla1 bla1");
		Books b2=new Books(2,"Gulati","bla2 bla2");
		Books b3=new Books(3,"Bhawesh","bla3 bla3");

		LinkedList <Books> lk=new LinkedList<>();
		lk.add(b1);
		lk.add(b2);
		lk.add(b3);
		for(Books b:lk){
			System.out.println(""+b.id+" "+b.name+" "+b.author);			
		}

		lk.remove();

		System.out.println("\nAfter removing from the queue\n");

		for(Books b:lk){
			System.out.println(""+b.id+" "+b.name+" "+b.author);			
		}

	}

}