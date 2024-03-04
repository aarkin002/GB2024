package model;

import java.util.List;

public class StudyGroup {
    int id;
    Teacher teacher;
    List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList, int id) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
