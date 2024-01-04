import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GUI
{
    public GUI()
    {
        JFrame frame = new JFrame("minecraft");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon minecraft = new ImageIcon("src/eaton.jpg");
        JLabel label = new JLabel(minecraft);
        frame.add(label);
        label.setPreferredSize(new Dimension(1920, 1080));

        frame.pack();
        frame.setVisible(true);

        //button
//        JFrame myFrame = new JFrame("Button");
//
//        myFrame.setLocation(new Point(100, 100));
//        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BorderLayout());
//        myFrame.getContentPane().add(mainPanel);
//        mainPanel.add(new JButton("Button Text"), BorderLayout.CENTER);
//
//        myFrame.pack();
//        myFrame.setLocationByPlatform(true);
//        myFrame.setVisible(true);
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
//        gbc.anchor = GridBagConstraints.NORTH;
//
//        add(new JLabel("button"), gbc);
//
//        gbc.anchor = GridBagConstraints.CENTER;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//
//        JPanel buttons = new JPanel(new GridBagLayout());
//        buttons.add(new JButton("Start"), gbc);
//        gbc.weighty = 1;
//        add(buttons, gbc);

    }
}