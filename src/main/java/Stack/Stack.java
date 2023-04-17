package Stack;

public interface Stack<T> {

    void push(T object);

    T pop();

    T peek();

    boolean isEmpty();

    int size();

    public void display();
}
