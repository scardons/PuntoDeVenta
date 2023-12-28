
package Almacen;

import java.util.ArrayList;

//EN ESTA CLASE SOLO ES PARA ARROJAR EL ARRAY LIST Y ARRASTRARLO A TODOS LOS LUGARES -----------********----------
public class appRopa {
    public static ArrayList<Ropa> inventarioDeRopa = new ArrayList();
    public static String referenciaAConsultar="";
    public static int indiceAConsultar = -1;// -1 PARA QUE NO SE PARE EN NINGUNA PARTE DEL ARRAYLIST
    
    public static void main(String[] args) {
        frmIniciar fi = new frmIniciar();
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
    }
}
