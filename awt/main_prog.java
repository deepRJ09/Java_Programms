import  java.awt.*;
import  java.awt.event.*;
public class main_prog {
    public static void main(String[] args) {
Frame frame=new Frame("Deepanshu");
Button button=new Button("Click here");
frame.add(button);
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Printed");
    }
});
frame.setLayout(new FlowLayout());
frame.setSize(300,100);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter() {
    @Override
    public void windowOpened(WindowEvent e) {
        System.exit(0);
    }
});
    }
}
