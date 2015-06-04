package proyectojunio;

/**
 *
 * @author Antonio
 */
public class Caracteristicas {

    String marca;
    String modelo;
    boolean camara;
    int pantalla;

    public Caracteristicas(String marca, String modelo, boolean camara, int pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.camara = camara;
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

}
