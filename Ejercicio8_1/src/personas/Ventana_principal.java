package personas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana_principal extends JFrame implements ActionListener {

    private Lista_personas lista; 
    private Container contenedor; 
    private JLabel nombre, apellidos, telefono, direccion;
    private JTextField campo_nombre, campo_apellidos, campo_telefono, campo_direccion;
    private JButton add, eliminar, borrar_lista; 
    private JList lista_nombres; 
    private DefaultListModel modelo; 
    private JScrollPane scroll_lista; 
    
    
    public Ventana_principal(){
        lista = new Lista_personas(); 
        inicio();
        setTitle("Personas");
        setSize(270,350); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    private void inicio(){
        contenedor = getContentPane(); 
        contenedor.setLayout(null);
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23);
        campo_nombre = new JTextField();
        campo_nombre.setBounds(105, 20, 135, 23);
        apellidos = new JLabel();
        apellidos.setText("Apellidos:"); 
        apellidos.setBounds(20, 50, 135, 23);
        campo_apellidos = new JTextField();
        campo_apellidos.setBounds(105, 50, 135, 23);
        telefono = new JLabel();
        telefono.setText("Teléfono:");
        telefono.setBounds(20, 80, 135, 23);
        campo_telefono = new JTextField();
        campo_telefono.setBounds(105, 80, 135, 23);
        direccion = new JLabel();
        direccion.setText("Dirección:");
        direccion.setBounds(20, 110, 135, 23);
        campo_direccion = new JTextField();
        campo_direccion.setBounds(105, 110, 135, 23);
        add = new JButton();
        add.setText("Añadir");
        add.setBounds(105, 150, 80, 23);
        add.addActionListener(this);
        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23); 
        eliminar.addActionListener(this);
        borrar_lista= new JButton();
        borrar_lista.setText("Borrar Lista");
        borrar_lista.setBounds(120, 280, 120, 23); 
        borrar_lista.addActionListener(this);
        lista_nombres = new JList();
        lista_nombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();
        scroll_lista = new JScrollPane();
        scroll_lista.setBounds(20, 190 ,220, 80);
        scroll_lista.setViewportView(lista_nombres);
        contenedor.add(nombre);
        contenedor.add(campo_nombre);
        contenedor.add(apellidos);
        contenedor.add(campo_apellidos);
        contenedor.add(telefono);
        contenedor.add(campo_telefono);
        contenedor.add(direccion);
        contenedor.add(campo_direccion);
        contenedor.add(add);
        contenedor.add(eliminar);
        contenedor.add(borrar_lista);
        contenedor.add(scroll_lista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == add) {
            add_persona();
        }
        if (evento.getSource() == eliminar) {
            eliminar_nombre(lista_nombres.getSelectedIndex() );
        }
        if (evento.getSource() == borrar_lista) {
            borrar_lista();
        }
    }

    private void add_persona() {
        Persona p = new Persona(campo_nombre.getText(), 
        campo_apellidos.getText(), 
        campo_telefono.getText(), campo_direccion.getText());
        lista.add_persona(p); 
        String elemento = campo_nombre.getText() + "-" + campo_apellidos.getText() + "-" + 
        campo_telefono.getText() + "-" + campo_direccion.getText();

        modelo.addElement(elemento);
        lista_nombres.setModel(modelo);
        campo_nombre.setText("");
        campo_apellidos.setText("");
        campo_telefono.setText("");
        campo_direccion.setText("");
    }
    private void eliminar_nombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice); 
            lista.eliminar_persona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrar_lista() {
        lista.borrar_lista();
        modelo.clear(); 
    }
 }
