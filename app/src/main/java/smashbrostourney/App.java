/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package smashbrostourney;

import javax.swing.SwingUtilities;

public class App {
    // public App() {
    // SwingUtilities.isEventDispatchThread();
    // Frame f = new Frame(800, 800, "Smash Bros Bracket");
    // Bracket b = new Bracket(16);
    // f.add(b);
    // f.pack();
    // }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? " +
                SwingUtilities.isEventDispatchThread());
        Bracket b = new Bracket(16);
        Frame f = new Frame(800, 800, "Smash Bros Bracket");
        f.add(b);
        f.pack();
    }
}
