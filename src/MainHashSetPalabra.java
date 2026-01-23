import java.util.Set;
import java.util.HashSet;

public class MainHashSetPalabra {
    public static void main(String[] args) {
        Set<String> palabras = new HashSet<>();

        palabras.add("palabra");
        palabras.add("gato");
        palabras.add("perro");
        palabras.add("elefante");
        palabras.add("palabra");
        palabras.add("elefante");

        for (String elemento : palabras) {
            System.out.println(elemento);
        }
    }
}