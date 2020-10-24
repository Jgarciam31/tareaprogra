/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Jose1
 */
public class Procedimientos {
    public static String LeerCategorias= "call ListaCaterias()";
    public static String LeerMarcas= "call ListaMarcas()";
    public static String ObtenerProductoPorCodigo= "call ObtenerProductoPorCodigo($)";
    public static String MostraProducto= "call MostrarProducto()";
    public static String EliminarProducto= "call EliminarProducto($)";
    public static String AutualizarProducto= "call AutorizarProducto($)";
    public static String CrearProducto= "call CrearProducto($)";
    public static String MostrarProductos;
}
