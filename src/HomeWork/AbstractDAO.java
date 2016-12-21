package HomeWork;

public interface AbstractDAO<T> {
    T save (T aSave);
    void delete(T aDelete);


}
