import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The all even nubers are: ");
        for(int i =1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
        sc.close();
    }
}