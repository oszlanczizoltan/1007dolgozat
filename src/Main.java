//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Lista lista = new Lista();
    lista.getBejegyzeslista().add(new Bejegyzes("valaki", "ez meg az"));
    lista.getBejegyzeslista().add(new Bejegyzes("mas", "ilyen is olyan is"));

    lista.beolvas();
    lista.add();
    }
}