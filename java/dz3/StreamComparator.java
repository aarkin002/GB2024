import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        if(o1.getStudentList().size() == o2.getStudentList().size()){
            return 0;
        }else if(o1.getStudentList().size() > o2.getStudentList().size()) {
            return 1;
        }else{
            return -1;
        }
    }
}
