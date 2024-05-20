// Jacob Bradley
// https://www.youtube.com/watch?v=bI6e6qjJ8JQ
import java.swing.JFrame;

class gameFrame extends JFrame
{
    gameFrame(){
        this.add(new gamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        // Takes JFrame and fits it around all the other stuff
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}