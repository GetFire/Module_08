package HomeWork;

import java.util.LinkedList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    protected List<T> dataBase = new LinkedList<>();

    @Override
    public T save(T aSave) {
        dataBase.add(aSave);
        return null;
    }

    @Override
    public void delete(T aDelete) {
        dataBase.remove(aDelete);

    }

    @Override
    public void deleteAll(List<T> list) {
       dataBase.removeAll(list);

    }

    @Override
    public void saveAll(List<T> list) {
        dataBase.addAll(list);

    }

    @Override
    public void deleteById(long id) {
        int aId=(int)id;
        dataBase.remove(aId);


    }

    @Override
    public T getByID(long id) {
        int aId=(int) id;
        return dataBase.get(aId);
    }

    public List<T> getDataBase() {
        return dataBase;
    }
}
