package deqo.emtd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack s;
    @Before
    public void setUp() {
        s = new Stack();
    }

    @Test
    public void pileVide() throws Exception {
        assertTrue("pile vide",s.isEmpty());
    }

    @Test
    public void GetSizeVide() throws Exception {
        assertEquals("pile ne contient rien",0,s.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item e = new Item(1,"telly");
        s.push(e);
        assertEquals("pile contient 1 element",1,s.getSize());
    }

    @Test
    public void pileNonVide() throws Exception {
        Item e = new Item(1,"telly");
        s.push(e);
        assertFalse("pile non vide", s.isEmpty());
    }

    @Test
    public void testPeek() throws Exception {
        Item e = new Item(1,"telly");
        s.push(e);
        Item b = s.peek();
        assertEquals("meme entier",1,b.getNb());
    }

    @Test
    public void testPop() throws Exception {
        Item e = new Item(1,"telly");
        s.push(e);
        Item b = s.pop();
        assertEquals("meme entier 2",1,e.getNb());
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekException() throws Exception {
        Item e = s.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() throws Exception {
        Item e = s.pop();
    }
}