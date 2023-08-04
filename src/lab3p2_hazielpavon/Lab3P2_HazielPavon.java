package lab3p2_hazielpavon;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_HazielPavon {

    static ArrayList vehiculosarr = new ArrayList();

    public static void main(String[] args) throws ParseException {

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

                            case 1: {
                                String placa = "",
                                        parteLertras = "H",
                                        parteNumeros = "",
                                        trans = "",
                                        tipoC = "";
                                boolean v = true,
                                        t = true;
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

                                    } else {
                                        t = false;

                                    }
                                }

                                placa = parteLertras.toUpperCase() + parteNumeros;

                                System.out.println("Ingrese una marca");
                                String marca = leer.next();

                                System.out.println("Ingrese un modelo");
                                String modelo = leer.next();

                                System.out.println("Ingrese un tipo");
                                String tipo = leer.next();

                                Color color;
                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                Date fecha1 = obtenerFechaDelUsuario();

                                System.out.println("Ingrese un tipo de combustible, 1: Diesel, 2: Regular, 3: Super");
                                int tip = leer.nextInt();

                                if (tip == 1) {
                                    trans = "Diesel";
                                } else if (tip == 2) {
                                    trans = "Regular";

                                } else if (tip == 3) {
                                    trans = "Super";
                                } else {
                                    trans = null;
                                }

                                System.out.println("Ingrese cantidad de puertas");
                                int cantp = leer.nextInt();

                                System.out.println("Ingrese el tipo de transmision 1. Manual, 2. Automatico");
                                int tr = leer.nextInt();

                                if (tr == 1) {
                                    trans = "Manual";
                                } else if (tr == 2) {
                                    trans = "Automatico";
                                } else {
                                    trans = null;
                                }

                                System.out.println("Ingrese el numero de asientos");
                                int cantA = leer.nextInt();

                                vehiculosarr.add(new Automovil(tipoC, cantp, trans, cantA, placa, marca, modelo, tipo, fecha1, color));
                                break;
                            }

                            case 2: {
                                String placa = "",
                                        parteLertras = "B",
                                        parteNumeros = "";

                                boolean v = true,
                                        t = true;
                                System.out.println("Ingrese los 2 caracteres (ya empiza en B) ");
                                parteLertras += leer.next();

                                while (v) {

                                    if (parteLertras.length() > 3) {
                                        System.out.println("Ingreso mas caracteres, solo pueden ser 2 caracteres");
                                        parteLertras = "B";
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

                                    } else {
                                        t = false;

                                    }
                                }

                                placa = parteLertras.toUpperCase() + parteNumeros;

                                System.out.println("Ingrese una marca");
                                String marca = leer.next();

                                System.out.println("Ingrese un modelo");
                                String modelo = leer.next();

                                System.out.println("Ingrese un tipo");
                                String tipo = leer.next();

                                Color color;
                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                Date fecha1 = obtenerFechaDelUsuario();

                                System.out.println("Ingresa una velocidad maxima");
                                double velocidad = leer.nextDouble();

                                System.out.println("Ingrese el peso de la moto en kg");
                                double peso = leer.nextDouble();

                                System.out.println("Ingrese el gasto de gasolina en l/km");
                                double gaso = leer.nextDouble();

                                vehiculosarr.add(new Moto(velocidad, peso, gaso, placa, marca, modelo, tipo, fecha1, color));
                                break;
                            }
                            case 3: {
                                String placa = "",
                                        parteLertras = "H",
                                        parteNumeros = "",
                                        trans = "",
                                        tipoC = "";
                                boolean v = true,
                                        t = true;
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

                                    } else {
                                        t = false;

                                    }
                                }

                                placa = parteLertras.toUpperCase() + parteNumeros;

                                System.out.println("Ingrese una marca");
                                String marca = leer.next();

                                System.out.println("Ingrese un modelo");
                                String modelo = leer.next();

                                System.out.println("Ingrese un tipo");
                                String tipo = leer.next();

                                Color color;
                                color = JColorChooser.showDialog(null, "Seleccione un color", Color.RED);

                                Date fecha1 = obtenerFechaDelUsuario();

                                System.out.println("Ingrese la cantidad de pasajeros que puede tener");
                                int cantp = leer.nextInt();

                                System.out.println("Ingrese la cantidad de ejes");
                                int ejes = leer.nextInt();

                                System.out.println("Ingrese la longitud");
                                int longitud = leer.nextInt();

                                vehiculosarr.add(new Bus(cantp, ejes, longitud, placa, marca, modelo, tipo, fecha1, color));
                                break;
                            }

                            case 4:
                               
                                break;

                            case 5:

                                for (int i = 0; i < vehiculosarr.size(); i++) {
                                    System.out.println((i + 1) + ". " + vehiculosarr.get(i));
                                }

                                System.out.println("Ingrese el vehiculo que quiere eliminar");
                                int delete = leer.nextInt() - 1;

                                if (delete >= 0 && delete < vehiculosarr.size()) {
                                    vehiculosarr.remove(delete);

                                    System.out.println("vehiculo eliminado correctamente.");
                                } else {
                                    System.out.println("Ingrese un número válido.");
                                }
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

    public static Date obtenerFechaDelUsuario() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ano del vehiculo en el formato dd/mm/yyyy: ");
        String fechaInput = scanner.nextLine();

        String[] tokens = fechaInput.split("/");
        if (tokens.length != 3) {
            System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
            return obtenerFechaDelUsuario();
        }

        int dia = Integer.parseInt(tokens[0]);
        int mes = Integer.parseInt(tokens[1]);
        int anio = Integer.parseInt(tokens[2]);

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 0) {
            System.out.println("Fecha inválida. Intente nuevamente.");
            return obtenerFechaDelUsuario();
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Fecha inválida. Intente nuevamente.");
            return obtenerFechaDelUsuario();
        } else if (mes == 2) {
            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
            if ((esBisiesto && dia > 29) || (!esBisiesto && dia > 28)) {
                System.out.println("Fecha inválida. Intente nuevamente.");
                return obtenerFechaDelUsuario();
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(fechaInput);
    }
}
