
package GUI;

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
    
    public ControladorPrincipal(){
        
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
