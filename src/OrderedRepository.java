import java.util.*;

public class OrderedRepository<T> implements IRepository<T> {
    private List<T> orderedList = new ArrayList<>();

    @Override
    public void save(T obj) {
        orderedList.add(obj);
    }

    @Override
    public void remove(T obj) {
        orderedList.remove(obj);

    }

    @Override
    public int count() {
        return orderedList.size();
    }

    public List<T> listList() {
        return orderedList;
    }

    @Override
    public Set<T> listAll() {
        Set<T> set = new HashSet<T>(orderedList) {
        };
        return set;
    }
}
