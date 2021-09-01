import java.util.Scanner;
import java.util.Random;

public class Sismografo {
    public static void main(String[] args) {
        mostrarMenu();


        int opcion;
        Scanner teclado = new Scanner(System.in);
        try {
            opcion = teclado.nextInt();
        } catch (Exception e) {
            opcion = 10;
        }

        switch (opcion) {
            case 0:
                System.out.println("Adios");
                break;
            case 1:



                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;


            case 10:
                System.out.println("Entrada Incorrecta");
                break;
            default:
                System.out.println("opcion invalida");

        }


    }


    public static void mostrarMenu(){
        System.out.println("Bienvenido al sistema de analisis sismologico de la Onemi");
        System.out.println("Seleccione una de las opciones: ");
        System.out.println("[1] Ingresar Datos");
        System.out.println("[2] Mostrar sismo de mayor magnitud");
        System.out.println("[3] Contar sismos mayores o iguales a 5.0");
        System.out.println("[4] Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("[0] Salir");
    }
    public static double[] llenarArreglo(double[] arreglo){
        Random r = new Random();
        double[] arr= new double [70];
        for (int i=0; i < arr.length; i++){
            arr[i] = r.nextDouble()*9.9+1;
        }
        return arr;
    }
    public static void mostrarArreglo (double[] arreglo){
        System.out.println("El arreglo generado es:  " + arreglo );
    }

    public static double[] buscarMayorSismo(double[] sismos){
        return sismos;

    }
    public static double[] contarSismos( double[] sismos){
        return sismos;
    }

    public static double[] enviarSMS( double[] sismos){
        return sismos;
    }



    }





