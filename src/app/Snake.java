package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Snake extends JFrame {
 int widht = 640;
 int height = 480;

 Point snake;
 int widhtPoint=10;
 int heightPoint=10;

 ImagenSnake ImagenSnake;

    public Snake() {
        setTitle("Snake");
        setSize(widht, height);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-widht/2 , dim.height/2-height/2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Teclas teclas = new Teclas();
        this.addKeyListener(teclas);

        snake = new Point(widht/2,height/2);


        ImagenSnake = new ImagenSnake();
        this.getContentPane().add(ImagenSnake);


        setVisible(true);
    }

    public static void main(String [] args) throws Exception {
        Snake s = new Snake();
    }


    public class ImagenSnake extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(new Color(0,0,255));
            g.drawRect(snake.x, snake.y, widhtPoint, heightPoint);

        }
    }

    public class Teclas extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            }
        }
    }


}
