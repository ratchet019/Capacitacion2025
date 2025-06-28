import java.util.List;

public class UtilidadesLista {
    public static <T> void addOddElements(List<T> fuente, List<T> destino) {
        for (int i = 1; i < fuente.size(); i += 2) {
            destino.add(fuente.get(i));
        }
    }
}