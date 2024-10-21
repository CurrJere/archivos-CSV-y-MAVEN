package com.pruebaCSV;
/*
Ejemplo muy sencillo de acceso a un fichero .CSV con datos de pokemon
No utiliza ningún gestor de dependencias
 */

public class PruebaCSV {
    /**
     * @author jorgecisneros
     */

    public static void main(String[] args) {
        LectorCSV miLecttor = new LectorCSV();
        miLector.leeCSV();
    }
}