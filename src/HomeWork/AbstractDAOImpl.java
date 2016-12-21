package HomeWork;

import sun.swing.BakedArrayList;

import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;

public class AbstractDAOImpl implements AbstractDAO {
    private List<Object> list;

    @Override
    public Object save(Object aSave) {
        list.add(aSave);
        return null;
    }

    @Override
    public void delete(Object aDelete) {
        this.list.remove(aDelete);

    }

    @Override
    public void deleteAll(List list) {
        for (Object t: this.list) {
            for (Object o : list) {
                if (t.equals(o))
                    this.list.remove(t);
            }

        }



    }

    @Override
    public void saveAll(List list) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Object get(long id) {
        return null;
    }
}
