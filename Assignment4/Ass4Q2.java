class Ass4Q2{
	public static void main(String[] args)
	{
		int number=-1;
		byte b=(byte)number;
		int no=b;
		char c=(char)b, c1=(char)no;
		int finalnumber=c;
		System.out.println("Initial Integer:"+number);
		System.out.println("Byte: "+b+" "+no+" "+c1);
		System.out.println("Character: "+c);
		System.out.println("Final Integer:"+finalnumber);

	}
}