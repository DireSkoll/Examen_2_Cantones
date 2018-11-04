
package Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manuel Arias & Justin Bogantes
 */
public class ListaCantones {
    
    private List<Canton> cantones;
    
    public ListaCantones(){
        
    }
    
    public Canton MostrarCanton(int codigo) {

        Canton salida = new Canton();
        for (int i = 0; i < cantones.size(); i++) {
            salida = cantones.get(i);
            if (salida.getCodigo()== codigo) {
                return salida;
            }
        }
        return null;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }
}
