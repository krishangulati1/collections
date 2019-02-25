import java.util.*;
import java.io.*;

/*he CSKs have played “n” matches so far in IPLs. Given the number of matches “n” that CSK has played and their 
team score in the matches as a list, write a program to find the total runs and the average
runs scored by the team in all “n” matches.*/

class csk
{
    public static void main(String []z){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        ArrayList <Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            
            list.add(sc.nextInt());
            
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=list.get(i);
        }
        
        System.out.println(sum);
        System.out.println(sum/n);
        
    }
}

/**
*Input Format:
*First line of the input is an integer “n” that corresponds to the number of matches played by CSK.
*Next “n” lines contains an integer in each line, that corresponds to the runs scored by CSK in each of the “n” matches.
 
*Output Format:
*Output should print in the first line the integer that gives the total runs scored by CSK in the matches.
*In the second line, print a float value that gives the average runs.
 **/