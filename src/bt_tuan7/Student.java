package bt_tuan7;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String id;
    private String name;
    private Date birthDay;
    private List<Subject> listCourse;

    Student(String id, String name, Date birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        listCourse = new ArrayList<Subject>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public String printInorgeName(){
        return "id=%s, birthDate=%s, listCourse=%s".formatted(id, birthDay, listCourse);
    }

    public boolean checkDupplicate(String id){
        return this.id.equalsIgnoreCase(id);
    }
    public double avgScore() {
        double sum = 0;
        for (Subject subject : listCourse) sum+= subject.getScore();
        return sum/listCourse.size();
    }

    public void updateScore(String idOfSubject, double score) {
        for (Subject subject : listCourse) {
            if (subject.getId().equals(idOfSubject)) {
                subject.setScore(score);
                return;
            }
        }
    }

    public void addSubject(Subject subject) {
        if (subject != null) { listCourse.add(subject); }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public List<Subject> getListCourse() {
        return listCourse;
    }

    public void setListCourse(List<Subject> listCourse) {
        this.listCourse = listCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
