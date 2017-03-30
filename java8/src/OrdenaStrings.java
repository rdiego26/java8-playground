import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparator = new ComparadorPorTamanho();
        Consumer<String> consumidor = new ImprimeNaLinha();

        palavras.add("uva");
        palavras.add("morango");
        palavras.add("maracuja");
        palavras.add("abacaxi");

        palavras.sort(comparator);
        palavras.forEach(consumidor);
    }

}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {

        if(o1.length() < o2.length())
            return -1;

        if(o1.length() > o2.length())
            return 1;

        return 0;
    }
}