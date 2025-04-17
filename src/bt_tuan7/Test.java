package bt_tuan7;

import java.util.Objects;

class Test {
    public static void main(String[] args) {
        //students
        Student st1 = new Student("101", "Nguyen Van A", new Date(1, 1, 2000));
        Student st2 = new Student("102", "Nguyen Van B", new Date(2, 2, 2001));
        Student st3 = new Student("103", "Nguyen Van C", new Date(3, 3, 2002));
        Student st4 = new Student("104", "Nguyen Van D", new Date(4, 4, 2003));
        Student st5 = new Student("105", "Nguyen Van F", new Date(5, 5, 2004));

        //subjects
        Subject sub1 = new Subject("M01", "Lap trinh nang cao", 9.0 );
        Subject sub2 = new Subject("M02", "Nhap mon tri tue nhan tao", 8.0 );
        Subject sub3 = new Subject("M03", "Cau truc du lieu", 7.0 );
        Subject sub4 = new Subject("M04", "Lap trinh co ban", 8.5 );

        StudentManagement manager = new StudentManagement();
        //add student
        manager.addStudent(st1);
        manager.addStudent(st1); //duplicate
        manager.addStudent(st2);
        manager.addStudent(st3);
        manager.addStudent(st4);
        manager.addStudent(st5);

        //add subject
        manager.addSubject(sub1.getClone(), st1);
        manager.addSubject(sub2.getClone(), st1);
        manager.addSubject(sub3.getClone(), st1);

        manager.addSubject(sub1.getClone(), st2);
        manager.addSubject(sub2.getClone(), st2);
        manager.addSubject(sub4.getClone(), st2);

        manager.addSubject(sub1.getClone(), st3);
        manager.addSubject(sub3.getClone(), st3);
        manager.addSubject(sub4.getClone(), st3);

        manager.addSubject(sub1.getClone(), st4);
        manager.addSubject(sub2.getClone(), st4);
        manager.addSubject(sub4.getClone(), st4);

        manager.addSubject(sub2.getClone(), st5);
        manager.addSubject(sub3.getClone(), st5);
        manager.addSubject(sub4.getClone(), st5);

        manager.printAll();

        //update score and show
        manager.updateScore(10, sub1.getId(), st1.getId());
        System.out.println("========= After udpate score ==========");
        manager.printAll();


    }
}
