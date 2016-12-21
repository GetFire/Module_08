package HomeWork;

import java.util.ArrayList;
import java.util.List;

public interface AbstractDAO<T> {
//    List<T> list;
    T save (T aSave);
    void delete(T aDelete);
    void deleteAll(List<T> list);
    void saveAll (List<T>list);

    void deleteById(long id);
    T get(long id);


}
