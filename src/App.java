import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        
        MetodosBusqueda mT = new MetodosBusqueda();
        //ShowConsole sC = new ShowConsole();

        mT.busquedaLineal(5);
        
        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };
        // Busqueda Juan 
        String name = "Juan";
        Persona resultadoPer = mT.searchPersonByName(personas, name);
        ShowConsole.showPersonaResult(resultadoPer, name);

        // Busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = 
        mT.findPersonaByAge(personas, 25);
        ShowConsole.showPersonaResult(resultadoPer2, 25);

        int valorBuscado = 498; 
        Persona resultadoValor = mT.findPersonValueName(personas, valorBuscado);
        ShowConsole.showPersonaValueResult(resultadoValor, valorBuscado);

    }
}
