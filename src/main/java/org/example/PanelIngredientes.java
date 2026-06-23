package org.example;

import javax.swing.*;

public class PanelIngredientes extends JPanel {

    private JTextField txtIngredientes;
    private JButton agregar;

    public PanelIngredientes(){

        txtIngredientes = new JTextField(15);
        agregar = new JButton("Agregar");

        add(new JLabel("Ingredientes"));
        add(txtIngredientes);
        add(agregar);
    }
}
