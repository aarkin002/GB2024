import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private Stream stream;

    public List<StudentGroup> getSortedFlowBySize(){
        List<StudentGroup> groupList = new ArrayList<>(stream.getStudentGroupList());
        groupList.sort(new StreamComparator());
        return groupList;
    }

}
