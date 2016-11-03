package deqo.emtd;

/**
 * Created by 21409231 on 03/11/2016.
 */
public class Stack implements SimpleStack{
    private int indice;
    private Item pile [];

    public Stack() {
        indice = 0;
    }

    @Override
    public boolean isEmpty() {
        return indice == 0;
    }

    @Override
    public int getSize() {
        return indice;
    }

    @Override
    public void push(Item item) {
        pile[indice] = item;
        indice ++;
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (indice == 0)
            throw new EmptyStackException("pile vide");
        else {
            int i=indice-1;
            Item e = pile[i];
            return e;
        }
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (indice == 0)
            throw new EmptyStackException("pile vide");
        else {
            indice--;
            Item e = pile[indice];
            return e;
        }
    }
}
