package hEvil;

import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

public class GameIntro extends JFrame implements GLEventListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4398496580240607317L;

	private double rpoly;

	public void display(GLAutoDrawable draw) {
		// method body

		final GL2 gl = draw.getGL().getGL2();
		gl.glColor3d(3d, 2d, 1d);

		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity(); // Reset The View
		gl.glScaled(1.2d, 1.d, 0.4d);
		gl.glRotated(rpoly, 0.5d, 1.0d, 0.5d);
		gl.glTranslated(0.1d, 0d, 0.1d);

		gl.glBegin(GL2.GL_POLYGON);

		gl.glVertex3d(0f, 0.51f, 0f);
		gl.glVertex3d(-0.51f, 0.25f, 0f);
		gl.glVertex3d(-0.51f, -0.25f, 0f);
		gl.glVertex3d(0f, -0.51f, 0f);
		gl.glVertex3d(0f, 0.51f, 0f);
		gl.glVertex3d(0.51f, 0.25f, 0f);
		gl.glVertex3d(0.51f, -0.25f, 0f);
		gl.glVertex3d(0f, -0.5f, 0f);

		gl.glEnd();

		gl.glFlush();

		rpoly -= 0.5f; // assigning the angle

		gl.glEnable(GL2.GL_LIGHTING);
		gl.glEnable(GL2.GL_LIGHT1);
		gl.glEnable(GL2.GL_NORMALIZE);
		
		float[] ambientLight = { 2.1f, 0.f, 10.f, 1f };
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_ACCUM_ALPHA_BITS, ambientLight, 0);
		
		

		float[] diffuseLight = { 1f, 1f, 1f, 1f };
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, diffuseLight, 2);

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

	}

	public static void main(String[] args) {
		// getting the capabilities object of GL2 profile
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities glc = new GLCapabilities(profile);
		final GLCanvas glCanvas = new GLCanvas(glc);

		GameIntro b = new GameIntro();
		glCanvas.addGLEventListener(b);
		glCanvas.setSize(1300, 800);
		// creating frame
		final JFrame frame = new JFrame("Welcome to Heavy Evil");
		// adding canvas to it
		frame.getContentPane().add(glCanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);

		final FPSAnimator animator = new FPSAnimator(glCanvas, 800, true);
		animator.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Component#isDoubleBuffered()
	 */
	@Override
	public boolean isDoubleBuffered() {
		// TODO Auto-generated method stub
		return super.isDoubleBuffered();

	}

}
