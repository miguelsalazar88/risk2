package vista;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private Image worldMap = new ImageIcon(getClass().getResource("/imagenes/Risk3.png")).getImage();


    public Panel(){
        this.setSize(850,700);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        g.drawImage(worldMap,0,0,null);
    }

}
