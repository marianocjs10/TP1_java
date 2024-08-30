import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Logica {
    private static Scanner sc = new Scanner(System.in); ///preguntar por scaner static

    public static void calcular(){

        int op;
        System.out.println("*** CALCULADORA ***");
        System.out.println("Indique que operación desea realizar");
        System.out.println("1-SUMA 2-RESTA 3-MULTIPLICACION 4-DIVISION 5-MODULO");
        op=sc.nextInt();
        double num1,num2;
        System.out.println("PRIMER N°");
        num1=sc.nextInt();
        System.out.println("SEGUNDO N°");
        num2=sc.nextInt();
        switch(op) {
            case 1:
                double suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;
            case 2:
                double resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                double mult = num1 * num2;
                System.out.println("El resultado es: " + mult);
                break;
            case 4:
                double divs = num1 / num2;
                System.out.println("El resultado es: " + divs);
                break;
            case 5:
                double mod = num1 % num2;
                System.out.println("El resultado es: " + mod);
                break;
        };

    };
    ////REVISAR
    public static void numeroMayor(){
        System.out.println("Ingrese dos n° para compararlos");
        double num1,num2,mayor;
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        System.out.println("El número mayor es: " + mayor);
    }
    public static void numDivisiblePorDos(){

        System.out.print("INGRESE UN N°, PARA COMPROBAR SI ES DIVISIBLE POR 2: ");
        double num = sc.nextDouble();
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es divisible por 2!");
        } else {
            System.out.println("El numero ingresado NO es divisible por 2!");
        }
    }
    public static void precioConIva(){
        System.out.println("CALCULANDO IVA");
        double iva = 1.21;
        double precio = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("El precio con iva es: "+ df.format(precio * iva));
    }
    public static void centena(){
        int numIni = 1;
        int numFin = 100;
       /*while (numIni <= numFin ){
            System.out.println(numIni);
            ++numIni;
        }*/
        int i;
        System.out.println("IMPRIMIENDO LOS NUMEROS ***");
        for (i=1; i <= 100; ++i){
            System.out.print(" {"+ i +"} ");
        }
        System.out.println();
    }
    public static void divisibles(){
        int i;
        System.out.println("IMPRIMIENDO LOS 100 N° DIVISIBLES POR 2 Y 3");
        for (i=1; i <= 100; ++i){
            if((i%2==0) & (i%3==0)) {
                System.out.print(" {"+ i +"} ");
            }
        }
        System.out.println();
    }
    public static void numMayorOigual(){
        int num;

        do {
            System.out.print("COMPROBAR N° > 0 ");
            System.out.println();
            num = Integer.parseInt(sc.nextLine());
        } while (num <= 0);

        System.out.println("El numero ingresado: " + num + " es mayor que 0");
    }

    public static void contrasena(){
        String contrasenaCorrecta = "contraseña", contrasena;
        int intentos = 3;
        boolean acertado = true;

        System.out.println("Bienvenido! Tienes 3 intentos para acceder.");

        while (intentos > 0 && acertado) {

            System.out.print("Ingrese la contraseña: ");
            contrasena = sc.nextLine();

            intentos--;

            if (contrasena.equalsIgnoreCase(contrasenaCorrecta)) {
                System.out.println("Acceso correcto!");
                acertado = false;
            } else {
                System.out.println("Contraseña incorrecta! Te quedan " + intentos + " intentos");
            }
        }

        if (acertado) {
            System.out.println("Lo siento, te quedaste sin intentos!");
        }

    }
    public static void calendario(){


        System.out.println("DÍAS LABORABLES");
        System.out.println("Ingrese un n° del 1 al 7");
        int dia = Integer.parseInt(sc.nextLine());

        while (dia < 1 || dia > 7) {
            System.out.println("Incorrecto! Debe ingresar un numero entre 1 y 7");
            System.out.print("Ingrese nuevamente: ");
            dia = Integer.parseInt(sc.nextLine());
        }

        switch (dia) {
            case 1:
                System.out.println("LUNES ES DIA LABORAL");
                break;
            case 2:
                System.out.println("MARTES ES DIA LABORAL");
                break;
            case 3:
                System.out.println("MIERCOLES ES DIA LABORAL");
                break;
            case 4:
                System.out.println("JUEVES ES DIA LABORAL");
                break;
            case 5:
                System.out.println("VIERNES ES DIA LABORAL");
                break;
            case 6:
                System.out.println("SABADO NO ES DIA LABORAL");
                break;
            case 7:
                System.out.println("DOMINGO NO ES DIA LABORAL");
                break;

        }
    }


    public static void numPrimo(){

        System.out.println("NÚMERO PRIMO ¿?");
        System.out.println("Ingrese un n°");
        int num = Integer.parseInt(sc.nextLine());

        int i = 1, divisores = 0;

        while (i <= num) {
            if (num % i == 0) {
                divisores++;
            }
            i++;
        }

        if (divisores == 2) {  // Evalúo si el num tuvo 2 divisiones (1 y si mismo)
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado NO es primo");
        }

    }



   public static void aleatorio(){
       int numAleatorio = Double.valueOf(Math.random() * 100).intValue();

       int intentos = 0, num = -1;

       System.out.println("Intente adivinar el numero");

       while (num != numAleatorio) {

           System.out.println("Elige un N° entre 0 y 100: ");
           num = sc.nextInt();

           intentos++;

           if (num < numAleatorio) {
               System.out.println("Es muy bajo");
           } else if (num > numAleatorio) {
               System.out.println("Es muy alto");
           } else {
               System.out.println("Correcto! Has adivinado el numero en " + intentos + " intentos");
           }
       }
   }

}




