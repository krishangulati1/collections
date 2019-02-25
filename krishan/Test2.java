class Test2
{
	public static void main(String []z)
	{
		String s="Krishan Gulati1234 46 kkr 78";
		count1(s);

	}
	public static void count1(String s)
	{
		int in=0,ch=0,sp=0;
		char []c= s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(Character.isLetter(c[i]))
				ch++;
			if(Character.isDigit(c[i]))
				in++;
			if(Character.isSpaceChar(c[i]))
				sp++;
		}
		System.out.println("char"+ch);

		System.out.println("Digit"+in);

		System.out.println("Spacechar"+sp);
	}
}