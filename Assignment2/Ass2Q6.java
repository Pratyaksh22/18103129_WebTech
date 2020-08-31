import java.util.Scanner;
public class Ass2Q6{
	public static void main(String args[]){
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number!=1){
			if(number%2==0)
				number=number/2;
			else
				number=3*number+1;
			System.out.println(number);
		}
	}
}