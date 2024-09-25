package controller;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();


    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }


    public void getAllStudent(){
        List<User> userList =  service.getAllStudent();
        for(User user:userList){
            view.printOnConsole((Student) user);
        }
    }

    public void createStudyGroup(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ID учителя и нажмите ввод");
        int teacherId = in.nextInt();
        int stopAnswer = -1;
        ArrayList<Integer> studentIds = new ArrayList<>();

        while(stopAnswer == -1){
            System.out.println("Введите ID студента для добавления в группу и нажмите ввод, чтобы закончить введите -1");
            int id = in.nextInt();
            if(id == -1){
                stopAnswer = 0;
            }else{
                studentIds.add(id);
            }
        }

        List<User> teachers =  service.getAllTeachers();
        List<User> students =  service.getAllStudent();
        List<Student> studentList = new ArrayList<>();
        Teacher teacher = null ;
        try{
            for(User t:teachers){
                if (t instanceof Teacher && teacherId == ((Teacher)t).getTeacherId()){
                    teacher = (Teacher) t;
                }
            }for(User s:students){
                if(s instanceof Student && studentIds.contains(((Student) s).getStudentId())){
                    studentList.add((Student) s);
                }
            }if (teacher != null ){
                studyGroupService.createStudyGroup(teacher, studentList);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
