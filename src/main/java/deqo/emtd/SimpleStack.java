package deqo.emtd;

/**
 * Created by 21409231 on 03/11/2016.
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop()  throws EmptyStackException;
}
