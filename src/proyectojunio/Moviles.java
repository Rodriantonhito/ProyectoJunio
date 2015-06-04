package proyectojunio;

import java.util.ArrayList;

public class Moviles {

    Caracteristicas caracteristica;
    public ArrayList<Caracteristicas> caracteristicas = new ArrayList();

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

    //Inicializamos un vector en el que guardaremos las editoriales de los libros
    private final String[] moviles = {"Nokia", "Samsung", "Iphone", "Arcatel", "Huawei", "BQ"};

    //Creamos un metodo para mostrar el contenido guardado en el vector
    public String Mostrar() {

        String retorno = "";
        for (int i = 0; i < moviles.length; i++) {

            retorno += i + 1 + ":";
            retorno += moviles[i];
            retorno += '\n';
        }
        return retorno;
    }

    public void Subir(int pos) {
        /*
         También dispondrá de un botón
         "Subir" y otro "Bajar" que permitirán al usuario cambiar el orden de los elementos
         del array,subiendo o bajando el elemento indicado en el orden del vector.
         El cambio de orden se debe realizar en un método al que se le indique las 2 posiciones
         que se deben intercambiar del vector.    
         */

        //posicion Siguiente
        String posAnt = moviles[pos - 1];

        //mover la posicion a la posicion siguiente
        moviles[pos - 1] = moviles[pos];
//       
        //la posicion siguiente la movemos a la anterior
        moviles[pos] = posAnt;

        //tenemos que recoger la informacion del siguiente y almacenarlo e el anterior
    }

    public void Bajar(int pos) {

        String posPos = moviles[pos + 1];
        moviles[pos + 1] = moviles[pos];
        moviles[pos] = posPos;
    }

}
