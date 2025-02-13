package Week5;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<TimeSpent> timeSpentLists;

    public Student() {
    }

    public Student(int id, String name, String email, List<TimeSpent> timeSpentLists) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.timeSpentLists = timeSpentLists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TimeSpent> getTimeSpentLists() {
        return timeSpentLists;
    }

    public void setTimeSpentLists(List<TimeSpent> timeSpentLists) {
        this.timeSpentLists = timeSpentLists;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", timeSpentLists=" + timeSpentLists +
                '}';
    }
}
