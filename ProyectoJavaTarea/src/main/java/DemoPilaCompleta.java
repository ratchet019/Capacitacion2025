import java.util.Arrays;

public class DemoPilaCompleta {
    public static void main(String[] args) {
        PilaCompleta<Integer> pila = new PilaCompleta<>();
        pila.pushAll(Arrays.asList(10, 20, 30));
        pila.popAll();

        System.out.println("no tengo elementos " + pila);
    }
}