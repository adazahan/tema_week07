import java.util.Set;

public interface IRepository<T> {
    void save(T obj);

    void remove(T obj);

    int count();

    default Set<T> listAll() {
        return null;
    }

}
