import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<UserGroup>{

    private List<UserGroup> stream;

    public List<UserGroup> getUserGroupList() {
        return stream;
    }

    public void setUserGroupList(List<UserGroup> stream) {

        this.stream = stream;
    }

    @Override
    public Iterator<UserGroup> iterator() {

        return new StreamIterator(this);
    }

}
