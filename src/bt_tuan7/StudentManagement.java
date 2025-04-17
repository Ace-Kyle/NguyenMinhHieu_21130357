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
            for (Student s : list) {
                if (s.checkDupplicate(student.getId())){
                    System.out.println("Student with id=%s already exists".formatted(student.getId()));
                    return false;}
            }
            list.add(student);
            return true;
        }
        return false;
    }

    public void addSubject(Subject subject, Student student) {
        student.addSubject(subject);
    }

    public void updateScore(double numScore, String idCourse, String studentId){
        if (list.isEmpty()){
            System.out.println("List of students is empty");
            return;
        }

        for (Student student : list) {
            //find student
            if (student.getId().equals(studentId)) {
                //find subject
                for (Subject subject : student.getListCourse()){
                    if (subject.getId().equals(idCourse)) {
                        subject.setScore(numScore);
                        System.out.println(String.format("[SYSTEM]-Update score of STUDENT=%s, SUBJECT=%s >> %s ",
                                student.getName(),
                                idCourse,
                                numScore));
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
        if (list.isEmpty()) System.out.println("List of students is empty!");
        for (Student student : list) {
            System.out.println(">> %s".formatted(student));
            for (Subject subject : student.getListCourse()){
                System.out.println("--> %s".formatted(subject));
            }
            System.out.println(); //separate students
        }
    }
}
