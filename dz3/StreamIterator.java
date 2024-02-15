import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;
    private final List<StudentGroup> stream;

    public StreamIterator(Stream studentGroupList) {
        this.count = 0;
        this.stream = studentGroupList.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return count < stream.size() -1;
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        count++;
        return stream.get(count);
    }

    @Override
    public void remove() {
        stream.remove(count);
    }
}
