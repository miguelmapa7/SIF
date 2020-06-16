/**
 *
 * Clase: EmpleadoGUI
 *
 * @version: 0.1
 *
 * @Fecha de creación: 12/06/2020
 *
 * Fecha de Modificación:
 *
 * @author migue 1102838994
 *
 * Copyrigth: CECAR
 *
 */
package edu.cecar.vistas;

import edu.cecar.componentes.baseDatos.ConectarMySQL;
import edu.cecar.controladores.ControladorEmpleado;
import edu.cecar.modelo.Empleado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

/**
 *
 *
 */
public class EmpleadoGUI implements FocusListener, ActionListener {

    private JButton bGuardar;
    private JButton bConsultar;
    private JButton bEliminar;
    private JButton bLimpiar;
    private JButton bTelefono;

    private JTextField tnumeroIdentificacion;
    private JTextField tNombres;
    private JTextField tApellidos;
    private JTextField tFechaNacimineto;
    private JTextField tDireccion;
    private JTextField tTelefono;

    private JComboBox<String> cTipoTratamiento;
    private static ControladorEmpleado controladorEmpleado;

    private JList<String> jlTelefono;
    private static DefaultListModel modeloLista;

    public EmpleadoGUI() {

        JFrame ventanaPrincipal = new JFrame("Prueba JToolBar");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        cTipoTratamiento = new JComboBox<String>();
        cTipoTratamiento.addItem("Cedula");
        cTipoTratamiento.addItem("Pasaporte");

        tnumeroIdentificacion = new JTextField(20);
        tNombres = new JTextField(60);
        tNombres.addFocusListener(this);
        tApellidos = new JTextField(60);
        tApellidos.addFocusListener(this);
        tFechaNacimineto = new JTextField(14);
        tFechaNacimineto.addFocusListener(this);
        tTelefono = new JTextField(12);
        tTelefono.addFocusListener(this);
        tDireccion = new JTextField(14);
        tDireccion.addFocusListener(this);
        jlTelefono = new JList<String>(getModeloLista());
        jlTelefono.setPreferredSize(new Dimension(200, 100));
        bTelefono = new JButton("Adicionar");
        bTelefono.addActionListener(this);

        tnumeroIdentificacion.addFocusListener(this);

        JLabel lTipo = new JLabel("Tipo Tratamiento");
        JLabel lNumero = new JLabel("Número Identificación");
        JLabel lNombres = new JLabel("Nombres");
        JLabel lApellidos = new JLabel("Apellidos");
        JLabel lFechaEntrega = new JLabel("Fecha Entrega");
        JLabel lDireccion = new JLabel("Direccion");
        JLabel lTelefono = new JLabel("Telefonos");

        JPanel jPanel = new JPanel(new FlowLayout());

        jPanel.add(lTipo);
        jPanel.add(cTipoTratamiento);
        jPanel.add(lNumero);
        jPanel.add(tnumeroIdentificacion);
        jPanel.add(lNombres);
        jPanel.add(tNombres);
        jPanel.add(lApellidos);
        jPanel.add(tApellidos);
        jPanel.add(lFechaEntrega);
        jPanel.add(tFechaNacimineto);
        jPanel.add(lDireccion);
        jPanel.add(tDireccion);
        jPanel.add(lTelefono);
        jPanel.add(tTelefono);
        jPanel.add(bTelefono);
        jPanel.add(jlTelefono);

        JToolBar toolBar = getToolBar();

        ventanaPrincipal.getContentPane().add(jPanel, BorderLayout.CENTER);
        ventanaPrincipal.getContentPane().add(toolBar, BorderLayout.NORTH);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);

        try {
            ConectarMySQL.getConectarMySQL("127.0.0.1", "Analisis", "root", "");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        tnumeroIdentificacion.grabFocus();
    }

    private void consultarEmpleado() {

        try {

            Empleado empleado
                    = getControladorEmpleado()
                            .consultar(tnumeroIdentificacion.getText());
            if (empleado != null) {

                tNombres.setText(empleado.getNombres());
                tApellidos.setText(empleado.getApellidos());
                tDireccion.setText(empleado.getDireccion());
                tFechaNacimineto.setText(empleado.getFechanacimiento());
            }

        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private JToolBar getToolBar() {

        bGuardar = getButton("Guardar", "recursos/guardar.png");
        bGuardar.addActionListener(this);
        bGuardar.setMnemonic('G');

        bEliminar = getButton("Eliminar", "recursos/eliminar.png");
        bEliminar.addActionListener(this);
        bEliminar.setMnemonic('E');

        bLimpiar = getButton("Limpiar", "recursos/nuevo.png");
        bLimpiar.addActionListener(this);
        bLimpiar.setMnemonic('E');

        bConsultar = getButton("BuscAR", "recursos/buscar.png");

        JToolBar barraBotones = new JToolBar();

        barraBotones.add(bGuardar);
        barraBotones.add(bEliminar);
        barraBotones.add(bConsultar);
        barraBotones.add(bLimpiar);
        return barraBotones;
    }

    public JButton getButton(String texto, String imagen) {

        JButton bButton = new JButton(texto, new ImageIcon(imagen));
        bButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        bButton.setHorizontalTextPosition(SwingConstants.CENTER);
        return bButton;
    }

    public static void main(String[] args) {
        new EmpleadoGUI();
    }

    public void guardar(Empleado empleado) {

        try {

            getControladorEmpleado().guardar(empleado);
            JOptionPane.showMessageDialog(null,
                    "Empleado Almacenado correctamente");
            limpiar();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,
                    "Error al almacenar empleado");
            e.printStackTrace();
        }

    }

    private void limpiar() {

        tNombres.setText("");
        tDireccion.setText("");
        tApellidos.setText("");
        tFechaNacimineto.setText("");
        tnumeroIdentificacion.setText("");
        cTipoTratamiento.setSelectedIndex(0);
        tnumeroIdentificacion.grabFocus();

    }

    public static ControladorEmpleado getControladorEmpleado() {

        if (controladorEmpleado == null) {
            controladorEmpleado = new ControladorEmpleado();
        }

        return controladorEmpleado;

    }

    public static DefaultListModel<String> getModeloLista() {

        if (modeloLista == null) {
            modeloLista = new DefaultListModel<String>();
        }

        return modeloLista;

    }

    public void focusGained(FocusEvent e) {

        ((JTextField) e.getSource()).setBackground(Color.gray);
        ((JTextField) e.getSource()).selectAll();

        if (e.getSource() == tnumeroIdentificacion) {
            consultarEmpleado();
        }

    }

    public void focusLost(FocusEvent e) {

        ((JTextField) e.getSource()).setBackground(Color.white);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Guardar")) {

            Empleado empleado
                    = new Empleado(Integer.parseInt(
                            tnumeroIdentificacion.getText()),
                            cTipoTratamiento.getSelectedItem().toString(),
                            tNombres.getText(),
                            tApellidos.getText(),
                            tFechaNacimineto.getText(),
                            tDireccion.getText(),
                            getModeloLista().toArray());
            guardar(empleado);

        } else if (e.getActionCommand().equals("Limpiar")) {

            limpiar();

        } else if (e.getActionCommand().equals("Eliminar")) {

        } else if (e.getActionCommand().equals("Adicionar")) {

            getModeloLista().addElement(tTelefono.getText());
            tTelefono.setText("");
            tTelefono.grabFocus();
        }

    }
}
