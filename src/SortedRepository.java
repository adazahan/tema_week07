import java.util.Set;
import java.util.TreeSet;

public class SortedRepository<T> implements IRepository<T> {
    private Set<T> sortedSet = new TreeSet<>();


    public SortedRepository(Set<T> sortedSet) {
        this.sortedSet = sortedSet;
    }

    public SortedRepository() {

    }


    @Override
    public void save(T obj) {
        sortedSet.add(obj);

    }

    @Override
    public void remove(T obj) {
        sortedSet.remove(obj);

    }

    @Override
    public int count() {
        return sortedSet.size();
    }

    @Override
    public Set<T> listAll() {
        return sortedSet;
    }
}
