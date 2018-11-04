
package aplicacion;

import GUI.ControladorPrincipal;

/**
 *
 * @author Manuel Arias & Justin Bogantes
 */
public class Aplicacion {
    public static ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
    
    public static void main(String args[]){
        String URL = "scr/XML/cantones.xml";
        controladorPrincipal.leerXML(URL);
        controladorPrincipal.mostrarCostaRica();
    }
}
