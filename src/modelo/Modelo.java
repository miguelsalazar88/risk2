package modelo;

import vista.Ventana;

import java.util.ArrayList;

public class Modelo {

    private Ventana ventana;
    private Rungame rungame;
    ArrayList<Territorio> territoriosModelo;

    public Modelo(Ventana ventana) {
        this.ventana = ventana;
        this.rungame = new Rungame();
        this.territoriosModelo = rungame.setTerritorios();
    }

    public void setGame(){
        this.ventana.getPanel().setTerritoriosVista(territoriosModelo);
    }

    public void moverTropas(){

    }

    //Setea el comboBox de la ventana para que vea las opciones de origen

    public ArrayList<String> setOrigen(){
        ArrayList<String> nombresRojos = new ArrayList<String>();

        for (int i = 0; i < territoriosModelo.size(); i++) {
            if(territoriosModelo.get(i).getPertenece()=='r'){
                nombresRojos.add(territoriosModelo.get(i).getNombre());
            }
        }
        return nombresRojos;
    }

    //Setea el comboBox de la ventana para que se vean las opciones de ataque posibles.

    public ArrayList<String> setAtacarDestino(String origen){
        ArrayList<String> atacarDestino = new ArrayList<>();


        for (int i = 0; i <territoriosModelo.size(); i++) {
            if(territoriosModelo.get(i).getNombre().equals(origen)){
                for (int j = 0; j <territoriosModelo.get(i).getVecinos().size(); j++) {
                    if (territoriosModelo.get(i).getVecinos().get(j).getPertenece()=='a'){
                        atacarDestino.add(territoriosModelo.get(i).getVecinos().get(j).getNombre());
                    }
                }
            }
        }

        return atacarDestino;

    }



    public void atacar(){

    }

    //Getters y Setters


    public ArrayList<Territorio> getTerritoriosModelo() {
        return territoriosModelo;
    }

    public void setTerritoriosModelo(ArrayList<Territorio> territoriosModelo) {
        this.territoriosModelo = territoriosModelo;
    }
}
