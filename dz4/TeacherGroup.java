import java.util.Iterator;
import java.util.List;

public class TeacherGroup extends UserGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList;

    public List<Teacher> getUserList() {

        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName){
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Teacher> iterator() {

        return new TeacherGroupIterator(this);
    }
}
