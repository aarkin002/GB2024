import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<UserGroup> {

    private int count;
    private final List<UserGroup> stream;

    public StreamIterator(Stream userGroupList) {
        this.count = 0;
        this.stream = userGroupList.getUserGroupList();
    }

    @Override
    public boolean hasNext() {
        return count < stream.size() -1;
    }

    @Override
    public UserGroup next() {
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
