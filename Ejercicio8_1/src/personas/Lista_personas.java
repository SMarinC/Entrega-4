package personas;
import java.util.*;

public class Lista_personas {
    Vector lista_personas; 

    public Lista_personas() {
        lista_personas = new Vector();
    }
    public void add_persona(Persona p) {
        lista_personas.add(p);
    }

    public void eliminar_persona(int i) {
        lista_personas.removeElementAt(i);
    }
    public void borrar_lista() {
        lista_personas.removeAllElements();
    }
}
