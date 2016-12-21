package HomeWork;

public interface AbstractDAO<T> {
    T save (T);
    void delete(T);


}
