package EnhancedVersion;

import javax.swing.*;
public class App {
    public static void main(String[] args) {
        //game window in the form of dimensions in pixels
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame jFrame = new JFrame("Likhith's Flappy Bird");
//        jFrame.setVisible(true);
        jFrame.setSize(boardWidth,boardHeight);
        jFrame.setLocationRelativeTo(null); //place the window at the center of screen
        jFrame.setResizable(false); //user cannot resize the window
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        jFrame.add(flappyBird);
        jFrame.pack();
        flappyBird.requestFocus();
        jFrame.setVisible(true);
    }
}

