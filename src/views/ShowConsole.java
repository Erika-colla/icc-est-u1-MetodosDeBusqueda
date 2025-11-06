package views;

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

}
