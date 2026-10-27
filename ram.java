class Student_person {
    private String name;
    private int age;

     Student_person(String name,int age) {
        this.name = name;
        this.age = age;

    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
    class Person extends Student_person{
        private int rollno;

        Person(int rollno){
            super("Ram",12);
            this.rollno=rollno;
        }
        void display(){
            super.display();
            System.out.println(rollno);
        }
    }
    public class ram{
        public static void main(String[] args) {
            Student_person s = new Student_person("Alice", 20);
            Person p = new Person(101);
            s.display();
            p.display();
        }
    
}
