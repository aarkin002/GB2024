import java.util.Comparator;

public class StreamComparator implements Comparator<UserGroup> {

    @Override
    public int compare(UserGroup o1, UserGroup o2) {
        if(o1.getUserList().size() == o2.getUserList().size()){
            return 0;
        }else if(o1.getUserList().size() > o2.getUserList().size()) {
            return 1;
        }else{
            return -1;
        }
    }
}
