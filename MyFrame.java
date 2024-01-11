import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    private JButton play;
    private JButton balance;
    private JLabel label;
    private boolean next;
    MyFrame(){
        ImageIcon icon=new ImageIcon("play.png");
        ImageIcon instructions=new ImageIcon("instructions.png");

        //insert a picture what you want your play button to look like
        JButton play=new JButton();
        play.setBounds(500,300, 1000,400);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == play) {
                    System.out.println("Hey");
                    play.setEnabled(false);
                    next=true;
                    //button.setEnabled("false); makes it so the button could only be used once
                    //label.setVisible(true); could make a label appear true;
                }
            }

        } );
        //play.setText("I'm a Button!");
        play.setFocusable(false);
        play.setIcon(icon);
        play.setHorizontalTextPosition(JButton.CENTER);
        play.setVerticalTextPosition(JButton.CENTER);
       // play.setFont(new Font("Comic Sans",Font.BOLD,25));
        //play.setForeground(Color.cyan);  //change text color
        //play.setBackground(Color.LightGray);
        play.setBorder(BorderFactory.createEtchedBorder());


       //label
        JLabel label=new JLabel();
        label.setIcon(instructions);
        label.setBounds(0,0,1920,180);
        label.setVisible(true);


        //jpanel
        JPanel first=new JPanel();
        //first.add(image.png); // add an image here
        //first.setBounds(0,0,1920,1080); //sets the size
        first.setVisible(true);


        JPanel intro = new JPanel();
        intro.setBounds(0,0,1920,1080);
        intro.add(label); //use the label as a background








        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.add(first);
        this.add(play);
        while(!next){
           System.out.println(next);
        }
        System.out.println(next);
        first.setVisible(false);
        frame.remove
        intro.setVisible(true);
        this.add(intro);
        this.show();

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            System.out.println("Hey");
            play.setEnabled(false);
            //makes it so the button could only be used once
            //label.setVisible(true); could make a label appear true;
            next=true;
        }
    }
}
