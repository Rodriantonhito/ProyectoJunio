package proyectojunio;

import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class Moviles {

    //Creacion del ArrayList con las caracteristicas de los moviles

   // int pos = 0;
    Caracteristicas caracteristica;

    /**
     *
     */
    public ArrayList<Caracteristicas> caracteristicas = new ArrayList();
    //Inicializamos un vector en el que guardaremos las marcas de los moviles
    private final String[] moviles = {"Nokia", "Samsung", "Iphone", "Arcatel", "Huawei", "BQ"};

    //Se añaden las caracteristicas al objeto creado.
    void añadirCaracteristicas() {
        caracteristica = new Caracteristicas("Nokia", "Lumia", true, 5);
        caracteristicas.add(caracteristica);
        caracteristica = new Caracteristicas("Samsung", "S6", true, 5);
        caracteristicas.add(caracteristica);
        caracteristica = new Caracteristicas("Iphone", "6", true, 5);
        caracteristicas.add(caracteristica);
        caracteristica = new Caracteristicas("Arcatel", "one touch", true, 4);
        caracteristicas.add(caracteristica);
        caracteristica = new Caracteristicas("Huawei", "Ascent", true, 5);
        caracteristicas.add(caracteristica);
        caracteristica = new Caracteristicas("BQ", "E5", true, 5);
        caracteristicas.add(caracteristica);

    }

    //Creamos un metodo para mostrar el contenido guardado en el vector

    /**
     * 
     * @return 
     */
        public String mostrar() {

        String retorno = "";
        for (int i = 0; i < moviles.length; i++) {

            retorno += i + 1 + ":";
            retorno += moviles[i];
            retorno += '\n';
        }
        return retorno;
    }
/**
 * El metodo hace que suba o
     * @param pos 
     * @param arriba 
 */
    public void subirBajar(int pos, boolean arriba) {
        if (arriba) {
            String posAnt = moviles[pos + 1];
            moviles[pos + 1] = moviles[pos];
            moviles[pos] = posAnt;
        } else {
            String posPos = moviles[pos - 1];
            moviles[pos - 1] = moviles[pos];
            moviles[pos] = posPos;
        }

    }

}
