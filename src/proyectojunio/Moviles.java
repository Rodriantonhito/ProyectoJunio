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
    public final String[] moviles = {"Nokia", "Samsung", "Iphone", "Arcatel", "Huawei", "BQ"};

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
     * Lo que hace este metodo es mostrar las distintas marcas cuando se llame en el JDialog
     * @return es la variable retorno que serían los moviles
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
 * El metodo hace que suba o baje la marca del movil.
     * @param pos es la posición en el Array que se encuentran los moviles 
     * @param arriba valor booleano el cual si es verdadero hace que suba de posicion
     * y si es falso hace que baje
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
