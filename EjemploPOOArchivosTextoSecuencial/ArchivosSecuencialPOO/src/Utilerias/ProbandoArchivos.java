package Utilerias;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import paquete1.Profesor;
public class ProbandoArchivos {
    public static void main(String[] args) throws FileNotFoundException {
        Profesor profesores[] = {new Profesor("Ivan","Auxiliar")
                                ,new Profesor("David","Principal")
                                ,new Profesor("Agusto","Pato")
                                ,new Profesor("Pablo","Principal")};
        Formatter flujoSalida = new Formatter("MiPrueba.txt");//Flujo salida desde el programa hacia el archivo
        for(Profesor profeAux : profesores){
            flujoSalida.format("%s %s \n", profeAux.obtenerNombre(), profeAux.obtenerTipo());
        }
        flujoSalida.close();
        Scanner flujoEntrada = new Scanner(new File("MiPrueba.txt"));//Flujo de entrada desde el archivo hacia el programa
        Profesor profesores2[] = new Profesor[4];
        int i = 0;
        while(flujoEntrada.hasNext()){
            System.out.println(flujoEntrada.nextLine());
        }
    }
}
