
package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import database.Conexion;
import database.Procedimientos;


public class Marca {
    
    
    public void ConsultarMarcas(StringBuffer buffer){
        
        
            Conexion conexion = new Conexion();
            conexion.conectar();
            ResultSet resultado = conexion.ejecutar(Procedimientos.LeerMarcas);
            conexion.desconectar();
            
            if (resultado == null)
                return;
       try {     
           
            while (resultado.next()){
                buffer.append("<option value=\"").append(resultado.getString("CodigoMarca")).append(" \">").append(resultado.getString("Nombre")).append("</option>");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
