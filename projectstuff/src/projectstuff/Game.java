package projectstuff;

import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;


import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;

public class Game extends JPanel{
	private static final long serialVersionUID = 1L;
	Player player;
	PossibleHazards ph;
	static int FRAMEHEIGHT = 400;
	static int FRAMEWIDTH = 400;
	public Game(){
		player = new Player(30, 40, 10, 10, 1, 1, 1, 1, "");
		ph = new PossibleHazards();
        ph.generateHazards();
        bindKeyWith("y.up", KeyStroke.getKeyStroke("UP"), new VerticalAction(-(player.getYvel())));
        bindKeyWith("y.down", KeyStroke.getKeyStroke("DOWN"), new VerticalAction(player.getYvel()));
        bindKeyWith("x.left", KeyStroke.getKeyStroke("LEFT"), new HorizontalAction(-(player.getXvel())));
        bindKeyWith("x.right", KeyStroke.getKeyStroke("RIGHT"), new HorizontalAction(player.getXvel()));
	}
    protected void bindKeyWith(String name, KeyStroke keyStroke, Action action) {
        InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getActionMap();
        im.put(keyStroke, name);
        am.put(name, action);
    }
	public boolean isGameOver(){
		if(player.isSalOver()){
			return true;
		}
		else if(player.isSalUnder()){
			return true;
		}
		else if(player.getLife()<=0){
			return true;
		}
		return false;
	}

//    @Override
//    public void keyPressed(KeyEvent e) {
//        switch(e.getKeyCode()){
//        case KeyEvent.VK_RIGHT:
//        	player.setXvel(10);
//        	break;
//        case KeyEvent.VK_LEFT:
//        	player.setXvel(-10);
//        	break;
//        case KeyEvent.VK_KP_UP:
//        	player.setYvel(-10);
//        	break;
//        case KeyEvent.VK_DOWN:
//        	player.setYvel(10);
//        	break;
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        switch(e.getKeyCode()){
//        case KeyEvent.VK_RIGHT:
//        	player.setXvel(0);
//        	break;
//        case KeyEvent.VK_LEFT:
//        	player.setXvel(0);
//        	break;
//        case KeyEvent.VK_UP:
//        	player.setYvel(0);
//        	break;
//        case KeyEvent.VK_DOWN:
//        	player.setYvel(0);
//        	break;
//        }
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//    }
    
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawRect(player.xpos, player.ypos, 30, 30);
		for(int i=0; i<ph.hazards.length; i++){
			g2d.drawOval(ph.hazards[i].getxpos(), ph.hazards[i].getypos(), 20, 20);
		}
		int x=20;
		for(int i=0; i<player.life; i++){
			g2d.drawOval(x, 20, 30, 20);
			x+=40;
		}
		if(isGameOver()){
			g2d.drawString("GAME OVER", 150, 150);
		}
	}
	public void onCollision(){
		for(int i=0; i<ph.hazards.length; i++){
			if(ph.hazards[i].xpos>=player.getXpos()-20&&ph.hazards[i].xpos<=player.getXpos()+30&&ph.hazards[i].getYpos()>=player.getYpos()-20&&ph.hazards[i].getYpos()<=player.getYpos()+30){
				ph.hazards[i].setxpos(900);
				ph.hazards[i].setypos(900);
				player.life--;
			}
		}
	}
	public void update(){
//		player.moveX(player.getXvel());
//		player.moveY(player.getYvel());
		onCollision();
		repaint();
	}
	public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Crab Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.MAGENTA);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
        	game.update();
        }
    }
    public abstract class MoveAction extends AbstractAction {

        private int delta;

        public MoveAction(int delta) {
            this.delta = delta;
        }

        public int getDelta() {
            return delta;
        }

        protected abstract void applyDelta();

        @Override
        public void actionPerformed(ActionEvent e) {
            applyDelta();
        }

    }

    public class VerticalAction extends MoveAction {

        public VerticalAction(int delta) {
            super(delta);
        }

        @Override
        protected void applyDelta() {
            int delta = getDelta();
            player.ypos += delta;
            if (player.ypos < 0) {
                player.ypos = 0;
            } else if (player.ypos + 30 > getHeight()) {
                player.ypos = getHeight() - 30;
            }
            repaint();
        }

    }
    public class HorizontalAction extends MoveAction {

        public HorizontalAction(int delta) {
            super(delta);
        }

        @Override
        protected void applyDelta() {
            int delta = getDelta();
            player.xpos += delta;
            if (player.xpos < 0) {
                player.xpos = 0;
            } else if (player.xpos +30 > getWidth()) {
                player.xpos = getWidth() - 30;
            }
            repaint();
        }

    }
}



