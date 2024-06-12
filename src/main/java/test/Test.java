package test;
        
import java.io.File;
import javax.swing.UIManager;
import servicios.ComidaServices;
import vista1.VtnPrincipal;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        seleccionarLookAndField();
        ComidaServices objClienteServices= new ComidaServices();       
        VtnPrincipal objVtnPrincipal= new VtnPrincipal();    
        /*objVtnPrincipal.asociarServicio(objClienteServices);*/
        objVtnPrincipal.setVisible(true);
        
    }
    
    private static void seleccionarLookAndField()
    {
        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
                 } catch (Exception ex) {
            }
        }
    }
    
    
    
}
