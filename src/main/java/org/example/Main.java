package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //entradas
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //pedimos datos a los usuarios

        System.out.print("Ingrese su Nombre:  ");
        nombreCliente=leerDato.nextLine();

        System.out.print("Ingrese su pais: ");
        paisCliente=leerDato.nextLine();

        System.out.print("Ingrese su ano de nacimiento: ");
        anoNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese el mes de su nacimento: ");
        mesNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese su dia de nacimiento: ");
        diaNacimientoCliente=leerDato.nextInt();

        //procesando las entradas

        //1.como calcular la edad del cliente?
        //restar el año acual menos el año de nacimiento

        int edadCliente=2024-anoNacimientoCliente;

        System.out.println("su edad es "+edadCliente);

        //2.decidir con base en la edad si el cliente es mayor de edad

        if(edadCliente>=18) {
            System.out.println("usted es mayor de edad");
            //menu de licores
            //botella de guaro
            //botella de don julio
            //botella de blue label
            //botella de jagger

            System.out.println("menu");
            System.out.println("1...botella aguardiente antioqueño---$150 cop");
            System.out.println("2...botella don julio---$300 cop");
            System.out.println("3...botella blue label---500 cop");
            System.out.println("4...botella jagger---600 cop ");



        }else{

            System.out.println("usted es un niñ@ vayase a mimir");


        }

    }
}