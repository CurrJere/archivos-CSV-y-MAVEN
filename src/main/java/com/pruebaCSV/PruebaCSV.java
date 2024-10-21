package com.pruebaCSV;
/*
Ejemplo muy sencillo de acceso a un fichero .CSV con datos de pokemon
No utiliza ningún gestor de dependencias
 */

import java.util.Scanner;

public class PruebaCSV {
    /**
     * @author jorgecisneros
     */

    public static void main(String[] args) {
        //LectorCSV miLector = new LectorCSV();
        //miLector.leeCSV("src/main/resources/datos/pokemon.csv");

        MenuJava miMenu = new MenuJava("src/main/resources/datos/pokemon.csv");
        int seleccion = -1;
        Scanner s = new Scanner(System.in);
        while (seleccion != 0)
        {
            System.out.println("¿Qué quereis hacer con los poekmons? \n 0 - Salor \n 1 - Buscar por tipo \n 2 - Buscar por nombre \n 3 - Buscar por vida \n 4 - Buscaar por nombre full info \n 5 - Listar todos los pokemons");
            if (s.hasNext())
            {
                seleccion = s.nextInt();
            }
            switch (seleccion)
            {
                case 5: miMenu.listaTodos();break;
                default:
            }
        }
        System.out.println("ADIOS");
    }
}