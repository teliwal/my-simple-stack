package deqo.emtd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        Stack s =new Stack();
        Item e,b;
        if(s.isEmpty())
            System.out.println("pile vide");
        try{
            e = s.peek();
        }catch (EmptyStackException ex){
            System.out.println("Oulalala");
        }
        e=new Item(1,"diallo");
        s.push(e);
        e=new Item(2,"diallo1");
        s.push(e);
        try {
            b = s.peek();
            e = s.pop();
            e = s.pop();
            b = s.pop();
        }catch (EmptyStackException ex){
            System.out.println("HAHAHAHAHAHAHAHAHAHAH");
        }
    }
}
