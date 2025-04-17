package bt_tuan7;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> list;

    public StudentManagement() {
        list = new ArrayList<Student>();
    }

    public boolean addStudent(Student student) {
        if (student != null) {
            list.add(student);
            return true;
        }
        return false;
    }
    public void updateScore(double numScore, String idCourse, String studentId){
        for (Student student : list) {
            //find student
            if (student.getId().equals(studentId)) {
                //find subject
                for (Subject subject : student.getListCourse()){
                    if (subject.getId().equals(idCourse)) {
                        subject.setScore(numScore);
                        return;
                    }
                }
            }
        }
    }

    public Student findStudentByNameAndId(String name, String id){
       for (Student student : list) {
           if (student.getName().equals(name) && student.getId().equals(id)) {
               return student;
           }
       }
        System.out.println("Cannot find student with name " + name + " and id " + id);
       return null;
    }
    public void printAll(){
        for (Student student : list) {
            System.out.println("Student > %s".formatted(student));
            for (Subject subject : student.getListCourse()){
                System.out.println("_____Subject > %s".formatted(subject));
            }
        }
    }
}
