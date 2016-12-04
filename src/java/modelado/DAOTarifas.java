/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uml.Aerolinea;
import uml.Avion;
import uml.Tarifas;

/**
 *
 * @author MAURICIO
 */
public class DAOTarifas implements operaciones{
    conexion db = new conexion();
    
    @Override
    public String insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tarifas> listar() {
        List<Tarifas> datos = new ArrayList<Tarifas>();
        Connection conn;
        PreparedStatement pst;
        ResultSet res;
        String query = "SELECT * FROM tarifas, aerolinea WHERE tarifas.cAerolinea=aerolinea.idAerolinea and tarifas.costo >= '' and tarifas.costo <= '' ";
        
        try {
            
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            
            pst = conn.prepareStatement(query);
            res = pst.executeQuery();
            
            Aerolinea aerolinea = new Aerolinea();
            aerolinea.setIdAerolinea(res.getInt("cAerolinea"));
            aerolinea.setNombre("nombre");
            
            while(res.next()){
                 //datos.add(new Tarifas(aerolinea,res.getString("cOrigen"),res.getString("cDestino"),res.getTimestamp("fSalida"),res.getTimestamp("fLlegada"),res.getDouble("precio")));
            }
            pst.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        
        return datos;
    }
    
    public List<Tarifas> filtrarPorFecha(Timestamp campo) {
        
        List<Tarifas> datos = new ArrayList<Tarifas>();
        Connection conn;
        PreparedStatement pst;
        ResultSet res;
        String query = "SELECT * FROM  tarifas, aerolinea WHERE tarifas.cAerolinea=aerolinea.idAerolinea AND tarifas.fSalida>='"+campo+"'";
        
        try {
            
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            
            pst = conn.prepareStatement(query);
            res = pst.executeQuery();
            //Aerolinea aerolinea = new Aerolinea();
            
            while(res.next()){
                //aerolinea.setIdAerolinea(res.getInt("cAerolinea"));
                //aerolinea.setNombre(res.getString("nombre"));
                 datos.add(new Tarifas(res.getInt("id"),new Aerolinea(res.getInt("cAerolinea"),res.getString("nombre")),res.getString("cOrigen"),res.getString("cDestino"),res.getTimestamp("fSalida"),res.getTimestamp("fLlegada"),res.getDouble("precio"),res.getInt("cAvion")));
            }
            pst.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        
        return datos;
    }
    
     public List<Tarifas> filtrarPorCosto(String costoInicial, String costoFinal) {
        
        List<Tarifas> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet res;
        String query = "SELECT * FROM tarifas, aerolinea WHERE tarifas.cAerolinea=aerolinea.idAerolinea AND tarifas.precio>='"+costoInicial+"'  and  tarifas.precio<='"+costoFinal+"'";
        
        try {
            
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            
            pst = conn.prepareStatement(query);
            res = pst.executeQuery();
            //Aerolinea aerolinea = new Aerolinea();
            
            while(res.next()){
                //aerolinea.setIdAerolinea(res.getInt("cAerolinea"));
                //aerolinea.setNombre(res.getString("nombre"));
                 datos.add(new Tarifas(res.getInt("id"),new Aerolinea(res.getInt("cAerolinea"),res.getString("nombre")),res.getString("cOrigen"),res.getString("cDestino"),res.getTimestamp("fSalida"),res.getTimestamp("fLlegada"),res.getDouble("precio"),res.getInt("cAvion")));
            }
            pst.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        
        return datos;
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
