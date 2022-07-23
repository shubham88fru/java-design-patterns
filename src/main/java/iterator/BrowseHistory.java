package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory<T> {
    private final List<T> urls = new ArrayList<>();

    public IIterator<T> createIterator() {
        return new ListIterator(this);
    }

    public void push(T item) {
        this.urls.add(item);
    }

    public T pop() {
        int lastIndex = urls.size() - 1;
        T lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public class ListIterator
            implements IIterator<T> {
        private final BrowseHistory<T> history;
        private int index;
        public ListIterator(BrowseHistory<T> history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public T current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
