package mosh.iterator;

public interface IIterator<T> {
    boolean hasNext();
    T current();
    void next();
}
