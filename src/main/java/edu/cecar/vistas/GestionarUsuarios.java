/**
 *
 * Clase: GestionarUsuarios
 *
 * @version: 0.1
 *
 * @Fecha de creación: 13/06/2020
 *
 * Fecha de Modificación:
 *
 * @author migue 1102838994
 *
 * Copyrigth: CECAR
 *
 */
package edu.cecar.vistas;

import edu.cecar.componentes.TextPrompt;
import edu.cecar.componentes.baseDatos.ConectarMySQL;
import edu.cecar.controladores.ControladorUsuario;
import edu.cecar.modelo.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class GestionarUsuarios extends javax.swing.JInternalFrame {

    private static ControladorUsuario controladorUsuario;

    /**
     * Creates new form GestionarUsuarios
     */
    public GestionarUsuarios() {
        initComponents();
        // Se hace que campo de texto Identidicación este listo para ser editado        
        jTIdentificacion.grabFocus();
        
        alInicio();
        textoCampos();
        cargarImagenesBotones();

        // Realizamos la conexión con la base de datos
        try {
            ConectarMySQL.getConectarMySQL("127.0.0.1", "sif", "root", "");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            //e1.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al conectar con la Base de datos");
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTIdentificacion = new javax.swing.JTextField();
        jCTipoIdentificacion = new javax.swing.JComboBox<>();
        jTNombres = new javax.swing.JTextField();
        jTApellidos = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jRAdministrador = new javax.swing.JRadioButton();
        jRFisioterapeuta = new javax.swing.JRadioButton();
        jRSecretaria = new javax.swing.JRadioButton();
        jPContrasena = new javax.swing.JPasswordField();
        jCEstado = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jBNuevo = new javax.swing.JButton();
        jBRegistar = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar usuario");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Información del Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.setLayout(null);

        jTIdentificacion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTIdentificacion.setBorder(null);
        jTIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdentificacionActionPerformed(evt);
            }
        });
        jPanel1.add(jTIdentificacion);
        jTIdentificacion.setBounds(60, 40, 150, 30);

        jCTipoIdentificacion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jCTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Documento", "CC", "Paporte" }));
        jPanel1.add(jCTipoIdentificacion);
        jCTipoIdentificacion.setBounds(310, 40, 170, 30);

        jTNombres.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTNombres.setBorder(null);
        jPanel1.add(jTNombres);
        jTNombres.setBounds(30, 90, 210, 30);

        jTApellidos.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTApellidos.setBorder(null);
        jPanel1.add(jTApellidos);
        jTApellidos.setBounds(30, 140, 210, 30);

        jTDireccion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTDireccion.setBorder(null);
        jPanel1.add(jTDireccion);
        jTDireccion.setBounds(30, 190, 210, 30);

        jTTelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTTelefono.setBorder(null);
        jPanel1.add(jTTelefono);
        jTTelefono.setBounds(30, 240, 210, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tipo de Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 16))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jPanel3.setLayout(null);

        jRAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRAdministrador);
        jRAdministrador.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRAdministrador.setSelected(true);
        jRAdministrador.setText("Administrador");
        jPanel3.add(jRAdministrador);
        jRAdministrador.setBounds(40, 30, 110, 29);

        jRFisioterapeuta.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRFisioterapeuta);
        jRFisioterapeuta.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRFisioterapeuta.setText("Fisioterapeuta");
        jPanel3.add(jRFisioterapeuta);
        jRFisioterapeuta.setBounds(40, 70, 130, 29);

        jRSecretaria.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRSecretaria);
        jRSecretaria.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jRSecretaria.setText("Secretaria");
        jPanel3.add(jRSecretaria);
        jRSecretaria.setBounds(40, 110, 110, 29);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(300, 170, 190, 150);

        jPContrasena.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jPContrasena.setBorder(null);
        jPanel1.add(jPContrasena);
        jPContrasena.setBounds(30, 290, 210, 30);

        jCEstado.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jCEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Estado", "Vincualado", "Desvinculado" }));
        jPanel1.add(jCEstado);
        jCEstado.setBounds(310, 100, 170, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 320, 210, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(50, 70, 170, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(30, 120, 210, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(30, 170, 210, 10);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(30, 220, 210, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(30, 270, 210, 10);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 370);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Operaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel2.setLayout(null);

        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(jBNuevo);
        jBNuevo.setBounds(10, 100, 150, 50);

        jBRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistarActionPerformed(evt);
            }
        });
        jPanel2.add(jBRegistar);
        jBRegistar.setBounds(20, 160, 140, 50);

        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(jBConsultar);
        jBConsultar.setBounds(20, 40, 140, 50);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(570, 40, 190, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistarActionPerformed

        // Se procede a realizar operaciones con los datos 
        int tipoUsuario = 5;
        if (jTIdentificacion.getText().equals("")
                || jCTipoIdentificacion.getSelectedItem()
                        .toString().equals("Tipo de Documento")
                || jTNombres.getText().equals("")
                || jTApellidos.getText().equals("")
                || jTDireccion.getText().equals("")
                || jTTelefono.getText().equals("")
                || jPContrasena.getText().equals("")
                || jCEstado.getSelectedItem().toString().equals("Selecionar Estado")) {

            JOptionPane.showMessageDialog(null,
                    "Verificar los datos ingresados");
        } else {
            if (jRAdministrador.isSelected()) {
                tipoUsuario = 0;
            } else if (jRFisioterapeuta.isSelected()) {
                tipoUsuario = 1;
            } else if (jRSecretaria.isSelected()) {
                tipoUsuario = 2;
            }
            Usuario usuario
                    = new Usuario(Integer.parseInt(
                            jTIdentificacion.getText()),
                            jCTipoIdentificacion.getSelectedItem().toString(),
                            jTNombres.getText(),
                            jTApellidos.getText(),
                            jTDireccion.getText(),
                            jTTelefono.getText(),
                            jPContrasena.getText(),
                            tipoUsuario,
                            jCEstado.getSelectedItem().toString());
            guardar(usuario);
        }

    }//GEN-LAST:event_jBRegistarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        nuevoUsuario();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

        consultarUsuario();
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jTIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdentificacionActionPerformed

        consultarUsuario();
    }//GEN-LAST:event_jTIdentificacionActionPerformed

    public static ControladorUsuario getControladorUsuario() {

        if (controladorUsuario == null) {
            controladorUsuario = new ControladorUsuario();
        }

        return controladorUsuario;

    }

    public void guardar(Usuario usuario) {

        try {

            getControladorUsuario().guardar(usuario);
            JOptionPane.showMessageDialog(null,
                    "Usuario Almacenado correctamente");
            nuevoUsuario();
            alInicio();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,
                    "Error al almacenar el Usuario");
            //e.printStackTrace();
        }

    }

    public void nuevoUsuario() {
        jTIdentificacion.setText("");
        jCTipoIdentificacion.setSelectedItem("Tipo de Documento");
        jTNombres.setText("");
        jTApellidos.setText("");
        jTDireccion.setText("");
        jTTelefono.setText("");
        jPContrasena.setText("");
        jCEstado.setSelectedItem("Selecionar Estado");
        jRAdministrador.setSelected(true);
        jTIdentificacion.grabFocus();
    }

    public void alInicio() {
        jCTipoIdentificacion.setEnabled(false);
        jTNombres.setEnabled(false);
        jTApellidos.setEnabled(false);
        jTDireccion.setEnabled(false);
        jTTelefono.setEnabled(false);
        jPContrasena.setEnabled(false);
        jCEstado.setEnabled(false);
        jRAdministrador.setEnabled(false);
        jRFisioterapeuta.setEnabled(false);
        jRSecretaria.setEnabled(false);
        jBNuevo.setEnabled(false);
        jBRegistar.setEnabled(false);
    }

    public void despuesInicio() {
        jCTipoIdentificacion.setEnabled(true);
        jTNombres.setEnabled(true);
        jTApellidos.setEnabled(true);
        jTDireccion.setEnabled(true);
        jTTelefono.setEnabled(true);
        jPContrasena.setEnabled(true);
        jCEstado.setEnabled(true);
        jRAdministrador.setEnabled(true);
        jRFisioterapeuta.setEnabled(true);
        jRSecretaria.setEnabled(true);
        jBNuevo.setEnabled(true);
        jBRegistar.setEnabled(true);
    }

    public void consultarUsuario() {
        if (jTIdentificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite identificación");
        } else {
            try {
                // Se consulta la existencia del usuario en la BD
                Usuario usuario
                        = getControladorUsuario()
                                .consultar(jTIdentificacion.getText());

                if (usuario != null) {
                    jCTipoIdentificacion.setSelectedItem(usuario.getTipoIdentificacion());
                    jTNombres.setText(usuario.getNombres());
                    jTApellidos.setText(usuario.getApellidos());
                    jTDireccion.setText(usuario.getDireccion());
                    jTTelefono.setText(usuario.getTelefono());
                    jPContrasena.setText(usuario.getContrasena());
                    jCEstado.setSelectedItem(usuario.getEstado());
                    if (usuario.getTipoUsuario() == 0) {
                        jRAdministrador.setSelected(true);
                    } else if (usuario.getTipoUsuario() == 1) {
                        jRFisioterapeuta.setSelected(true);
                    } else if (usuario.getTipoUsuario() == 2) {
                        jRSecretaria.setSelected(true);
                    }
                    
                    int resp = JOptionPane.showConfirmDialog(null,
                            "¿Desea Modificar usuario?", "Alerta!", 
                            JOptionPane.YES_NO_OPTION);
                    if (resp == 0) {
                        // Se habilitan los campos para módificar 
                        despuesInicio();
                    } else {
                        // NO hace nada
                    }
                } else {
                    despuesInicio();
                }

            } catch (Exception e1) {
                // TODO Auto-generated catch block
                //e1.printStackTrace();
                JOptionPane.showMessageDialog(null, "Usuario NO existe");
            }
        }

    }
    
    public void textoCampos(){
        TextPrompt textIdentificacion = new TextPrompt("Identificación", jTIdentificacion);
        TextPrompt textNombres = new TextPrompt("Nombres", jTNombres);
        TextPrompt textApellidos = new TextPrompt("Apellidos", jTApellidos);
        TextPrompt textDireccion = new TextPrompt("Dirección", jTDireccion);
        TextPrompt textTelefono = new TextPrompt("Teléfono", jTTelefono);
        TextPrompt textClave = new TextPrompt("Contraseña", jPContrasena);
    }
    
    public void cargarImagenesBotones(){
        ImageIcon icon = new ImageIcon("recursos/consultar.png");
        jBConsultar.setIcon(icon);
        ImageIcon icon2 = new ImageIcon("recursos/nuevo.png");
        jBNuevo.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("recursos/registrar.png");
        jBRegistar.setIcon(icon3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBRegistar;
    private javax.swing.JComboBox<String> jCEstado;
    private javax.swing.JComboBox<String> jCTipoIdentificacion;
    private javax.swing.JPasswordField jPContrasena;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRAdministrador;
    private javax.swing.JRadioButton jRFisioterapeuta;
    private javax.swing.JRadioButton jRSecretaria;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTApellidos;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTIdentificacion;
    private javax.swing.JTextField jTNombres;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
