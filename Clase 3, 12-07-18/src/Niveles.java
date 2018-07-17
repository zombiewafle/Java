import java.util.*;

public class Niveles {
    private List<String> nombrenivel;

    public Niveles(){
        nombrenivel = new ArrayList<String>();
    }
    public void agregarNombrealNivel(int index, String nombrenivel){
        this.nombrenivel.add(index, nombrenivel);
    }
    public List<String> regresarNombreNivel(){
        return this.nombrenivel;
    }
}