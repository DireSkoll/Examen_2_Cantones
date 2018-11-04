
package Datos;

/**
 *
 * @author Manuel Arias & Justin Bogantes
 */
public class Canton {
    
    private String nombre;
    private int codigo;
    private int poblacion;
    private double tasaAlfabetizacion;
    private double consumoElectrico;
    private double tasaMatriculaPrimaria;
    private double tasaMatriculaSecundaria;
    private double tasaMatriculaSuperior;
    private double territorio;
    
    public Canton(){
        
    }

    public double getTerritorio() {
        return territorio;
    }

    public void setTerritorio(double territorio) {
        this.territorio = territorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getTasaAlfabetizacion() {
        return tasaAlfabetizacion;
    }

    public void setTasaAlfabetizacion(double tasaAlfabetizacion) {
        this.tasaAlfabetizacion = tasaAlfabetizacion;
    }

    public double getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(double consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getTasaMatriculaPrimaria() {
        return tasaMatriculaPrimaria;
    }

    public void setTasaMatriculaPrimaria(double tasaMatriculaPrimaria) {
        this.tasaMatriculaPrimaria = tasaMatriculaPrimaria;
    }

    public double getTasaMatriculaSecundaria() {
        return tasaMatriculaSecundaria;
    }

    public void setTasaMatriculaSecundaria(double tasaMatriculaSecundaria) {
        this.tasaMatriculaSecundaria = tasaMatriculaSecundaria;
    }

    public double getTasaMatriculaSuperior() {
        return tasaMatriculaSuperior;
    }

    public void setTasaMatriculaSuperior(double tasaMatriculaSuperior) {
        this.tasaMatriculaSuperior = tasaMatriculaSuperior;
    }
    
}
