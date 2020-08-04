import javax.swing.*;

public class TankGame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.add(new GameClient(1024,768));
        frame.setTitle("坦克大戰");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
