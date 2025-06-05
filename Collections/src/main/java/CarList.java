public interface CarList<T> extends CarCollection<T> {

    T get(int index);

    boolean add(T car);

    boolean add(T car, int index);

    boolean remove(T car);

    boolean removeAt(int index);

    boolean contains(T car);

    int size();

    void clear();
}
