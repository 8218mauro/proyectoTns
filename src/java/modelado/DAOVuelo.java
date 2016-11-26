package modelado;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uml.Vuelo;

public class DAOVuelo implements operaciones{
    conexion db = new conexion();
    
    @Override
    public String insertar(Object obj) {
        Vuelo v = (Vuelo) obj;
        Connection conn;
        PreparedStatement pst;
        String query = "INSERT INTO vuelo VALUES(?,?,?,?,?,?,?,?)";
        String respuesta = "";
        
        try {
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            pst = conn.prepareStatement(query);
            
            pst.setInt(1, v.getIdVuelo());
            pst.setInt(2, v.getcReserva());
            pst.setDouble(3, v.getCosto());
            pst.setString(4, v.getcOrigen());
            pst.setString(5, v.getcDestino());
            pst.setDate(6, (Date) v.getfSalida());
            pst.setDate(7, (Date) v.getfLlegada());
            pst.setInt(8, v.getnSilla());

            int filas = pst.executeUpdate();
            respuesta = "Se insertaron "+filas+" elementos";
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta; 
    }

    @Override
    public String eliminar(Object obj) {
        Vuelo v = (Vuelo) obj;
        Connection conn;
        PreparedStatement pst;
        String query = "DELETE FROM vuelo WHERE cReserva=?";
        String respuesta = "";
       
        try {
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            pst = conn.prepareStatement(query);
           
            pst.setInt(1, v.getcReserva());
            
            int filas = pst.executeUpdate();
            respuesta = "Se insertaron "+filas+" elementos";
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        return respuesta;
    }


    @Override
    public List<Vuelo> filtrar(String campo, String criterio) {
        List<Vuelo> datos = new ArrayList<Vuelo>();
        Connection conn;
        PreparedStatement pst;
        ResultSet res;
        String query = "SELECT * FROM vuelo WHERE "+campo+" LIKE '%"+criterio+"%'";
        
        try {
            
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            
            pst = conn.prepareStatement(query);
            res = pst.executeQuery();
            
            while(res.next()){
                datos.add(new Vuelo(res.getInt("idVuelo"),res.getInt("cReserva"),res.getInt("costo"),res.getString("cOrigen"),res.getString("cDestino"),res.getDate("fSalida"),res.getDate("fLlegada"),res.getInt("nSilla")));
            }
            pst.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        return datos;
    }

    @Override
    public String modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
