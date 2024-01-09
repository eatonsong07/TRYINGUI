import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    JButton play;
    JButton balance;
    JLabel label;
    MyFrame(){
        ImageIcon icon=new ImageIcon("point.png"); //insert a picture what you want your play button to look like
        JButton play=new JButton();
        play.setBounds(0,0,100,100);
        play.addActionListener(this);
        play.setText("I'm a Button!");
        play.setFocusable(false);
        play.setIcon(icon);
        play.setHorizontalTextPosition(JButton.CENTER);
        play.setVerticalTextPosition(JButton.CENTER);
        play.setFont(new Font("Comic Sans",Font.BOLD,25));
        //play.setForeground(Color.cyan);  //change text color
        //play.setBackground(Color.LightGray);
        play.setBorder(BorderFactory.createEtchedBorder());


        //balance button




        //label
        label=new JLabel();
        label.setIcon();
        label.setBounds(100,100,100,100);
        label.setVisible(false);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.add(play);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==play){
            System.out.println("Hey");
            //button.setEnabled("false); makes it so the button could only be used once
            //label.setVisible(true); could make a label appear true;
        }
    }
}
