import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface IAvalia
{
    List<Boletim> boletins = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    Menu menu = new Menu();
    void cadastraBoletim();
    void procuraBoletim();
    void listaBoletins();
    void mostraBoletim(int escolha);
}
