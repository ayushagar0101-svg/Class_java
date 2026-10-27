import java.util.*;
public class block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int extra = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>i){
                extra+=(arr[i]-i);
            }
            else{
                int req = i-arr[i];
                if(req<=extra){
                    extra-=req;
                }
                else{
                System.out.println("No");
                return ;
                }
            }
        }
        System.out.println("yes");
    }
}
