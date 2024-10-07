package Space_Invader;
import javax.swing.*;
public class App{
    public static void main(String[] args) {
        int titlesize=32;
        int rows= 16;
        int colm = 16;
        int boardwidth= titlesize*colm;
        int boardheight= titlesize*rows;
        JFrame frame = new JFrame("Space Invaders");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 