/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import modelos.Comida;
import servicios.ComidaServices;

/**
 *
 * @author EdersonMunoz
 */
public class VtnConsultarComida extends javax.swing.JInternalFrame {

  private ComidaServices objComidaServices;

  public VtnConsultarComida(ComidaServices objComidaServices) {
    initComponents();
    this.objComidaServices = objComidaServices;
    this.jLabelMostrarMensaje.setVisible(false);
    this.jPanelMostrarDatos.setVisible(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPanelSuperior = new javax.swing.JPanel();
    jLabelTituloConsultaComida = new javax.swing.JLabel();
    jPanelCentral = new javax.swing.JPanel();
    jTextFieldCodigoComida = new javax.swing.JTextField();
    jButtonConsultar = new javax.swing.JButton();
    jPanelMostrarDatos = new javax.swing.JPanel();
    jLabelNombre = new javax.swing.JLabel();
    jLabelCodigo = new javax.swing.JLabel();
    jLabelTipoComida = new javax.swing.JLabel();
    jLabelRestaurante = new javax.swing.JLabel();
    jLabelIdComida = new javax.swing.JLabel();
    jLabelResultCodigo = new javax.swing.JLabel();
    jLabelResultTipoComida = new javax.swing.JLabel();
    jLabelResultRestaurante = new javax.swing.JLabel();
    jLabelResultIdComida = new javax.swing.JLabel();
    jLabelResultNombre = new javax.swing.JLabel();
    jLabelCantidadIngredientes = new javax.swing.JLabel();
    jLabelResultCantidadIngredientes = new javax.swing.JLabel();
    jLabelPrecio = new javax.swing.JLabel();
    jLabelResultPrecio = new javax.swing.JLabel();
    jLabelCodigoComida = new javax.swing.JLabel();
    jLabelMostrarMensaje = new javax.swing.JLabel();

    jPanelSuperior.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jLabelTituloConsultaComida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabelTituloConsultaComida.setForeground(new java.awt.Color(0, 51, 255));
    jLabelTituloConsultaComida.setText("Consultar comida");

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
            .addGap(225, 225, 225)
            .addComponent(jLabelTituloConsultaComida)
            .addContainerGap(259, Short.MAX_VALUE)
        )
    );
    jPanelSuperiorLayout.setVerticalGroup(
      jPanelSuperiorLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelSuperiorLayout
            .createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabelTituloConsultaComida)
            .addContainerGap(49, Short.MAX_VALUE)
        )
    );

    getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

    jPanelCentral.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jButtonConsultar.setText("Consultar");
    jButtonConsultar.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButtonConsultarActionPerformed(evt);
        }
      }
    );

    jPanelMostrarDatos.setBorder(
      javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))
    );

    jLabelNombre.setText("Nombre:");

    jLabelCodigo.setText("Codigo:");

    jLabelTipoComida.setText("Tipo de comida:");

    jLabelRestaurante.setText("Nombre del restaurante:");

    jLabelIdComida.setText("Id Comida");

    jLabelResultCodigo.setText("resultadoCodigo");

    jLabelResultTipoComida.setText("resultadoTipoComida");

    jLabelResultRestaurante.setText("resultadoRestaurante");

    jLabelResultIdComida.setText("resultadoId");

    jLabelResultNombre.setText("resultadoNombre");

    jLabelCantidadIngredientes.setText("Cantidad de ingredietes:");

    jLabelResultCantidadIngredientes.setText("resultadoNumeroIngredientes");

    jLabelPrecio.setText("Precio:");

    jLabelResultPrecio.setText("resultadoPrecio");

    javax.swing.GroupLayout jPanelMostrarDatosLayout = new javax.swing.GroupLayout(
      jPanelMostrarDatos
    );
    jPanelMostrarDatos.setLayout(jPanelMostrarDatosLayout);
    jPanelMostrarDatosLayout.setHorizontalGroup(
      jPanelMostrarDatosLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelMostrarDatosLayout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanelMostrarDatosLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelNombre)
                .addComponent(jLabelCodigo)
                .addComponent(jLabelTipoComida)
                .addComponent(jLabelRestaurante)
                .addComponent(jLabelIdComida)
                .addComponent(jLabelCantidadIngredientes)
                .addComponent(jLabelPrecio)
            )
            .addGap(91, 91, 91)
            .addGroup(
              jPanelMostrarDatosLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelResultPrecio)
                .addComponent(jLabelResultCantidadIngredientes)
                .addComponent(jLabelResultRestaurante)
                .addComponent(jLabelResultTipoComida)
                .addComponent(jLabelResultCodigo)
                .addComponent(jLabelResultNombre)
                .addComponent(jLabelResultIdComida)
            )
            .addContainerGap(158, Short.MAX_VALUE)
        )
    );
    jPanelMostrarDatosLayout.setVerticalGroup(
      jPanelMostrarDatosLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelMostrarDatosLayout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanelMostrarDatosLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanelMostrarDatosLayout
                    .createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelResultTipoComida)
                    .addGap(34, 34, 34)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanelMostrarDatosLayout
                    .createSequentialGroup()
                    .addGroup(
                      jPanelMostrarDatosLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabelIdComida)
                        .addComponent(jLabelResultIdComida)
                    )
                    .addGap(18, 18, 18)
                    .addGroup(
                      jPanelMostrarDatosLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabelNombre)
                        .addComponent(jLabelResultNombre)
                    )
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(
                      jPanelMostrarDatosLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabelCodigo)
                        .addComponent(jLabelResultCodigo)
                    )
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addComponent(jLabelTipoComida)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(
                      jPanelMostrarDatosLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabelRestaurante)
                        .addComponent(jLabelResultRestaurante)
                    )
                )
            )
            .addGap(18, 18, Short.MAX_VALUE)
            .addGroup(
              jPanelMostrarDatosLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelCantidadIngredientes)
                .addComponent(jLabelResultCantidadIngredientes)
            )
            .addGap(18, 18, 18)
            .addGroup(
              jPanelMostrarDatosLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelPrecio)
                .addComponent(jLabelResultPrecio)
            )
            .addContainerGap(19, Short.MAX_VALUE)
        )
    );

    jLabelCodigoComida.setText("Codigo comida:");

    jLabelMostrarMensaje.setText("Resultado:");

    javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(
      jPanelCentral
    );
    jPanelCentral.setLayout(jPanelCentralLayout);
    jPanelCentralLayout.setHorizontalGroup(
      jPanelCentralLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanelCentralLayout
            .createSequentialGroup()
            .addContainerGap(11, Short.MAX_VALUE)
            .addGroup(
              jPanelCentralLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanelCentralLayout
                    .createSequentialGroup()
                    .addComponent(jLabelCodigoComida)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(
                      jTextFieldCodigoComida,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      94,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(18, 18, 18)
                    .addComponent(
                      jButtonConsultar,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      117,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addContainerGap(252, Short.MAX_VALUE)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanelCentralLayout
                    .createSequentialGroup()
                    .addGroup(
                      jPanelCentralLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabelMostrarMensaje)
                        .addComponent(
                          jPanelMostrarDatos,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addGap(18, 18, 18)
                )
            )
        )
    );
    jPanelCentralLayout.setVerticalGroup(
      jPanelCentralLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanelCentralLayout
            .createSequentialGroup()
            .addGap(26, 26, 26)
            .addGroup(
              jPanelCentralLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  jTextFieldCodigoComida,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(jButtonConsultar)
                .addComponent(jLabelCodigoComida)
            )
            .addGap(24, 24, 24)
            .addComponent(jLabelMostrarMensaje)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jPanelMostrarDatos,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(8, Short.MAX_VALUE)
        )
    );

    getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButtonConsultarActionPerformed
    String codigo;
    codigo = this.jTextFieldCodigoComida.getText();

    if (this.objComidaServices.consultarSiExisteComida(codigo)) {
      this.jLabelMostrarMensaje.setVisible(false);
      this.jPanelMostrarDatos.setVisible(true);
      Comida objComida = this.objComidaServices.consultarComida(codigo);
      this.jLabelResultIdComida.setText(
          String.valueOf(objComida.getIdComida())
        );
      this.jLabelResultNombre.setText(objComida.getNombre());
      this.jLabelResultCodigo.setText(objComida.getCodigo());
      this.jLabelResultTipoComida.setText(objComida.getTipoComida());
      this.jLabelResultRestaurante.setText(objComida.getRestaurante());
      this.jLabelResultCantidadIngredientes.setText(
          String.valueOf(objComida.getCantidadIngredientes())
        );
      this.jLabelResultPrecio.setText(objComida.getPrecio() + "");
    } else {
      this.jLabelMostrarMensaje.setVisible(true);
      this.jLabelMostrarMensaje.setText(
          "Error, no existe un comida con ese identificador"
        );
      this.jPanelMostrarDatos.setVisible(false);
    }
  } //GEN-LAST:event_jButtonConsultarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonConsultar;
  private javax.swing.JLabel jLabelCantidadIngredientes;
  private javax.swing.JLabel jLabelCodigo;
  private javax.swing.JLabel jLabelCodigoComida;
  private javax.swing.JLabel jLabelIdComida;
  private javax.swing.JLabel jLabelMostrarMensaje;
  private javax.swing.JLabel jLabelNombre;
  private javax.swing.JLabel jLabelPrecio;
  private javax.swing.JLabel jLabelRestaurante;
  private javax.swing.JLabel jLabelResultCantidadIngredientes;
  private javax.swing.JLabel jLabelResultCodigo;
  private javax.swing.JLabel jLabelResultIdComida;
  private javax.swing.JLabel jLabelResultNombre;
  private javax.swing.JLabel jLabelResultPrecio;
  private javax.swing.JLabel jLabelResultRestaurante;
  private javax.swing.JLabel jLabelResultTipoComida;
  private javax.swing.JLabel jLabelTipoComida;
  private javax.swing.JLabel jLabelTituloConsultaComida;
  private javax.swing.JPanel jPanelCentral;
  private javax.swing.JPanel jPanelMostrarDatos;
  private javax.swing.JPanel jPanelSuperior;
  private javax.swing.JTextField jTextFieldCodigoComida;
  // End of variables declaration//GEN-END:variables
}
