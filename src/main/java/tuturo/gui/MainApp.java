/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tuturo.gui;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.*;
import javax.swing.UIManager;
import tuturo.database.MSSQLConnection;
import tuturo.login.*;
import tuturo.gui.*;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import tuturo.othergui.AboutUsGUI;

public class MainApp {

    public static void main(String[] args) {
        FlatRobotoFont.install();
        
        UIManager.put( "defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        UIManager.put( "Button.arc", 20);
        UIManager.put("Component.focusWidth", 0 );
        FlatMacDarkLaf.setup();
        
        EventQueue.invokeLater(() -> {new LoginForm().setVisible(true);
        });
    }
}
