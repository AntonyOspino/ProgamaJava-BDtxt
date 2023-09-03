package seguridad;

import javax.swing.JOptionPane;
import login.Login;
import paneldegestion.PanelDeGestion;

/**
 *
 * @author tonny
 */
public class ValidarInicioDeSesion {
    public void validarUsuario(String []usuarios, String Usuario, String Password, int intentos, Login login){
        
        boolean encontrado = false;
        String res;
        
        for(int i = 0; i < usuarios.length; i++){
            if(usuarios[i].equalsIgnoreCase(Usuario) && usuarios[i+1].equals(Password)){
                res = "Bienvenido(a) "+Usuario;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                login.setIntentos(0);
                break;
            }
            if(intentos > 2 && encontrado == false){
            JOptionPane.showMessageDialog(null, "3 intentos fallidos, el programa se cerrara", "Inicio de sesion", JOptionPane.ERROR_MESSAGE);       
            System.exit(0);
            }
        }
        
        if(encontrado == false){
            res = "Clave y/o Usuario son incorrectos van "+ intentos +" intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "Inicio de sesion", JOptionPane.ERROR_MESSAGE);       
        }else{
            login.dispose();
            PanelDeGestion pdg = new PanelDeGestion();
            pdg.setVisible(true);
        }
        
    }
}
