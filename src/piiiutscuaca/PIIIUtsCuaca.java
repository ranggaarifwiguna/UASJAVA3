/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca;

import java.sql.SQLException;
import piiiutscuaca.view.CuacaGUI;

/**
 *
 * @author Rangga A.W / 1641809
 */
public class PIIIUtsCuaca {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        CuacaGUI cuaca = new CuacaGUI();
        cuaca.setLocationRelativeTo(null);
        cuaca.setVisible(true);
    }
}
