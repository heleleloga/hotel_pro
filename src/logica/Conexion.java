
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Conexion {
    public String db="basereserva";
    public String url="jdbc:mysql://127.0.0.1" + db; 
    public String user="root";
    public String pass="";
    Connection conectar;

    public Conexion() {
        
    }
      public Connection conectar() {
          Connection link=null;
        
          try {
              Class.forName("org.git.mm.mysql.Driver"); 
              link=DriverManager.getConnection(this.url, this.user, this.pass);       
          } catch (ClassNotFoundException | SQLException e) {
              JOptionPane.showConfirmDialog(null, e);
          }
        return link;
        
      }
    
}
