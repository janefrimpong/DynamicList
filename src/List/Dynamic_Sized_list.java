package List;

import java.util.Arrays;

public class Dynamic_Sized_list<E> {
    private E[] data;
    private static final int DEFAULT_CAPACITY = 10; // Default initial capacity
    private int size = 0;

    public Dynamic_Sized_list() {
        this(DEFAULT_CAPACITY);
    }

    public Dynamic_Sized_list(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Invalid initial capacity: " + initialCapacity);
        }
        data = (E[]) new Object[initialCapacity];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = Math.max(oldCapacity * 2, minCapacity);
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    public void add(E element) {
        add(size, element);
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = data[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(data, index + 1, data, index, numMoved);
        }
        data[--size] = null;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue = data[index];
        data[index] = element;
        return oldValue;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (obj.equals(data[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }
}
