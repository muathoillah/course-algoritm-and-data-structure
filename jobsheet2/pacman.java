import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class pacman extends JPanel implements KeyListener {
    private int pacmanX = 50;
    private int pacmanY = 50;

    public pacman() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillArc(pacmanX, pacmanY, 50, 50, 45, 270);
    }

    public void movePacman(int dx, int dy) {
        pacmanX += dx;
        pacmanY += dy;
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                movePacman(0, -5);
                break;
            case KeyEvent.VK_DOWN:
                movePacman(0, 5);
                break;
            case KeyEvent.VK_LEFT:
                movePacman(-5, 0);
                break;
            case KeyEvent.VK_RIGHT:
                movePacman(5, 0);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pacman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new pacman());
        frame.pack();
        frame.setVisible(true);
    }
}

