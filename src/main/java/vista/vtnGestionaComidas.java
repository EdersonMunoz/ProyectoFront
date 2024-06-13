package vista;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Comida;
import servicios.ComidaServices;
import utilidades.Utilidades;

public class vtnGestionaComidas extends javax.swing.JInternalFrame {

  private final ComidaServices objComidaServices;

  public vtnGestionaComidas(ComidaServices objComidaServices) {
    initComponents();
    this.objComidaServices = objComidaServices;
    this.jTableMostrarComidas.setDefaultRenderer(Object.class, new Render());
    inicializarTabla();
  }

  private void inicializarTabla() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Id");
    model.addColumn("Nombre");
    model.addColumn("Codigo");
    model.addColumn("Restaurante");
    model.addColumn("Tipo de comida");
    model.addColumn("# Ingredientes");
    model.addColumn("Precio");
    model.addColumn("Editar");
    model.addColumn("Eliminar");
    this.jTableMostrarComidas.setModel(model);
  }

  public void limpiarTabla() {
    DefaultTableModel modelo = (DefaultTableModel) this.jTableMostrarComidas.getModel();
    int filas = this.jTableMostrarComidas.getRowCount();
    for (int i = 0; filas > i; i++) {
      modelo.removeRow(0);
    }
  }

  private void llenarTabla() {
    DefaultTableModel model = (DefaultTableModel) this.jTableMostrarComidas.getModel();
    limpiarTabla();
    List<Comida> lista = this.objComidaServices.listarComidas();

    for (int i = 0; i < lista.size(); i++) {
      JButton JButtonActualizarUsuario = new JButton();
      JButtonActualizarUsuario.setName("Actualizar");
      JButtonActualizarUsuario.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/recursos/lapiz.png"))
      );

      JButton JButtonEliminarUsuario = new JButton();
      JButtonEliminarUsuario.setName("Eliminar");
      JButtonEliminarUsuario.setIcon(
        new javax.swing.ImageIcon(
          getClass().getResource("/recursos/remove.png")
        )
      );

      Object[] fila = {
        lista.get(i).getIdComida() + "",
        lista.get(i).getNombre(),
        lista.get(i).getCodigo(),
        lista.get(i).getTipoComida(),
        lista.get(i).getRestaurante(),
        lista.get(i).getPrecio() + "",
        JButtonActualizarUsuario,
        JButtonEliminarUsuario,
      };
      model.addRow(fila);
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPanelSuperior = new javax.swing.JPanel();
    jLabelGestionarComidas = new javax.swing.JLabel();
    jPanelInferior = new javax.swing.JPanel();
    jPanelCentral = new javax.swing.JPanel();
    jButtonRegistrarLibro = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableMostrarComidas = new javax.swing.JTable();
    jButtonActualizaTabla = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setIconifiable(true);
    setMaximizable(true);
    setResizable(true);

    jPanelSuperior.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jLabelGestionarComidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabelGestionarComidas.setText("Gestionar comidas");

    javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(
      jPanelSuperior
    );
    jPanelSuperior.setLayout(jPanelSuperiorLayout);
    jPanelSuperiorLayout.setHorizontalGroup(
      jPanelSuperiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanelSuperiorLayout
            .createSequentialGroup()
            .addContainerGap(376, Short.MAX_VALUE)
            .addComponent(jLabelGestionarComidas)
            .addGap(353, 353, 353)
        )
    );
    jPanelSuperiorLayout.setVerticalGroup(
      jPanelSuperiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelSuperiorLayout
            .createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(jLabelGestionarComidas)
            .addContainerGap(48, Short.MAX_VALUE)
        )
    );

    getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

    jPanelInferior.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(
      jPanelInferior
    );
    jPanelInferior.setLayout(jPanelInferiorLayout);
    jPanelInferiorLayout.setHorizontalGroup(
      jPanelInferiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 891, Short.MAX_VALUE)
    );
    jPanelInferiorLayout.setVerticalGroup(
      jPanelInferiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 100, Short.MAX_VALUE)
    );

    getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

    jPanelCentral.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jButtonRegistrarLibro.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/recursos/agregar.png"))
    ); // NOI18N
    jButtonRegistrarLibro.setText("Registrar");
    jButtonRegistrarLibro.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButtonRegistrarLibroActionPerformed(evt);
        }
      }
    );

    jTableMostrarComidas.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {
          { null, null, null, null },
          { null, null, null, null },
          { null, null, null, null },
          { null, null, null, null },
        },
        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }
      )
    );
    jTableMostrarComidas.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          jTableMostrarComidasMouseClicked(evt);
        }
      }
    );
    jScrollPane1.setViewportView(jTableMostrarComidas);

    jButtonActualizaTabla.setText("Actualizar tabla");
    jButtonActualizaTabla.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButtonActualizaTablaActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(
      jPanelCentral
    );
    jPanelCentral.setLayout(jPanelCentralLayout);
    jPanelCentralLayout.setHorizontalGroup(
      jPanelCentralLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelCentralLayout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanelCentralLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanelCentralLayout
                    .createSequentialGroup()
                    .addComponent(jButtonActualizaTabla)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(jButtonRegistrarLibro)
                )
                .addComponent(
                  jScrollPane1,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  879,
                  Short.MAX_VALUE
                )
            )
            .addContainerGap()
        )
    );
    jPanelCentralLayout.setVerticalGroup(
      jPanelCentralLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelCentralLayout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanelCentralLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonRegistrarLibro)
                .addComponent(jButtonActualizaTabla)
            )
            .addGap(18, 18, 18)
            .addComponent(
              jScrollPane1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              116,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(103, Short.MAX_VALUE)
        )
    );

    getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButtonRegistrarLibroActionPerformed(
    java.awt.event.ActionEvent evt
  ) { //GEN-FIRST:event_jButtonRegistrarLibroActionPerformed
    vtnRegistrarComida vtnObjRegistrarLibro = new vtnRegistrarComida(
      this.objComidaServices
    );
    vtnObjRegistrarLibro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    vtnObjRegistrarLibro.setVisible(true);
  } //GEN-LAST:event_jButtonRegistrarLibroActionPerformed

  private void jButtonActualizaTablaActionPerformed(
    java.awt.event.ActionEvent evt
  ) { //GEN-FIRST:event_jButtonActualizaTablaActionPerformed
    llenarTabla();
  } //GEN-LAST:event_jButtonActualizaTablaActionPerformed

  private void jTableMostrarComidasMouseClicked(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_jTableMostrarComidasMouseClicked
    int column =
      this.jTableMostrarComidas.getColumnModel().getColumnIndexAtX(evt.getX());
    int row = evt.getY() / jTableMostrarComidas.getRowHeight();

    if (
      row < jTableMostrarComidas.getRowCount() &&
      row >= 0 &&
      column < jTableMostrarComidas.getColumnCount() &&
      column >= 0
    ) {
      Object value = jTableMostrarComidas.getValueAt(row, column);

      if (value instanceof JButton) {
        ((JButton) value).doClick();
        JButton boton = (JButton) value;

        String idComida = jTableMostrarComidas.getValueAt(row, 0).toString();

        if (boton.getName().equals("Eliminar")) {
          this.elimininarComida(idComida);
        } else if (boton.getName().equals("Actualizar")) {
          this.actualizarComida(idComida);
        }
      }
    }
  } //GEN-LAST:event_jTableMostrarComidasMouseClicked

  private void actualizarComida(String idComida) {
    Integer idComidaEntero = Integer.parseInt(idComida);
    Comida objComida = this.objComidaServices.consultarComida(idComidaEntero);
    vtnActualizarComida vtnObjActualizarLibro = new vtnActualizarComida(
      this.objComidaServices
    );
    vtnObjActualizarLibro.actualizarFormularioComida(idComidaEntero, objComida);
    vtnObjActualizarLibro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    vtnObjActualizarLibro.setVisible(true);
  }

  private void elimininarComida(String idComida) {
    try {
      if (
        Utilidades.mensajeConfirmacion(
          "¿Estas seguro de que quieres eliminar la comida con el codigo " +
          idComida +
          " " +
          " ?",
          "Confirmacion"
        ) ==
        0
      ) {
        Integer idComidaEntero = Integer.parseInt(idComida);
        boolean bandera = this.objComidaServices.eliminarComida(idComidaEntero);
        if (bandera == true) {
          Utilidades.mensajeExito(
            "El comida con id " + idComida + " fue eliminado exitosamente",
            "Comida eliminado"
          );
          llenarTabla();
        } else {
          Utilidades.mensajeAdvertencia(
            "El comida con id " + idComida + " no fue eliminado",
            "Error al eliminar"
          );
        }
      }
    } catch (Exception ex) {
      Utilidades.mensajeError(
        "Error al eliminar el comida. Intentelo de nuevo m�s tarde",
        "Error"
      );
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonActualizaTabla;
  private javax.swing.JButton jButtonRegistrarLibro;
  private javax.swing.JLabel jLabelGestionarComidas;
  private javax.swing.JPanel jPanelCentral;
  private javax.swing.JPanel jPanelInferior;
  private javax.swing.JPanel jPanelSuperior;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTableMostrarComidas;
  // End of variables declaration//GEN-END:variables
}
