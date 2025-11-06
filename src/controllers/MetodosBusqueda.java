package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;

    public MetodosBusqueda() {
        System.out.println("\nEstudiante: Erika Collaguazo");
        this.arreglo = new int[] {10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);
        int result1 = busquedaLineal(5);
        showConsole.printResult(result1, 5);

        int result2 = busquedaLinealWhile(-2);
        showConsole.printResult(result2, -2);

        int result3 = busquedaLinealWhile(20);
        showConsole.printResult(result3, 20);

        int result4 = busquedaLinelObj(10);
        showConsole.printResult(result4, 10);

        Integer result5 = busquedaLinelObj(100);
        showConsole.printResult(result5);

        Integer result6 = busquedaLinelObj(10);
        showConsole.printResult(result6);

    }

    

    public int busquedaLineal(int busqueda ) {
        for (int i = 0; i < arreglo.length; i++) {
           
            if (arreglo[i] == busqueda) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile(int busqueda) {
        int i = 0;
        while(i < arreglo.length) {
            if (arreglo[i] == busqueda) {
                return i;
            }
            i++;

        }
        return -1; 
    }

    public Integer busquedaLinelObj(int value) {
        for (int i = 0; i < arreglo.length; i++) {
           
            if (arreglo[i] == value) {
                return arreglo[i];
            }
        }
        return null;
    }
}
