import java.util.*;

class HashMapExample{
	public static void main(String []z){
	Map<Integer,String> hm1=new HashMap<Integer,String>();
	hm1.put(1,"krishan");
	hm1.put(2,"gulati");
	hm1.put(3,"krishan");
	hm1.put(4,"sarth");
	hm1.put(5,"gulati");
    hm1.put(6,"gulati");
    hm1.put(7,"krishan");
    hm1.put(8,"sarth");


	HashMap<String,Integer> hm2=new HashMap<String,Integer>();
	
	for(int i=1;i<(hm1.size()+1);i++){
		hm2.put(hm1.get(i), 1);
		
	}

	int i=0;

	for(Map.Entry me:hm2.entrySet()){
		for(Map.Entry me1:hm1.entrySet()){
		
			if(me.getKey().equals(me1.getValue())){
				me.setValue(++i);
			
			}
		}
		i=0;
	}

	for(Map.Entry me2:hm2.entrySet()){
		System.out.println(""+me2.getKey()+" "+me2.getValue());
	}
	
}

}
