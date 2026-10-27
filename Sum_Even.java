import java.util.Scanner;

public class Sum_Even {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }

        }
        System.out.println("The sum of all even numbers is: " + sum);
        sc.close();
    }
}
