package hEvil;

import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class GameWorld implements GLEventListener {
	@Override
	public void display(GLAutoDrawable draw) {
		// method body
		final GL2 gl = draw.getGL().getGL2();
		gl.glBegin(GL2.LINES);
		gl.glColor3f(1.0f, 0.5f, 0.7f);
		gl.glVertex3f(0.50f,-0.50f,0);
	      gl.glVertex3f(-0.50f,0.50f,0);
	      gl.glEnd();
	      
	      
	}

	@Override
	public void dispose(GLAutoDrawable draw) {
		// method body
	}

	@Override
	public void init(GLAutoDrawable draw) {
		// method body
	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,
			int arg4) {
		// method body
	}

	public static void game(String[] args) {
		// getting the capabilities object of GL2 profile
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities glc = new GLCapabilities(profile);
		final GLCanvas glCanvas = new GLCanvas(glc);

		GameWorld b = new GameWorld();
		glCanvas.addGLEventListener(b);
		glCanvas.setSize(1200, 800);
		// creating frame
		final JFrame frame = new JFrame("Welcome to Heavy Evil");
		// adding canvas to it
		frame.getContentPane().add(glCanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);

	}

}
