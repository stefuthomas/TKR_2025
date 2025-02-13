package Week5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dao dao = new Dao();

        Student student = new Student();
        student.setName("Stefanos Thomas");
        student.setEmail("Stefanos.Thomas@metropolia.fi");

        List<TimeSpent> timeSpentList = new ArrayList<>();
        TimeSpent timeSpent1 = new TimeSpent();
        timeSpent1.setHomeworkHours(10);
        timeSpent1.setInClassHours(20);
        timeSpent1.setTheoryHours(30);
        timeSpent1.setStudent(student);
        timeSpentList.add(timeSpent1);

        student.setTimeSpentLists(timeSpentList);

        System.out.println(student.toString());

        dao.saveStudent(student);
    }
}