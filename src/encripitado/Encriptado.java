/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encripitado;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author isaac
 */
public class Encriptado {
    
    
        public String encriptar(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        
            MessageDigest sha256=MessageDigest.getInstance("SHA-256");
            sha256.update(password.getBytes("UTF-8"));
            byte[] digest = sha256.digest();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<digest.length;i++){
                sb.append(String.format("%02x", digest[i]));
            }
            String hash=sb.toString();
            return hash;
        }
}
