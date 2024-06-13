package test;

import javax.swing.UIManager;
import servicios.ComidaServices;
import vista.VtnPrincipal;

public class Test {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    seleccionarLookAndField();
    ComidaServices objComidaServices = new ComidaServices();
    VtnPrincipal objVtnPrincipal = new VtnPrincipal();
    objVtnPrincipal.asociarServicio(objComidaServices);
    objVtnPrincipal.setVisible(true);
  }

  private static void seleccionarLookAndField() {
    for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
      if ("Nimbus".equals(laf.getName())) try {
        UIManager.setLookAndFeel(laf.getClassName());
      } catch (Exception ex) {}
    }
  }
}
