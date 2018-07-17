import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio{

    private static Scanner input = new Scanner(System.in );
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Se guarda la opcion del usuario
        while (!salir) {

            System.out.println("1. Agregar Nivel");
            System.out.println("2. Agregar Grado");
            System.out.println("3. Agregar Estudiante ");
            System.out.println("4. Ver Grados en un nivel");
            System.out.println("5. Ver Aplicaciones en un Grado");
            System.out.println("6. Salir");

            try {
                System.out.println("Escribe una de las opciones>>");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1>>");
                        System.out.println("Ingrese el nombre del nivel>>");
                        String nivel = input.next();
                        System.out.println("Ha sido agregado el nivel:"+nivel);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2>>");
                        System.out.println("Ingrese el nombre del nivel ");
                        String nivelygrado = input.next();
                        System.out.println("Ingrese el nombre del grado");
                        String gradoygrado = input.next();
                        System.out.println("Han sido agregado el nivel:"+nivelygrado+"y el grado"+ gradoygrado);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3>>");
                        System.out.println("Ingrese el nombre del nivel");
                        String nivelyestudiante = input.next();
                        System.out.println("Ingrse el nobmre del grado");
                        String gradoyestudiante = input.next();
                        System.out.println("Ingrese el nombre del estudiandte");
                        String estudianteyestudiante = input.next();
                        System.out.println("Ingrese el codigo del estudiante");
                        String codigoyestudiante = input.next();
                        System.out.println("Ha sido agregado el nivel:"+nivelyestudiante+", el grado:"+gradoyestudiante+
                               ", el estudiante:"+estudianteyestudiante+"y el codigo de estudiante:"+codigoyestudiante);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4>>");
                        System.out.println("Ingrese el nombre del nivel ");
                        String nivelUsuario = input.next();
                        int intIndex = nivelUsuario.indexOf("Niveles encontrados");
                        if (intIndex== -1){
                            System.out.println("Palabra encontrada>>");
                        }else {
                            System.out.println("Palabra no encontrada>>"+ intIndex);
                        }
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5>>");
                        System.out.println("Ingrese el nombre del nivel");
                        String nivelopcion5 = input.next();
                        System.out.println("Ingrese el nombre del grado>>");
                        String gradoopcion5 = input.next();
                        System.out.println("Han sido encontrados, el nivel:");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6>>");
                        System.out.println("Vuelva pronto!!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 y 6>>");
                    }
                }   catch (InputMismatchException e){
                       System.out.println("Debes insertar un numero");
                       sn.next();
                }

            }

        }

    }