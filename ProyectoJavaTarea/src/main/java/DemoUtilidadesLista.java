import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoUtilidadesLista {
    public static void main(String[] args) {
        List<Integer> fuente = Arrays.asList(10, 11, 12, 13, 14);
        List<Integer> destino = new ArrayList<>();

        UtilidadesLista.addOddElements(fuente, destino);
        System.out.println("Destino: " + destino); // Debería imprimir [11, 13]
    }
}