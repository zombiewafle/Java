import java.util.ArrayList;
import java.util.List;

public class Grados {
    private List<String> nombreGrado;
    private List<String> PerteneceNivel;
    private int index;

    public Grados() {
        nombreGrado = new ArrayList<>();
        PerteneceNivel = new ArrayList<>();
    }

    public void agregarNombreGrado(List<String> nombrenivel, String strnombrenivel, int index, String nombreGrado) {
        for (int i = 0; i < nombrenivel.size(); i++) {
            if (nombrenivel.get(i).equals(strnombrenivel)) {
                setPerteneceNivel(strnombrenivel);
                this.nombreGrado.add(index, nombreGrado);
                break;
            }
        }
    }

    public List<String> obtenerNombreGradoLista() {
        return this.nombreGrado;
    }

    public String obtenerPerteneceNivel() {
        return this.PerteneceNivel;
    }

    public void establecerperteneceNivel() {
        this.PerteneceNivel = Niveles;
    }
}