public class Odd_sum {
    public static void main(String[] args) {
        int sum=0;
         for(int i =1;i<=100;i++){
            if(i%3==0){
                sum+=i;
            }

        }
        System.out.println("The sum of all odd numbers is: " + sum);
        
    }
}
