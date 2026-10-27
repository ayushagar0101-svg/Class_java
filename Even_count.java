import java.util.Scanner;

public class Even_count {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =1;i<=n;i++){
            if(i%2==0){
                count++;
            }

        }
        System.out.println("The count of even numbers is: " + count);
        sc.close();
    }
}
