package controlador;

import modelo.Modelo;
import modelo.Territorio;
import vista.Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controller implements ActionListener, ItemListener {

    private Ventana vista;
    private Modelo modelo;

    public Controller(Ventana vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.getBotonIniciarJuego())){
            this.modelo.setGame();
            this.vista.getPanel().repaint();
            this.vista.setMensaje("Inicia el juego!");
            this.vista.setCboOrigen(modelo.setOrigen());
        }

        System.out.println("Eureka");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getSource().equals(this.vista.getComboAtacarOrigen())){
            this.vista.setCboAtacarDestino(modelo.setAtacarDestino(this.vista.getComboAtacarOrigen().getSelectedItem().toString()));
        }
    }
}
