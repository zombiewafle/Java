import java.util.*;

public class Estudiantes {
    private String PerteneceNivel;
    private String PerteneceGrado;
    private List<String> nombreEstudiante;
    private List<Integer> codigoEstudiante;

    public Estudiantes(){
        this.PerteneceNivel = " ";
        this.PerteneceGrado = " ";
        this.nombreEstudiante = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public boolean estaVacio() {
                return false;
            }

            @Override
            public boolean contiene(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object[] alArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] alArray(T[] a) {
                return null;
            }

            @Override
            public boolean agregar(String s) {
                return false;
            }

            @Override
            public boolean remover(Object o) {
                return false;
            }

            @Override
            public boolean contieneTodo(Collection<?> c) {
                return false;
            }

            @Override
            public boolean agregarTodo(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean agregarTodo(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removerTodo(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retieneTodo(Collection<?> c) {
                return false;
            }

            @Override
            public boolean limpia() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void agregar(int index, String element) {

            }

            @Override
            public String remover(int index) {
                return null;
            }
        }
    }
}
