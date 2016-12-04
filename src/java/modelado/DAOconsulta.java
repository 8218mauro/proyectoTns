
package modelado;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import uml.Aerolinea;
import uml.Avion;
import uml.Reserva;
import uml.Tarifas;
import uml.Vuelo;
import uml.objCvuelo;

public class DAOconsulta {
    conexion db = new conexion();
    
    public List<objCvuelo> filtarInfoVuelo(int campo){
        List<objCvuelo> datos = new ArrayList<objCvuelo>();
        Connection conn;
        PreparedStatement pst;
        ResultSet res;
        String query = "SELECT *, (avion.nPasajeros- (SELECT COUNT(*) FROM avion, reserva WHERE reserva.cAvion=avion.idAvion AND avion.cAerolinea=1)) AS 'disponibles' FROM tarifas, aerolinea, avion WHERE tarifas.id="+campo+" AND tarifas.cAvion=avion.idAvion AND avion.cAerolinea=aerolinea.idAerolinea";
        //String query ="SELECT *, (avion.nPasajeros- (SELECT COUNT(*) FROM avion, reserva WHERE reserva.cAvion=avion.idAvion AND avion.cAerolinea=1)) AS 'disponibles' FROM tarifas, aerolinea, avion WHERE tarifas.cAerolinea=aerolinea.idAerolinea AND avion.cAerolinea=aerolinea.idAerolinea AND avion.idAvion="+campo+"";
        try {
            Class.forName(db.getDriver());
            conn = DriverManager.getConnection(db.getUrl(),db.getUsuario(),db.getContrasena());
            
            pst = conn.prepareStatement(query);
            res = pst.executeQuery();
            //Aerolinea aerolinea = new Aerolinea();
            
            while(res.next()){
                 datos.add(new objCvuelo(res.getInt("id"), res.getString("nombre"),res.getString("cOrigen"),res.getString("cDestino"),res.getTimestamp("fSalida"),res.getTimestamp("fLlegada"),res.getDouble("precio"),res.getInt("idAvion"),res.getInt("nPasajeros"),res.getInt("disponibles")));
            }
            pst.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {}
        return datos;
    }
    
    public String crearReserva(int idTarifa, int cedulaUsu){
        DAOReserva daoR = new DAOReserva();
        DAOVuelo daoV = new DAOVuelo();
        Reserva res = new Reserva();
        Vuelo v = new Vuelo();
        List<objCvuelo> datos = new ArrayList<objCvuelo>();
        datos = filtarInfoVuelo(idTarifa);
        for(objCvuelo b : datos){
            v.setCoAvion(b.getcAvion());
            v.setcOrigen(b.getcOrigen());
            v.setcDestino(b.getcDestino());
            v.setfLlegada(b.getFllegada());
            v.setfSalida(b.getfSalida());
            v.setaDisponibles(b.getaDisponibles());
            
            res.setcUsuario(cedulaUsu);
            res.setcAvion(b.getcAvion());
            res.setcVuelo(0);
            res.setCosto(cedulaUsu);
            res.setcSilla(cedulaUsu);
            
            daoV.insertar(v);
            daoR.insertar(res);
        }
        return "Se creo una reserva";
    }
}
