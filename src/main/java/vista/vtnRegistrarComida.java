package vista;

import java.util.ArrayList;
import java.util.List;
import modelos.Comida;
import modelos.Restaurante;
import modelos.TipoComida;
import servicios.ComidaServices;
import utilidades.Utilidades;

/**
 *
 * @author EdersonMunoz
 */
public class vtnRegistrarComida extends javax.swing.JFrame {

  private final ComidaServices objComidaServices;

  private ArrayList<TipoComida> listTipoComida = new ArrayList<TipoComida>();
  private ArrayList<Restaurante> listRestaurante = new ArrayList<Restaurante>();

  public vtnRegistrarComida(ComidaServices objComidaServices) {
    initComponents();
    this.objComidaServices = objComidaServices;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPanelInferior = new javax.swing.JPanel();
    jLabelAuthor = new javax.swing.JLabel();
    jPanelSuperior = new javax.swing.JPanel();
    jLabelTituloRegistrarComida = new javax.swing.JLabel();
    jPanelCentral = new javax.swing.JPanel();
    jLabelNombre = new javax.swing.JLabel();
    jTextFieldNombre = new javax.swing.JTextField();
    jButtonRegistrar = new javax.swing.JButton();
    jTextFieldCodigo = new javax.swing.JTextField();
    jTextFieldCantidadIngredientes = new javax.swing.JTextField();
    jTextFieldPrecio = new javax.swing.JTextField();
    jLabelCodigo = new javax.swing.JLabel();
    jLabelTipoComida = new javax.swing.JLabel();
    jLabelRestaurante = new javax.swing.JLabel();
    jLabelCantidadIngredientes = new javax.swing.JLabel();
    jLabelPrecio = new javax.swing.JLabel();
    jComboBoxRestaurante = new javax.swing.JComboBox<>();
    jComboBoxTipoComida = new javax.swing.JComboBox<>();
    jLabelSeleccionRestaurante = new javax.swing.JLabel();
    jLabelSeleccionTipoComida = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanelInferior.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jLabelAuthor.setText("Desarrollado por inform�tica III");

    javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(
      jPanelInferior
    );
    jPanelInferior.setLayout(jPanelInferiorLayout);
    jPanelInferiorLayout.setHorizontalGroup(
      jPanelInferiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelInferiorLayout
            .createSequentialGroup()
            .addContainerGap(246, Short.MAX_VALUE)
            .addComponent(jLabelAuthor)
            .addContainerGap(247, Short.MAX_VALUE)
        )
    );
    jPanelInferiorLayout.setVerticalGroup(
      jPanelInferiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanelInferiorLayout
            .createSequentialGroup()
            .addContainerGap(20, Short.MAX_VALUE)
            .addComponent(jLabelAuthor)
            .addGap(20, 20, 20)
        )
    );

    getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

    jPanelSuperior.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jLabelTituloRegistrarComida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabelTituloRegistrarComida.setForeground(new java.awt.Color(0, 51, 153));
    jLabelTituloRegistrarComida.setText("Registrar comida");

    javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(
      jPanelSuperior
    );
    jPanelSuperior.setLayout(jPanelSuperiorLayout);
    jPanelSuperiorLayout.setHorizontalGroup(
      jPanelSuperiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelSuperiorLayout
            .createSequentialGroup()
            .addGap(199, 199, 199)
            .addComponent(jLabelTituloRegistrarComida)
            .addContainerGap(302, Short.MAX_VALUE)
        )
    );
    jPanelSuperiorLayout.setVerticalGroup(
      jPanelSuperiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelSuperiorLayout
            .createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jLabelTituloRegistrarComida)
            .addContainerGap(32, Short.MAX_VALUE)
        )
    );

    getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

    jPanelCentral.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );
    jPanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelNombre.setForeground(new java.awt.Color(0, 0, 102));
    jLabelNombre.setText("Nombre:");
    jPanelCentral.add(
      jLabelNombre,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 31, -1, -1)
    );
    jPanelCentral.add(
      jTextFieldNombre,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 260, -1)
    );

    jButtonRegistrar.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/recursos/grabar.png"))
    ); // NOI18N
    jButtonRegistrar.setText("Registrar");
    jButtonRegistrar.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButtonRegistrarActionPerformed(evt);
        }
      }
    );
    jPanelCentral.add(
      jButtonRegistrar,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, -1)
    );
    jPanelCentral.add(
      jTextFieldCodigo,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 260, -1)
    );
    jPanelCentral.add(
      jTextFieldCantidadIngredientes,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 260, -1)
    );
    jPanelCentral.add(
      jTextFieldPrecio,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 260, -1)
    );

    jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelCodigo.setForeground(new java.awt.Color(0, 0, 102));
    jLabelCodigo.setText("Codigo:");
    jPanelCentral.add(
      jLabelCodigo,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20)
    );

    jLabelTipoComida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelTipoComida.setForeground(new java.awt.Color(0, 0, 102));
    jLabelTipoComida.setText("Tipo de comida:");
    jPanelCentral.add(
      jLabelTipoComida,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1)
    );

    jLabelRestaurante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelRestaurante.setForeground(new java.awt.Color(0, 0, 102));
    jLabelRestaurante.setText("Restaurante:");
    jPanelCentral.add(
      jLabelRestaurante,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1)
    );

    jLabelCantidadIngredientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelCantidadIngredientes.setForeground(new java.awt.Color(0, 0, 102));
    jLabelCantidadIngredientes.setText("Cantidad de ingredientes:");
    jPanelCentral.add(
      jLabelCantidadIngredientes,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1)
    );

    jLabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelPrecio.setForeground(new java.awt.Color(0, 0, 102));
    jLabelPrecio.setText("Precio:");
    jPanelCentral.add(
      jLabelPrecio,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1)
    );

    jComboBoxRestaurante.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jComboBoxRestauranteActionPerformed(evt);
        }
      }
    );
    jPanelCentral.add(
      jComboBoxRestaurante,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 120, -1)
    );

    jComboBoxTipoComida.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jComboBoxTipoComidaActionPerformed(evt);
        }
      }
    );
    jPanelCentral.add(
      jComboBoxTipoComida,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 120, -1)
    );

    jLabelSeleccionRestaurante.setText("SelecccionRestaurante");
    jPanelCentral.add(
      jLabelSeleccionRestaurante,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1)
    );

    jLabelSeleccionTipoComida.setText("SeleccionTipoComida");
    jPanelCentral.add(
      jLabelSeleccionTipoComida,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1)
    );

    getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButtonRegistrarActionPerformed
    String nombre, codigo, tipoComida, restaurante;
    Integer cantidadIngredientes;
    Float precio = 0.0f;

    // Se capturan los datos desde los campos de texto del formulario
    nombre = jTextFieldNombre.getText();
    codigo = jTextFieldCodigo.getText();
    tipoComida = jComboBoxTipoComida.getSelectedItem().toString();
    restaurante = jComboBoxRestaurante.getSelectedItem().toString();
    cantidadIngredientes =
      Integer.parseInt(jTextFieldCantidadIngredientes.getText());
    precio = Float.parseFloat(jTextFieldPrecio.getText());
    Comida objComida = new Comida(
      1,
      restaurante,
      codigo,
      nombre,
      tipoComida,
      cantidadIngredientes,
      precio
    );

    if (this.objComidaServices.consultarSiExisteComida(codigo)) {
      Utilidades.mensajeError(
        "Error, el codigo de la comida ya se encuentra registrado",
        "Error al registrar la comida"
      );
    } else {
      Comida objComidaCreado =
        this.objComidaServices.registrarComida(objComida);
      Utilidades.mensajeExito(
        "Comida registrada exitosmente",
        "Comida registrada"
      );
      System.out.println(objComidaCreado);
      limpiarCampos();
    }
  } //GEN-LAST:event_jButtonRegistrarActionPerformed

  private void jComboBoxRestauranteActionPerformed(
    java.awt.event.ActionEvent evt
  ) { //GEN-FIRST:event_jComboBoxRestauranteActionPerformed
    // captura el elemento seleccionado en el combo box
    String restaurante = jComboBoxRestaurante.getSelectedItem().toString();

    // Se busca en la lista de restaurantes el nombre del restaurante
    this.listRestaurante.forEach((Restaurante objRestaurante) -> {
        if (
          objRestaurante.getIdRestaurante() == Integer.parseInt(restaurante)
        ) {
          jLabelSeleccionRestaurante.setText(objRestaurante.getNombre());
        }
      });
  } //GEN-LAST:event_jComboBoxRestauranteActionPerformed

  private void jComboBoxTipoComidaActionPerformed(
    java.awt.event.ActionEvent evt
  ) { //GEN-FIRST:event_jComboBoxTipoComidaActionPerformed
    // captura el elemento seleccionado en el combo box
    String tipoComida = jComboBoxTipoComida.getSelectedItem().toString();

    // Se busca en la lista de comida el nombre del tipo de comida
    this.listTipoComida.forEach((TipoComida objTipoComida) -> {
        if (objTipoComida.getIdTipoComida() == Integer.parseInt(tipoComida)) {
          jLabelSeleccionTipoComida.setText(objTipoComida.getNombre());
        }
      });
  } //GEN-LAST:event_jComboBoxTipoComidaActionPerformed

  public void limpiarCampos() {
    jTextFieldNombre.setText("");
    jTextFieldCodigo.setText("");
    jComboBoxTipoComida.setSelectedIndex(0);
    jComboBoxRestaurante.setSelectedIndex(0);
    jTextFieldCantidadIngredientes.setText("");
    jTextFieldPrecio.setText("");
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonRegistrar;
  private javax.swing.JComboBox<String> jComboBoxRestaurante;
  private javax.swing.JComboBox<String> jComboBoxTipoComida;
  private javax.swing.JLabel jLabelAuthor;
  private javax.swing.JLabel jLabelCantidadIngredientes;
  private javax.swing.JLabel jLabelCodigo;
  private javax.swing.JLabel jLabelNombre;
  private javax.swing.JLabel jLabelPrecio;
  private javax.swing.JLabel jLabelRestaurante;
  private javax.swing.JLabel jLabelSeleccionRestaurante;
  private javax.swing.JLabel jLabelSeleccionTipoComida;
  private javax.swing.JLabel jLabelTipoComida;
  private javax.swing.JLabel jLabelTituloRegistrarComida;
  private javax.swing.JPanel jPanelCentral;
  private javax.swing.JPanel jPanelInferior;
  private javax.swing.JPanel jPanelSuperior;
  private javax.swing.JTextField jTextFieldCantidadIngredientes;
  private javax.swing.JTextField jTextFieldCodigo;
  private javax.swing.JTextField jTextFieldNombre;
  private javax.swing.JTextField jTextFieldPrecio;

  // End of variables declaration//GEN-END:variables
  public void cargarDatosIniciales() {
    cargarRestaurantes();
    cargarTipoComidas();
  }

  // cargar restaurantes
  public void cargarRestaurantes() {
    // se consulta la lista de restaurantes
    this.listRestaurante =
      (ArrayList<Restaurante>) this.objComidaServices.listarRestaurantes();

    // se recorre la lista de restaurantes y se agregan al combo box
    for (Restaurante objRestaurante : this.listRestaurante) {
      jComboBoxRestaurante.addItem(
        String.valueOf(objRestaurante.getIdRestaurante())
      );
    }
  }

  // cargar tipoComida
  public void cargarTipoComidas() {
    // se consulta la lista de tipoComida
    this.listTipoComida =
      (ArrayList<TipoComida>) this.objComidaServices.listarTipoComidas();

    // se recorre la lista de tipoComida y se agregan al combo box
    for (TipoComida objTipoComida : this.listTipoComida) {
      jComboBoxTipoComida.addItem(
        String.valueOf(objTipoComida.getIdTipoComida())
      );
    }
  }
}
