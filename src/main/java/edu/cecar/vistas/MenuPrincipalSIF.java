/**
 *
 * Clase: MenuPrincipalSIF
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

/**
 *
 * @author migue
 */
public class MenuPrincipalSIF extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalSIF
     */
    public MenuPrincipalSIF() {
        initComponents();
        this.setLocation(200, 50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jDEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMIUsuarios = new javax.swing.JMenuItem();
        jMITPrecioTratamientos = new javax.swing.JMenuItem();
        jMIAreasCuerpo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMTratamientos = new javax.swing.JMenuItem();
        jMSesiones = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMIPacientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        jMenu1.setText("Archivos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestionar ");
        jMenu2.setToolTipText("");

        jMIUsuarios.setText("Usuarios");
        jMIUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMIUsuarios);

        jMITPrecioTratamientos.setText("Precios de Tratamientos");
        jMITPrecioTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITPrecioTratamientosActionPerformed(evt);
            }
        });
        jMenu2.add(jMITPrecioTratamientos);

        jMIAreasCuerpo.setText("Areas del Cuerpo");
        jMIAreasCuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAreasCuerpoActionPerformed(evt);
            }
        });
        jMenu2.add(jMIAreasCuerpo);
        jMenu2.add(jSeparator1);

        jMTratamientos.setText("Tratamientos");
        jMTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTratamientosActionPerformed(evt);
            }
        });
        jMenu2.add(jMTratamientos);

        jMSesiones.setText("Sesiones");
        jMSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSesionesActionPerformed(evt);
            }
        });
        jMenu2.add(jMSesiones);
        jMenu2.add(jSeparator2);

        jMIPacientes.setText("Pacientes");
        jMIPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPacientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMIPacientes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informes");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIUsuariosActionPerformed

        GestionarUsuarios gestionarUsuarios = new GestionarUsuarios();
        jDEscritorio.add(gestionarUsuarios);
        gestionarUsuarios.show();

    }//GEN-LAST:event_jMIUsuariosActionPerformed

    private void jMIPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPacientesActionPerformed
        
        GestionarPacientes gestionarPacientes = new GestionarPacientes();
        jDEscritorio.add(gestionarPacientes);
        gestionarPacientes.show();
    }//GEN-LAST:event_jMIPacientesActionPerformed

    private void jMIAreasCuerpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAreasCuerpoActionPerformed
       
        GestionarAreaCuerpo gestionarAreas = new GestionarAreaCuerpo();
        jDEscritorio.add(gestionarAreas);
        gestionarAreas.show();
    }//GEN-LAST:event_jMIAreasCuerpoActionPerformed

    private void jMITPrecioTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITPrecioTratamientosActionPerformed
        
        GestionarPreciosTratamiento gestionarPreciosTratamiento = new GestionarPreciosTratamiento();
        jDEscritorio.add(gestionarPreciosTratamiento);
        gestionarPreciosTratamiento.show();
    }//GEN-LAST:event_jMITPrecioTratamientosActionPerformed

    private void jMSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSesionesActionPerformed
        
        GestionarSesiones gestionarSesiones = new GestionarSesiones();
        jDEscritorio.add(gestionarSesiones);
        gestionarSesiones.show();
    }//GEN-LAST:event_jMSesionesActionPerformed

    private void jMTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTratamientosActionPerformed
        
        GestionarTratamientos gestionarTratamientos = new GestionarTratamientos();
        jDEscritorio.add(gestionarTratamientos);
        gestionarTratamientos.show();
    }//GEN-LAST:event_jMTratamientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDEscritorio;
    public static javax.swing.JMenuItem jMIAreasCuerpo;
    public static javax.swing.JMenuItem jMIPacientes;
    public static javax.swing.JMenuItem jMITPrecioTratamientos;
    public static javax.swing.JMenuItem jMIUsuarios;
    public static javax.swing.JMenuItem jMSesiones;
    public static javax.swing.JMenuItem jMTratamientos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
