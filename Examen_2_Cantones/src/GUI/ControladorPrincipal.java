
package GUI;


import Datos.Canton;
import Datos.ListaCantones;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author Manuel Arias & Justin Bogantes
 */
public class ControladorPrincipal {
    
    private CostaRica mapa;
    Puntarenas puntarenas;
    Guanacaste guanacaste;
    Cartago cartago;
    Limon limon;
    SanJose sanJose;
    Heredia heredia;
    Alajuela alajuela;
    private ListaCantones miListaCantones;
    private CantonUI miVentana;
    
    public ControladorPrincipal(){
        
    }
    
    public void leerXML(String URL) {
        try {
            //--------Crea el contexto JAXB--------//
            JAXBContext ctx = JAXBContext.newInstance(ListaCantones.class);
            //--------Crea la clase que permite leer archivo XML
            Unmarshaller ums = ctx.createUnmarshaller();

            miListaCantones = (ListaCantones) ums.unmarshal(new File(URL)); //error

        } catch (JAXBException ex) {
            System.out.println(ex.toString());
        }

    }
    
    public void mostrarCantonUI(){
        CantonUI ui = new CantonUI();
        ui.setVisible(true);
    }
    
    public void mostrarCanton(int codigo){
        Canton temporal;
        temporal = miListaCantones.MostrarCanton(codigo);
        miVentana.mostrarCanton(temporal);
    }
    
    public void mostrarCostaRica(){
        mapa = new CostaRica();
        mapa.setVisible(true);
    }
    
    public void mostrarPuntarenas(){
        puntarenas = new Puntarenas();
        puntarenas.setVisible(true);
    }
    
    public void mostrarCartago(){
        cartago = new Cartago();
        cartago.setVisible(true);
    }
    
    public void mostrarGuanacaste(){
        guanacaste = new Guanacaste();
        guanacaste.setVisible(true);
    }
    
    public void mostrarAlajuela(){
        alajuela = new Alajuela();
        alajuela.setVisible(true);
    }
    
    public void mostrarLimon(){
        limon = new Limon();
        limon.setVisible(true);
    }
    
    public void mostrarHeredia(){
        heredia = new Heredia();
        heredia.setVisible(true);
    }
    
    public void mostrarSanJose(){
        sanJose = new SanJose();
        sanJose.setVisible(true);
    }
    
}
