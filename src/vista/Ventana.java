package vista;

import controlador.Controller;

import javax.swing.*;

public class Ventana extends JFrame {

    private Panel panel = new Panel();
    private Controller controller;

    //JLabels

    private JLabel labelMoverOrigen = new JLabel("Origen:");
    private JLabel labelMoverDestino = new JLabel("Destino:");
    private JLabel labelAtacarOrigen = new JLabel("Origen:");
    private JLabel labelAtacarDestino = new JLabel("Destino:");
    private JLabel labelModuloAtaque = new JLabel("Modulo de Ataque");
    private JLabel labelModuloMover = new JLabel("Movimiento de Tropas");
    private JLabel labelEventos = new JLabel("Acciones:");

    //ComboBoxes

    private JComboBox<String> comboMoverOrigen = new JComboBox<String>();
    private JComboBox<String> comboMoverDestino = new JComboBox<String>();
    private JComboBox<String> comboAtacarOrigen = new JComboBox<String>();
    private JComboBox<String> comboAtacarDestino = new JComboBox<String>();

    //Botones

    private JButton botonMoverTropas = new JButton("Mover Tropas");
    private JButton botonAtacar = new JButton("Atacar!");
    private JButton botonTerminarTurno = new JButton("Terminar Turno");

    //Ventana de Eventos

    private JTextArea textoLogs = new JTextArea();
    private JScrollPane scrollPaneTexto = new JScrollPane(textoLogs);

    public Ventana(){

        this.setSize(1200,750);
        this.setTitle("Risk");
        this.initComponents();
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {

        this.add(panel);

        this.add(labelModuloMover);
        this.labelModuloMover.setBounds(50,550,200,30);

        this.add(labelMoverOrigen);
        this.labelMoverOrigen.setBounds(15,600,69,30);

        this.add(comboMoverDestino);
        this.comboMoverDestino.setBounds(100,630,150,30);

        this.add(labelMoverDestino);
        this.labelMoverDestino.setBounds(15,630,69,30);

        this.add(comboMoverOrigen);
        this.comboMoverOrigen.setBounds(100,600,150,30);

        this.add(botonMoverTropas);
        this.botonMoverTropas.setBounds(40,680,150,30);

        this.add(labelModuloAtaque);
        this.labelModuloAtaque.setBounds(450,550,200,30);

        this.add(labelAtacarOrigen);
        this.labelAtacarOrigen.setBounds(415,600,69,30);

        this.add(labelAtacarDestino);
        this.labelAtacarDestino.setBounds(415,630,69,30);

        this.add(comboAtacarOrigen);
        this.comboAtacarOrigen.setBounds(485,600,150,30);

        this.add(comboAtacarDestino);
        this.comboAtacarDestino.setBounds(485,630,150,30);

        this.add(botonAtacar);
        this.botonAtacar.setBounds(440,680,150,30);

        this.add(labelEventos);
        this.labelEventos.setBounds(875,15,100,30);

        this.add(scrollPaneTexto);
        this.textoLogs.setEditable(false);
        this.scrollPaneTexto.setBounds(875,50,275,400);

        this.add(botonTerminarTurno);
        this.botonTerminarTurno.setBounds(675,635,150,75);

    }

    public void setController(Controller controller){
        this.controller = controller;

    }

}
