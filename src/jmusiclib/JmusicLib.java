/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmusiclib;

import java.io.*;
import java.sql.SQLException;

/**
 *
 * @author juanjo
 */
public class JmusicLib {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, SQLException {
        
      File mFolder = new File(Library.music_path());
      System.out.println("Directorio por defecto: " + mFolder);
      GUI gui = new GUI();
      gui.main();  
    }
    
}
