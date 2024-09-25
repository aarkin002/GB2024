import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final StreamService streamService = new StreamService();
    private final TeacherView teacherView = new TeacherView();

    public void removeTeacherByFIO(String firstName, String lastName, String middleName){
        teacherService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public  List<Teacher> getSortedTeachertudentByFIO(){
        List<Teacher> teacherList = teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(teacherList);
        return  teacherList;
    }
    public List<TeacherGroup> getSortedStreamBySize(){
        return streamService.getSortedStreamBySize();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }
}
