package ayudahumanitariamejorada;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class AyudaHumanitariaMejorada {

    
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel(new HiFiLookAndFeel());
        //UIManager.setLookAndFeel(new AcrylLookAndFeel());
        //UIManager.setLookAndFeel(new AeroLookAndFeel());
        //UIManager.setLookAndFeel(new McWinLookAndFeel());
        //UIManager.setLookAndFeel(new MintLookAndFeel());
        //UIManager.setLookAndFeel(new NoireLookAndFeel());
        //UIManager.setLookAndFeel(new TextureLookAndFeel());
        //UIManager.setLookAndFeel(new LunaLookAndFeel());
        
        new AplicacionAyudaH().setVisible(true);
    }
    
}
