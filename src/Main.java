import java.util.*;
public class Main{
    public static void main(String[] args) {

        Problems p = new Problems();
        String str = "##ayush##jauhari####";
        char dl = '#';
        Vector<String> res = p.splitStrings(str, dl);
        for (String x : res)
        {
            System.out.println(x);
        }
    }
}