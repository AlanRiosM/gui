import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Datos frame=new Datos();
                frame .setSize(400, 400);
                frame.setVisible(true);
            }
        });

    }
}