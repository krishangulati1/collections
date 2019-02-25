import java.util.*;
import java.io.*;

class Rina{
	public static void main(String []z){
		Scanner sc=new Scanner(System.in);
		int number_of_matches=sc.nextInt();
		ArrayList <Integer> list=new ArrayList<>();
		for(int i=0;i<number_of_matches;i++){list.add(sc.nextInt());}

		Collections.sort(list);
		System.out.println("After sorthin Rina scores in asc order");
		for(int i=0;i<number_of_matches;i++){System.out.println(list.get(i));}
	}
}