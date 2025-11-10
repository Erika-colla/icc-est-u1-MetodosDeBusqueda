package views;

import models.Persona;

public class ShowConsole {

    public ShowConsole(){

    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printResult(int result, int busqueda) {
        if (result == -1) {
             System.out.println("Error -> No se encontro el {" + busqueda + "}");
        } else {
             System.out.println("El numero {" + busqueda + "} se encontro en la posicion [" + result + "]");
        }
     }

    public void printResult(Integer result) {
        if(result != null) {
            System.out.println("El {" + result + "} se encontro");
        }else{
            System.out.println("Error -> El numero buscado No se encontro ");
        }
    }

    public static void showPersonaResult(Persona resultadoPer, String name) {
        if(resultadoPer != null) {
            System.out.println("La persona {" + name + "} existe. Edad: " + resultadoPer.getAge());
        } else {
            System.out.println("Error -> La persona {" + name + "} NO se encontro");
        }
    }
    /* 
    Operadores ternarios 
    public static void showPersonaResult(Persona resultadoPer, String name) {
        System.out.println(
            resultadoPer != null 
            ? "Se encontro a " + resultadoPer
            : "No se encontro a un persona con el nombre " + name);

    }
    */
    
    public static void showPersonaResult(Persona resultadoPer, int age) {
        if(resultadoPer != null) {
            System.out.println("La persona {" + resultadoPer.getName() + "} existe. Edad Imapar : " + age);
        } else {
            System.out.println("No hay personas con edades impares. ");
        }
    }

    public static void showPersonaValueResult(Persona resultadoPer, int valor) {

        if(resultadoPer != null) {
            System.out.println("Persona {" + resultadoPer.getName() + "} encontrada con el valor: " + valor);
        } else {
            System.out.println("No se encontró persona con el valor: " + valor);
        }
    }
}
