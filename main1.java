
import java.util.Scanner;

class Vehicle{
    int ratePerDay;
    int days;
    int calculateRent(int days){
      return (ratePerDay*days);
    }
}
class LuxuryVehicle extends Vehicle{
    int calculateRent(int days){
        System.out.println(super.calculateRent(days)+500);
        return 0;
    }
}

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ratePerDay = sc.nextInt();
        int days = sc.nextInt();
        LuxuryVehicle l = new LuxuryVehicle();
        l.ratePerDay=ratePerDay;
        l.days=days;
        l.calculateRent(3);
        
    }
}
