import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JButton jbut = new JButton("<--");
    private JButton jbut1 = new JButton("-->");
    private JButton jbut2 = new JButton("EXID");
    private JLabel jlb = new JLabel(">o<");
    public int x = 50;
    public MainFrame (){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbut.setLocation(100,100);
        jbut.setSize(100,100);
        jbut1.setLocation(350,100);
        jbut1.setSize(100,100);
        jlb.setBounds(x,300,100,100);
        jbut2.setBounds(600,100,100,100);

        this.add(jbut);
        this.add(jbut1);
        this.add(jbut2);
        this.add(jlb);


        this.setLocation(500,500);
        this.setSize(1280,720);
        this.setLayout(null);

        jbut.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=20;
                jlb.setLocation(x,300);
            }
        });
        jbut1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=20;
                jlb.setLocation(x,300);
            }
        });
        jbut2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
