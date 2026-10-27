
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month and year");
        int m = sc.nextInt();
        int year  = sc.nextInt();
        if(m == 1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            System.out.println("31 days");
        }
        else if(m ==4|| m==6 || m==9 || m==11){
            System.out.println("30 days");
        }
        else if(m==2){
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("29 days");
            }
            else {
                System.out.println("28 days");
            }
        }
        else if(m>12 || m<0){
            System.out.println("invalid month");
        }
        sc.close();;
    }
}
