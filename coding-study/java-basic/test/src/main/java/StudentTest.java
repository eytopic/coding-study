import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Tom",12));
        list.add(new Student("Lisa",15));

        list.remove(1);

        for(Student s:list){
            System.out.println(s.getName()+" "+s.getAge());
        }
    }
}
