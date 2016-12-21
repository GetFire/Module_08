package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class UserDAO<User> extends AbstractDAOImpl {
    private List<User> list = new ArrayList<>();

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
}
