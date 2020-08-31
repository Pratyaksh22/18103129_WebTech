import java.util.Scanner;
public class Ass2Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements (in range 0-20): ");
        int[] freq = new int[21];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0 || arr[i]>20){
                freq[0]++;
            }
            else{
                freq[arr[i]]++;
            }
        }
        int j=0;
        for(int i=0;i<21;i++){
            for(int k=0;k<freq[i];k++){
                arr[j] = i;
                j++;
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
