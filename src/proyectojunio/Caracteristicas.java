package proyectojunio;

/**
 *
 * @author Antonio
 */
public class Caracteristicas {

    private String marca;
    private String modelo;
    private boolean camara;
    private int pantalla;

    /**
     *Constructor de las caracteristicas del movil
     * @param marca 
     * @param modelo
     * @param camara
     * @param pantalla pulgadas de la pantalla
     */
    public Caracteristicas(String marca, String modelo, boolean camara, int pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.camara = camara;
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "Marca= " + marca +"\n"+ "modelo=" + modelo + "\n"+ "camara=" + camara +"\n"+"pantalla=" + pantalla; 
    }
    /**
     *
     * constructor vacio
     */
    public Caracteristicas() {
    }

    /**
     * Nos da la marca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *Muestra la marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *Nos da el modelo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *Muestra el modelo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *Nos dice si tiene camara o no
     * @return
     */
    public boolean isCamara() {
        return camara;
    }

    /**
     *Muestra si tiene camara o no
     * @param camara
     */
    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    /**
     *Nos da la medida de la pantalla
     * @return
     */
    public int getPantalla() {
        return pantalla;
    }

    /**
     *Muestra la medida de la pantalla
     * @param pantalla
     */
    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

}
