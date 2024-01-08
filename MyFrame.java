import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){

        JButton play=new JButton();
        play.setBounds(0,0,100,100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.add(play);
    }
    public void actionPerformed(ActionEvent e){

    }
}