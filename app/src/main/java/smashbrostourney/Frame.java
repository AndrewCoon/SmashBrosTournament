package smashbrostourney;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Frame extends JFrame {
    private Dimension d = new Dimension();

    public Frame(int frameVert, int frameHor, String frameName) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(frameName);
        this.setSize(frameHor, frameVert);
        this.setLocationRelativeTo(null);
        this.setResizable(true);

        d = new Dimension(frameHor, frameVert);
    }

    // public void add(JPanel j) {
    // super.add(j);
    // this.pack();
    // }

    public void pack() {
        super.pack();
        this.setSize(d);
        this.setVisible(true);
    }

    public void pack(Dimension _d) {
        super.pack();
        this.setSize(_d);
        this.setVisible(true);
    }
}