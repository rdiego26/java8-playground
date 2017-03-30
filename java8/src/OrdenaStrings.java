import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("uva");
        palavras.add("morango");
        palavras.add("maracuja");
        palavras.add("abacaxi");

        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);
    }

}
