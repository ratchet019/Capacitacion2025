import java.util.Stack;
import java.util.Collection;

public class PilaCompleta<E> extends Stack<E> {

    public void pushAll(Collection<? extends E> miselementos) {

        for (E elem : miselementos) {
            this.push(elem);
        }

    }

    public void popAll() {

        while (!this.isEmpty()) {

             System.out.println("Eliminando: " + this.pop());

        }

    }
}