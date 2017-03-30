import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("uva");
        palavras.add("morango");
        palavras.add("maracuja");
        palavras.add("abacaxi");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach(s -> System.out.println(s));
    }

}
