public class Car {
   void showCar(){
    System.out.println("This is a car");
   }
   class Bmw extends Car{
    void showBmw(){
        System.out.println("This is Bmw");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.showCar();
        Bmw b = c.new Bmw();
        b.showBmw();
    }
   }
}
