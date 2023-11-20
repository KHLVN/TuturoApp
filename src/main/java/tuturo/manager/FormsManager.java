package tuturo.manager;

import tuturo.gui.*;
import com.formdev.flatlaf.extras.*;
import javax.swing.*;
import java.awt.*;

public class FormsManager {
    private MainGUI application;
    private static FormsManager instance;
    public static FormsManager getInstance() {
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }
    
    private FormsManager() {
        
    }
    
    public void initApplication(MainGUI application) {
        this.application = application;
    }
    
    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            FlatAnimatedLafChange.showSnapshot();
            application.setContentPane(form);
            application.revalidate();
            application.repaint();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    } 
}

