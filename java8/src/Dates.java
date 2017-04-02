import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate olimpiadasRio = LocalDate.of(2099, Month.JANUARY, 25);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Period periodo = Period.between(hoje, olimpiadasRio);
        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        String valorFormatado = proximasOlimpiadas.format(formatador);

        System.out.println(valorFormatado);

        System.out.println(periodo);
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());

    }

}
