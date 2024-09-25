package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;


import java.util.List;

public class StudyGroupService {
    private int id;

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        this.id = id + 1;
        StudyGroup studyGroup = new StudyGroup(teacher, studentList, id);
        return studyGroup;
    }
}
