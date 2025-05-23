package par_1c321.pkg20250522.francocostantino;

// proyecto -> git -> add
import java.util.Collections;
import java.util.Scanner;

//proyecto -> git  -> commit
//proyecto git -> remote -> push
public class SistemaExpedicionesEspaciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Flota lista = new Flota();

        int opcion;
        do {
            System.out.println("MENU DE GESTION DE EXPEDICIONES ESPACIALES");
            System.out.println("1. Agregar nave ");
            System.out.println("2. Mostrar todas las naves ");
            System.out.println("3. Iniciar exploracion");
            System.out.println("4. Mostrar naves ordenadas por año de lanzamiento(desc)");
            System.out.println("5. Mostrar naves ordenadas por nombre");
            System.out.println("6. Mostrar naves ordenadas por tripulacion (desc)");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = input.nextInt();
            System.out.println("-----------------------------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de nave?");
                    System.out.println("1. Nave de exploracion");
                    System.out.println("2. Carguero");
                    System.out.println("3. Crucero estelar");

                    int tipo = input.nextInt();
                    input.nextLine();
                    switch (tipo) {
                        case 1:
                            System.out.println(" tipo de mision : ");
                            String tipoMision = input.nextLine();
                            System.out.println("Nombre: ");
                            String nombre; 
                            do{
                                nombre = input.nextLine();
                                if (nombre.isEmpty()){
                                    System.out.println("este espacio debe completarse si o si");
                                }
                            }while(nombre.isEmpty());
                            
                            System.out.println("capacidad de tripulacion: ");
                            int capacidadTripulacion = input.nextInt();
                            input.nextLine();
                            System.out.println("anio de lanzamiento: ");
                            int anioLanzamiento = input.nextInt();
                            Nave naveexploracion = new NaveExploracion(tipoMision, nombre, capacidadTripulacion, anioLanzamiento);
                            lista.agregarNave(naveexploracion);
                            break;

                        case 2:
                            System.out.println("capacidad de carga? : ");
                            int capacidadCarga = input.nextInt();
                            input.nextLine();
                            System.out.println("nombre : ");
                            
                            String nombreC;
                            do{
                                nombreC = input.nextLine();
                                if (nombreC.isEmpty()){
                                    System.out.println("este espacio debe completarse si o si");
                                }
                            }while(nombreC.isEmpty());
                            
                            System.out.println("capacidad de tripulacion: ");
                            int capacidadTripulacionC = input.nextInt();
                            input.nextLine();
                            System.out.println("anio de lanzamiento: ");
                            int anioLanzamientoC = input.nextInt();
                            input.nextLine();

                            Nave carguero = new Carguero(capacidadCarga, nombreC, capacidadTripulacionC, anioLanzamientoC);
                            lista.agregarNave(carguero);
                            break;

                        case 3:
                            System.out.println("cantidad pasajeros: ");
                            int cantidadPasajeroscr = input.nextInt();
                            input.nextLine();
                            System.out.println("nombre del crucero");
                            String nombrecr;
                            do{
                                nombrecr = input.nextLine();
                                if (nombrecr.isEmpty()){
                                    System.out.println("este espacio debe completarse si o si");
                                }
                            }while(nombrecr.isEmpty());
                            
                            System.out.println("capacidad de tripulacion: ");
                            int capacidadTripulacioncr = input.nextInt();
                            input.nextLine();
                            System.out.println("anio de lanzamiento: ");
                            int anioLanzamientocr = input.nextInt();
                            input.nextLine();
                            
                            Nave crucero = new CruceroEstelar (cantidadPasajeroscr, nombrecr, capacidadTripulacioncr, anioLanzamientocr);
                            lista.agregarNave(crucero);
                            break;

                        default:
                            System.out.println("");
                            break;
                    }

                    break;

                case 2: //mostrar todas las naves
                    lista.mostrarNaves();
                    break;
                case 3: // Iniciar exploracion
                    lista.iniciarExploracion();
                    break;
                case 4: //Mostrar naves ordenadas por año
                    Collections.sort(lista.getNaves());
                    System.out.println("naves ordenadas por año");
                    lista.mostrarNaves();
                    break;
                case 5: //" Mostrar naves ordenadas por nombre"
                    Collections.sort(lista.getNaves(), new ComparadorNombre());
                    System.out.println("naves ordenadas por nombre;");
                    lista.mostrarNaves();
                            
                    break;
                case 6: //6. Mostrar naves ordenadas por tripulacion (desc)
                    System.out.println("este no salio xD");
                    //1Collections.sort(lista.getNaves(), new ComparadorTripulacion());
                    break;
                case 0:
                    System.out.println("cerrando programa....");
                    break;
                default:
                    System.out.println("opcion incorrecta!!!");
                    break;
            }
            System.out.println("-------------------------------------------------------");
        } while (opcion != 0);

    }

}
