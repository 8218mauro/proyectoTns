package modelado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uml.Asiento;

public class DAOAsiento implements operaciones{
    conexion db = new conexion();

    @Override
    public String modificar(Object obj) {
        Asiento a = (Asiento) obj;
        Connection conn;
        PreparedStatement pst;
        String query = "UPDATE asiento set estado=? WHERE cAvion=?";
        String respuesta = "";

        try {
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            pst = conn.prepareStatement(query);
            
            pst.setString(1, a.getEstado());
            pst.setInt(2, a.getcAvion());
            
            int filas = pst.executeUpdate();
            respuesta = "Se modifico la fila "+filas;
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        return respuesta;
    }

    @Override
    public List<Asiento> filtrar(String campo, String criterio) {
        List<Asiento> datos = new ArrayList<Asiento>();
        Connection conn;
        PreparedStatement pst;
        ResultSet res;
        String query = "SELECT * FROM asiento WHERE "+campo+" LIKE '%"+criterio+"%'";
        
        try {
            
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            
            pst = conn.prepareStatement(query);
            res = pst.executeQuery();
            
            while(res.next()){
                datos.add(new Asiento(res.getInt("cAvion"),res.getInt("nAsiento"),res.getString("estado")));
            }
            pst.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        return datos;
    }

    @Override
    public String insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
