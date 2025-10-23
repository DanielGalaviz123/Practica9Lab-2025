import java.io.*;
import java.util.*;

public class MisionPosibleMain {
    public static void main(String[] args) {
        Escenario escenario = new Escenario("Nostromo");
        leerConfiguracion(escenario, "configuracion.txt");


        System.out.println("Estado inicial del escenario:");
        System.out.println(escenario);


        Scanner scanner = new Scanner(System.in);
        System.out.print("posicion de la bomba(Renglon Columna): ");
        int renglon = scanner.nextInt();
        int columna = scanner.nextInt();

        Bomba bomba = (Bomba) escenario.getElementoEnPosicion(renglon, columna);
        if (bomba != null) {
            bomba.explotar();
        } else {
            System.out.println("Posicion incorrecta.");
        }


        System.out.println("Estado del escenario despues de la explosion:");
        System.out.println(escenario);


        guardarConfiguracion(escenario, "configuracion.txt");
    }







    public static void leerConfiguracion(Escenario escenario, String nombreArchivo) {
        try (BufferedReader lectorArch = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lectorArch.readLine()) != null) {
                String[] partes = linea.split(" ");
                String tipoElemento = partes[0];
                int renglon = Integer.parseInt(partes[1]);
                int columna = Integer.parseInt(partes[2]);

                switch (tipoElemento) {
                    case "Roca":
                        escenario.agregarElemento(new Roca(escenario, new Posicion(renglon, columna)));
                        break;
                    case "Extraterrestre":
                        escenario.agregarElemento(new Extraterrestre("Alien", escenario, new Posicion(renglon, columna)));
                        break;
                    case "Bomba":
                        int radio = Integer.parseInt(partes[3]);
                        escenario.agregarElemento(new Bomba(escenario, new Posicion(renglon, columna), radio));
                        break;
                    case "Terricola":
                        escenario.agregarElemento(new Terricola("Ripley", escenario, new Posicion(renglon, columna)));
                        break;
                    default:
                        System.out.println("Elemento desconocido: " + tipoElemento);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de configuracion.");
            e.printStackTrace();
        }
    }


    public static void guardarConfiguracion(Escenario escenario, String nombreArchivo) {
        try (BufferedWriter escritorArch = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    Elemento e = escenario.getElementoEnPosicion(i, j);
                    if (e != null) {
                        if (e instanceof Roca) {
                            escritorArch.write("Roca " + i + " " + j + "\n");
                        } else if (e instanceof Extraterrestre) {
                            escritorArch.write("Extraterrestre " + i + " " + j + "\n");
                        } else if (e instanceof Bomba) {
                            Bomba bomba = (Bomba) e;
                            escritorArch.write("Bomba " + i + " " + j + " " + bomba.getRadio() + "\n");
                        } else if (e instanceof Terricola) {
                            escritorArch.write("Terricola " + i + " " + j + "\n");
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo de configuracion.");
            e.printStackTrace();
        }
    }
}