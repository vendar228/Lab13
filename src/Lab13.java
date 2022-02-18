import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab13 extends Frame {
    Lab13(){
        setTitle("Simple AWT App");
        setSize(400, 400);
        setLocation(500, 500);
        setLayout(new FlowLayout());
        Button button = new Button("Click me");
        add(button);
        Button button1 = new Button("Click me");
        add(button1);
        Button button2 = new Button("Click me");
        add(button2);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Lab13();
    }
}
