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

    public Controller(Ventana vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getBotonIniciarJuego())) {
            this.modelo.setGame();
            this.vista.getPanel().repaint();
            this.vista.setMensaje("Inicia el juego!");
            this.vista.setCboOrigen(modelo.setOrigen());
        }

        if (e.getSource().equals(this.vista.getBotonAtacar())) {
            this.modelo.atacar(this.vista.getComboAtacarOrigen().getSelectedItem().toString()
                    ,this.vista.getComboAtacarDestino().getSelectedItem().toString());

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource().equals(this.vista.getComboAtacarOrigen())) {

            if (this.vista.getComboAtacarOrigen().getSelectedItem() == null) {
                this.vista.getComboMoverDestino().removeAllItems();
            }
            else {
                this.vista.setCboAtacarDestino(modelo.setAtacarDestino(
                        this.vista.getComboAtacarOrigen().getSelectedItem().toString()));
            }
        }

        if (e.getSource().equals(this.vista.getComboMoverOrigen())){

            if(this.vista.getComboMoverOrigen().getSelectedItem() == null){
                this.vista.getComboMoverDestino().removeAllItems();
            }
            else{
                
            }

        }


    }
}
