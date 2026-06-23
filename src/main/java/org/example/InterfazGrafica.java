package org.example;
import javax.swing.*;
import java.awt.*;

public class InterfazGrafica extends JFrame{

    private JTextField txtIngredientes;
    private JButton agregar;
    private JButton generar;
    private JList<String> ingredientes;
    private JTextArea receta;

    public InterfazGrafica(){

        setTitle("Generador de recetas");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtIngredientes = new JTextField(15);
        agregar = new JButton("Agregar");
        generar = new JButton("Generar");

        ingredientes = new JList<>();
        receta = new JTextArea();

        JScrollPane barraLista = new JScrollPane(ingredientes);
        JScrollPane barraReceta = new JScrollPane(receta);

        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Ingredientes"));
        panelSuperior.add(txtIngredientes);
        panelSuperior.add(agregar);

        add(panelSuperior, BorderLayout.NORTH);
        add(barraLista, BorderLayout.WEST);
        add(barraReceta, BorderLayout.CENTER);
        add(generar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new InterfazGrafica().setVisible(true);
    }

}
