import controllers.MetodosBusqueda;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        
        MetodosBusqueda mT = new MetodosBusqueda();
        ShowConsole sC = new ShowConsole();

        mT.busquedaLineal(5);
        
        
        
    }
}
