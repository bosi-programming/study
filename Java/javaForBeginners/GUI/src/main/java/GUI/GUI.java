package GUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI {
    public static void main(String[] args) {
        Runnable GUITask = new Runnable() {
            @Override
            public void run() {
                MakeGUI();
            }
        };
        SwingUtilities.invokeLater(GUITask);
    }

    private static void MakeGUI() {
        JFrame frame = new JFrame("Hello World GUI");
        frame.setPreferredSize(new Dimension(400, 400));

        JLabel label = new JLabel("Hi. I am a GUI.");
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
