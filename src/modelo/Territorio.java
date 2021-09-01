package modelo;

import java.util.ArrayList;

public class Territorio {

    private String nombre;
    private int soldados;
    private char pertenece;
    private ArrayList<Territorio> vecinos;
    private boolean visitado;

    public Territorio(String nombre){
        this.nombre = nombre;
        this.soldados = 0;
        this.pertenece = '0';
        this.vecinos = new ArrayList<Territorio>();
        this.visitado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSoldados() {
        return soldados;
    }

    public void setSoldados(int soldados) {
        this.soldados = soldados;
    }

    public char getPertenece() {
        return pertenece;
    }

    public void setPertenece(char pertenece) {
        this.pertenece = pertenece;
    }

    public ArrayList<Territorio> getVecinos() {
        return vecinos;
    }

    public void setVecinos(ArrayList<Territorio> vecinos) {
        this.vecinos = vecinos;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
}
