public class Box<T> {   // сущ-ть Коробка
    private T value;

    public Box() {
        this.value = null;
    }

    public void put(T item) throws IllegalStateException {
        if (this.value != null) {
            throw new IllegalStateException("Коробка уже заполнена!");
        }
        this.value = item;
    }

    public T get() {
        T item = this.value;
        this.value = null;
        return item;
    }

    public boolean isEmpty() {
        return this.value == null;
    }

    @Override
    public String toString() {
        return isEmpty() ? "Коробка пуста" : "Коробка содержит: " + value.toString();
    }

}
