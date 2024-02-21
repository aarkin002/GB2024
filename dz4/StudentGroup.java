import java.util.Iterator;
import java.util.List;

public class StudentGroup extends UserGroup implements Iterable<Student> {
    private List<Student> studentList;

    public List<Student> getUserList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentList.add(new Student(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
