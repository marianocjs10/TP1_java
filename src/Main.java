import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String opcion="";
        System.out.println(" ");
        System.out.println(" **** BIENVENID@ A NUESTRA APP **** " );
        System.out.println(" " );
        System.out.println( "Indique que operación desea realizar!");
        System.out.println( "1- Calculadora");
        System.out.println( "2- N° Mayor");
        System.out.println( "3- Numero divisible por 2");
        System.out.println( "4- Calcular IVA");
        System.out.println( "5- Escribir del 1 al 100");
        System.out.println( "6- N° divisibles x2 y 3 del 1 al 100");
        System.out.println( "7- N°mayor o igual a 0");
        System.out.println( "8- Adivine la contraseña :)");
        System.out.println( "9- Días laborales");
        System.out.println( "10- Decir si es un N° primo");
        System.out.println( "11- N° aleatorio entre 0 y 100");
        System.out.println( "0- SALIR");
        opcion=sc.nextLine();
        operaciones(opcion);
    }
public static void delay(){
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    public static void operaciones(String opcion){
      
            switch (opcion) {
                case "1":
                    Logica.calcular();
                    delay();
                    menu();
                    break;
                case "2":
                    Logica.numeroMayor();
                    delay();
                    menu();
                case "3":
                    Logica.numDivisiblePorDos();
                    delay();
                    menu();
                case "4":
                    Logica.precioConIva();
                    delay();
                    menu();
                case "5":
                    Logica.centena();
                    delay();
                    menu();
                case "6":
                    Logica.divisibles();
                    delay();
                    menu();
                case "7":
                    Logica.numMayorOigual();
                    delay();
                    menu();
                case "8":
                    Logica.contrasena();
                    delay();
                    menu();
                case "9":
                    Logica.calendario();
                    delay();
                    menu();
                case "10":
                    Logica.numPrimo();
                    delay();
                    menu();
                case "11":
                    Logica.aleatorio();
                    delay();
                    menu();
                case "0":
                    System.out.println("***Usted salió de al APLICACIÓN ***");
                    break;
                    default:
                        System.out.println("Caracter no valido, intente de nuevo");
                        delay();
                        menu();
            }
    }



}