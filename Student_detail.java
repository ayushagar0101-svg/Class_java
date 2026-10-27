public class Student_detail {
    String name;
    int rollno;
    String course;
    Student_detail(String name,int rollno, String course){
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }
    void displayinfo(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(course);
    }
    public static void main(String[] args) {
        Student_detail s1  = new Student_detail("Ayush", 120, "btech");
        Student_detail s2 = new Student_detail("Vishal", 47, "btech");
        s1.displayinfo();
        s2.displayinfo();
    }
}
