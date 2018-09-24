/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encripitado;

import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaac
 */
public class Encripitado {

    /**
     * @param args the command line arguments
     */
    public static SecureRandom sr = new SecureRandom();
    
    public static void main(String[] args) {        
        String fisica = "";
        ObtenerMAC mac = new ObtenerMAC();
        try {
            fisica = mac.mac();
        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(Encripitado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Encriptado encriptado = new Encriptado();
        try {
            System.out.println(encriptado.encriptar("K74-3X7R49T0-5HAC"+fisica));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(Encripitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    
    
}
