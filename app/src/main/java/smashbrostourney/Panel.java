package smashbrostourney;

import javax.swing.JPanel;
import java.awt.Color;

public class Panel extends JPanel {
    int x, y, type, xSize, ySize;

    Color color;

    public Panel(int startX, int startY, int _xSize, int _ySize) {
        this.xSize = _xSize;
        this.ySize = _ySize;
        this.setBounds(startX, startY, xSize, ySize);
    }
}