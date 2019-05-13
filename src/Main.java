import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        //System.out.println("jakieś coś");
        //System.out.println("Hello World!");
        List<Float> lista = new ArrayList<Float>();
        lista.add(1.2F);
        lista.add(2.2F);
        lista.add(3.2F);
        lista.add(4.2F);
        lista.add(5.2F);

        float min = lista.get(2);
        System.out.println(min);
        for (Float lis : lista) {
            if (min > lis) {
                min = lis;
            }
        }
        System.out.println(min);
        int afds;




    }
}
