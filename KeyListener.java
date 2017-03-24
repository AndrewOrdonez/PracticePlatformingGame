import java.awt.event.*;
public class KeyListen implements KeyListener{

	@Override
	public void keyPressed(KeyEvent q) {
		// TODO Auto-generated method stub
		switch (q.getKeyCode()){
		case 37:Runner.left=true;
		break;
		case 39:Runner.right=true;break;
		case 40:Runner.down=true;break;
		case 38:
			if(!Runner.j){
			Runner.j=true;}
		break;
		}
	}

	@Override
	public void keyReleased(KeyEvent q) {
		// TODO Auto-generated method stub
		switch(q.getKeyCode()){
		case 37:Runner.left=false;
		break;
		case 39:Runner.right=false;break;
		case 40:Runner.down=false;break;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
