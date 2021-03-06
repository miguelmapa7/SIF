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
import edu.cecar.controladores.ControladorAreaCuerpo;
import edu.cecar.controladores.ControladorUsuario;
import edu.cecar.modelo.AreaCuerpo;
import edu.cecar.modelo.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class GestionarAreaCuerpo extends javax.swing.JInternalFrame {

    private static ControladorAreaCuerpo controladorAreaCuerpo;

    /**
     * Creates new form GestionarUsuarios
     */
    public GestionarAreaCuerpo() {
        initComponents();
        // Se hace que campo de texto Identidicación este listo para ser editado        
        jTisArea.grabFocus();

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
        jTisArea = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTLados = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jBNuevo = new javax.swing.JButton();
        jBRegistar = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Áreas del Cuerpo");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Información Área del cuerpo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jPanel1.setLayout(null);

        jTisArea.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTisArea.setBorder(null);
        jTisArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTisAreaActionPerformed(evt);
            }
        });
        jPanel1.add(jTisArea);
        jTisArea.setBounds(60, 40, 150, 30);

        jTDescripcion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTDescripcion.setBorder(null);
        jPanel1.add(jTDescripcion);
        jTDescripcion.setBounds(30, 90, 210, 30);

        jTLados.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        jTLados.setBorder(null);
        jPanel1.add(jTLados);
        jTLados.setBounds(30, 140, 210, 30);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(50, 70, 170, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(30, 120, 210, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(30, 170, 210, 10);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(30, 10, 290, 240);

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
        jPanel2.setBounds(350, 20, 190, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistarActionPerformed

        // Se procede a realizar operaciones con los datos 
        if (jTisArea.getText().equals("")
                || jTDescripcion.getText().equals("")
                || jTLados.getText().equals("")) {

            JOptionPane.showMessageDialog(null,
                    "Verificar los datos ingresados");
        } else {

            AreaCuerpo areaCuerpo
                    = new AreaCuerpo(Integer.parseInt(
                            jTisArea.getText()),
                            jTDescripcion.getText(),
                            jTLados.getText());
            guardar(areaCuerpo);
        }

    }//GEN-LAST:event_jBRegistarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        nuevoAreaCuerpo();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

        consultarAreaCuerpo();
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jTisAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTisAreaActionPerformed

        consultarAreaCuerpo();
    }//GEN-LAST:event_jTisAreaActionPerformed

    public static ControladorAreaCuerpo getControladorArea() {

        if (controladorAreaCuerpo == null) {
            controladorAreaCuerpo = new ControladorAreaCuerpo();
        }

        return controladorAreaCuerpo;

    }

    public void guardar(AreaCuerpo areaCuerpo) {

        try {

            getControladorArea().guardar(areaCuerpo);
            JOptionPane.showMessageDialog(null,
                    "Área Almacenada correctamente");
            nuevoAreaCuerpo();
            alInicio();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,
                    "Error al almacenar el Ärea");
            //e.printStackTrace();
        }

    }

    public void nuevoAreaCuerpo() {
        jTisArea.setText("");
        jTDescripcion.setText("");
        jTLados.setText("");
        jTisArea.grabFocus();
    }

    public void alInicio() {
        jTDescripcion.setEnabled(false);
        jTLados.setEnabled(false);
        jBNuevo.setEnabled(false);
        jBRegistar.setEnabled(false);
    }

    public void despuesInicio() {
        jTDescripcion.setEnabled(true);
        jTLados.setEnabled(true);
        jBNuevo.setEnabled(true);
        jBRegistar.setEnabled(true);
    }

    public void consultarAreaCuerpo() {
        if (jTisArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Área");
        } else {
            try {
                // Se consulta la existencia del usuario en la BD
                AreaCuerpo areaCuerpo
                        = getControladorArea()
                                .consultar(jTisArea.getText());

                if (areaCuerpo != null) {
                    jTDescripcion.setText(areaCuerpo.getDescripcion());
                    jTLados.setText(areaCuerpo.getLado());

                    int resp = JOptionPane.showConfirmDialog(null,
                            "¿Desea Modificar Área?", "Alerta!",
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
                JOptionPane.showMessageDialog(null, "Área del cuepo NO existe");
            }
        }

    }

    public void textoCampos() {
        TextPrompt textIdentificacion = new TextPrompt("Código Área", jTisArea);
        TextPrompt textNombres = new TextPrompt("Descripción", jTDescripcion);
        TextPrompt textApellidos = new TextPrompt("Lado", jTLados);
    }

    public void cargarImagenesBotones() {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTLados;
    private javax.swing.JTextField jTisArea;
    // End of variables declaration//GEN-END:variables
}
