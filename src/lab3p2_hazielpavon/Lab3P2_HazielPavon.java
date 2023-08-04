package lab3p2_hazielpavon;

import java.util.Scanner;

public class Lab3P2_HazielPavon {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean seguir = true;

        while (seguir) {

            System.out.println("1. Sistema de vehiculos");
            System.out.println("2. Salir");
            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    boolean seguir2 = true;

                    while (seguir2) {
                        System.out.println("1. Agregar Automovil");
                        System.out.println("2. Agregar moto");
                        System.out.println("3. Agregar Bus");
                        System.out.println("4. SModificar un vehiculo");
                        System.out.println("5. Eliminar Vehiculo");
                        System.out.println("6. Listar vehiculos");
                        System.out.println("7. salir");
                        int opvehiculos = leer.nextInt();

                        switch (opvehiculos) {

                            case 1:
                                String placa = "",
                                 parteLertras = "H",
                                 parteNumeros = "";

                                boolean v = true, t = true;
                                System.out.println("Ingrese los 2 caracteres (ya empiza en H) ");
                                parteLertras += leer.next();

                                while (v) {

                                    if (parteLertras.length() > 3) {
                                        System.out.println("Ingreso mas caracteres, solo pueden ser 2 caracteres");
                                        parteLertras = "H";
                                        parteLertras += leer.next();

                                    } else if (parteLertras.length() == 3) {
                                        System.out.println("Ingrese los 4 digitos restantes");
                                        int placa2 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa2);
                                        v = false;
                                    }

                                }

                                while (t) {
                                    if (parteNumeros.length() > 4) {
                                        System.out.println("Ingrese bien la placa");
                                        parteNumeros = "";
                                        int placa3 = leer.nextInt();
                                        parteNumeros += String.valueOf(placa3);
                                        System.out.println(parteNumeros.length());

                                    } else {
                                        t = false;

                                    }
                                }

                                placa = parteLertras + parteNumeros;
                                System.out.println(placa);

                                System.out.println("Ingrese una marca");

                                System.out.println("Ingrese un modelo");

                                System.out.println("Ingrese un tipo");

                                System.out.println("Seleccione un color");

                                System.out.println("Ingrese un ano");

                                System.out.println("Ingrese un tipo de combustible");

                                System.out.println("Ingrese cantidad de puertas");

                                System.out.println("Ingrese el tipo de transmision");

                                System.out.println("Ingrese el numero de asientos");

                                break;

                            case 2:

                                break;

                            case 3:

                                break;

                            case 4:

                                break;

                            case 5:

                                break;

                            case 6:

                                break;

                            case 7:
                                seguir = false;
                                break;

                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;

                        }
                    }
                    break;

                case 2:

                    seguir = false;
                    System.out.println("Saliendo");

                    break;

                default:

                    System.out.println("Ingrese una opcion correcta");

            }

        }

    }

}
