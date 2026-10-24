import java.util.ArrayList;
class Arraylist
{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add(10);
        a.add("Hardi");
        a.add(10.2f);
        a.add(null);
        a.add(true);

        
        System.out.println(a);
        for(Object o : a)
        {
            System.out.println(o);
        }

        a.remove("Hardi");
        System.out.println(a);
        a.add(3 , "Agola");
        System.out.println(a);
        System.out.println(a.contains(10));


    }
}