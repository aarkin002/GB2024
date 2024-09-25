import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{

    private List<StudentGroup> stream;

    public List<StudentGroup> getStudentGroupList() {
        return stream;
    }

    public void setStudentGroupList(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

}
