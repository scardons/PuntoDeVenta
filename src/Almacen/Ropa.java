
package Almacen;

//-------------------ATRIBUTPS-------------------
public class Ropa {
   // private String porcentaje;
    private String referencia;
    private String articulo;
    private double valorCompra;
    private double valorVenta;
    private boolean disponible;
    private String talla;
    public static final double GANANCIA = 1.3;
    
    //CONSTRUCTOR

    public Ropa(String referencia, String articulo, double valorCompra, boolean disponible, String talla) {
        this.referencia = referencia;
        this.articulo = articulo;
        this.valorCompra = valorCompra;
        this.disponible = disponible;
        this.talla = talla;
        this.valorVenta = this.valorCompra* GANANCIA;
    }

    public Ropa(String referencia, String articulo, double valorCompra, double valorVenta, boolean disponible, String talla) {
        this.referencia = referencia;
        this.articulo = articulo;
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
        this.disponible = disponible;
        this.talla = talla;
    }
    
    //--------GETERS------------------


    

    public String getReferencia() {
        return referencia;
    }

    public String getArticulo() {
        return articulo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTalla() {
        return talla;
    }
    
    //************SETERS**************++


    

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorVentaManual(double valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    public void SetValorVentaAutomatico(double costo){
        this.valorVenta = costo* GANANCIA;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
            
    //***************TO STRING************************

    
    @Override
    public String toString() {
        return "Ropa{" + "referencia=" + referencia + ", articulo=" + articulo + ", valorCompra=" + valorCompra + ", valorVenta=" + valorVenta + ", disponible=" + disponible + ", talla=" + talla + '}';
    }
    
    
}
