import java.util.Scanner;
public class Ass2Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings (line-seperated): ");
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        boolean equal = true;
        int n1 = s1.length(),n2 = s2.length(), n;
        if(n1<n2){
            n = n1;
        }
        else{
            n = n2;
        }

        int i = 0;
        while(i<n){

            int one = s1.charAt(i), two = s2.charAt(i);
            if(one<two){
                equal = false;
                System.out.println("Smaller string: "+s1);
                System.out.println("Larger string: "+s2);
                break;
            }

            else if(two<one){
                equal = false;
                System.out.println("Smaller string: "+s2);
                System.out.println("Larger string: "+s1);
                break;
            }
            i+=1;
        }

        if(equal){
            if(n1>n){
                System.out.println("Smaller string: "+s2);
                System.out.println("Larger string: "+s1);
            }
            else if(n2>n){
                System.out.println("Smaller string: "+s1);
                System.out.println("Larger string: "+s2);
            }
            else{
                System.out.println(s1 +" and "+ s2 +" are equal");
            }
        }

    }
}
