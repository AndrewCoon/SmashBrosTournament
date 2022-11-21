package smashbrostourney;

import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.xml.crypto.dsig.spec.XPathFilter2ParameterSpec;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Graphics;

public class Bracket extends JPanel {
    private int cc;
    private int scale = 5;
    private int horLen = 25;
    private int horOffset = 10;
    private int verLen = 15;
    private int verOffset = 15;
    private int midOffset;

    public Bracket(int _cc) {
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cc = _cc;
        midOffset = 150 * cc / 4;
    }

    public Dimension getPrefferedSize() {
        return new Dimension(960, 540);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        renderInitialBracket(g);
    }

    private void renderInitialBracket(Graphics g) {
        if (cc / 2 % 2 == 0) {
            // Left Side
            for (int i = 1; i <= cc / 2; i++) {
                // Horizontal
                int x1 = horOffset * scale;
                int y1 = (verLen * i) * scale + verOffset;
                int x2 = (horOffset + horLen) * scale;
                int y2 = (verLen * i) * scale + verOffset;
                g.drawLine(x1, y1, x2, y2);

                // Vertical
                x1 = (horOffset + horLen) * scale;
                y1 = (verLen * i) * scale + verOffset;
                x2 = (horOffset + horLen) * scale;
                y2 = (verLen * (i + 1)) * scale + verOffset;
                if (i % 2 != 0)
                    g.drawLine(x1, y1, x2, y2);
            }
            // Right Side
            for (int i = 1; i <= cc / 2; i++) {
                // Horizontal
                int x1 = horOffset * scale + midOffset;
                int y1 = (verLen * i) * scale + verOffset;
                int x2 = (horOffset + horLen) * scale + midOffset;
                int y2 = (verLen * i) * scale + verOffset;
                g.drawLine(x1, y1, x2, y2);

                // Vertical
                x1 = (horOffset + horLen) * scale + midOffset - (horLen * scale);
                y1 = (verLen * i) * scale + verOffset;
                x2 = (horOffset + horLen) * scale + midOffset - (horLen * scale);
                y2 = (verLen * (i + 1)) * scale + verOffset;
                if (i % 2 != 0)
                    g.drawLine(x1, y1, x2, y2);
            }
        }
    }
}
