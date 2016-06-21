package hEvil;

import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

public class GameWorld extends JFrame implements GLEventListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4398496580240607317L;

	private float rpoly;

	@Override
	public void display(GLAutoDrawable draw) {
		// method body

		final GL2 gl = draw.getGL().getGL2();
		gl.glColor3f(0.33f, 0f, 0f); // applying red

		// Clear The Screen And The Depth Buffer
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity(); // Reset The View
		gl.glRotatef(rpoly, 0.5f, 1.0f, 0.5f);

		gl.glBegin(GL2.GL_POLYGON);

		gl.glVertex3f(0f, 0.5f, 0f);
		gl.glVertex3f(-0.5f, 0.2f, 0f);
		gl.glVertex3f(-0.5f, -0.2f, 0f);
		gl.glVertex3f(0f, -0.5f, 0f);
		gl.glVertex3f(0f, 0.5f, 0f);
		gl.glVertex3f(0.5f, 0.2f, 0f);
		gl.glVertex3f(0.5f, -0.2f, 0f);
		gl.glVertex3f(0f, -0.5f, 0f);

		gl.glEnd();

		gl.glFlush();

		rpoly += 0.2f; // assigning the angle
		
		float[] ambientLight = { 0.1f, 0.f, 0.f, 0f };
		gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, ambientLight, 0);

		
		float[] diffuseLight = { 1f, 2f, 1f, 0f };
		gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, diffuseLight, 0);
		
		

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

	public static void main(String[] args) {
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
		
		final FPSAnimator animator = new FPSAnimator(glCanvas, 300,true ); 
	      animator.start();

	}

}
