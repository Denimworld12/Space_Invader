
import javax.swing.*;
public class App{
    public static void main(String[] args) {
        int titlesize=32;
        int rows= 16;
        int column = 16;
        int boardwidth= titlesize*column;
        int boardheight= titlesize*rows;
        JFrame frame = new JFrame("Space Invaders");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        SpaceInvaders spaceInvaders = new SpaceInvaders();
        frame.add(spaceInvaders);
        frame.pack();
        frame.setVisible(true);

    }
} 