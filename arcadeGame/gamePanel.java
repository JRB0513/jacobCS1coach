// Jacob Bradley
// https://www.youtube.com/watch?v=bI6e6qjJ8JQ
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

class gamePanel extends JPanel implements ActionListener
{
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25; // How big we want the objects to be
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int applex;
    int appley;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    gamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.adKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        g.setColor(Color.red);
        g.fillOval(applex, appley, UNIT_SIZE, UNIT_SIZE);
    }
    public void newApple(){
        applex = random.nextInt((int)(SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appley = random.nextInt((int)(SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        for(int i = 0; i < bodyParts; i++){
            if(i == 0){
                g.setColor(Color.green);
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
            else {
                g.setColor(new Color(45, 180, 0));
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        }
    }
    public void move(){
        for(int i = bodyParts; i > 0; i--){
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch(direction){
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }
    public void checkApple(){
        if((x[0] == applex) && (y[0] == appley)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    public void checkCollisions(){
        // checks if head collides with body
        for(int i = bodyParts; i > 0; i--){
            if((x[0] == x[i] && y[0] == y[i])){
                running = false;
            }
        }
        // if head touches border
        if(x[0] < 0) {
            running = false;
        }
        if(x[0] > SCREEN_WIDTH) {
            running = false;
        }
        if (y[0] < 0) {
            running = false;
        }
        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        if (!running) {
            timer.stop();
        }
    }
    public void gameOver(Graphics g){

    }
    public void actionPreformed(ActionEvent e){
        if(running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}