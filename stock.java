import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int temp = 0;
       int count = 0;
       int arr[] = {10,0,0};
       for(int i = 0;i<arr.length;i++){
        temp +=arr[i];
       }
       for(int i = 0;i<arr.length;i++){
        if(arr[i] > i){
            temp +=i;
        }
        else{
        count = i-arr[i];
        arr[i] += count;
        temp = temp - count;
        }
        System.out.println("no");
       }
       System.out.println("yes");
    }
}
