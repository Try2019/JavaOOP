import model.Student;

public class User {
    public static void main(String[] args){
        Student s=new Student("cxk",20,'m',"123456789");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getID());
    }
}
