package hEvil;

import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

public class GameIntro extends JFrame implements GLEventListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4398496580240607317L;

	private double rpoly;

	GLU glu = new GLU();
	GLUT glut = new GLUT();

	public void display(GLAutoDrawable draw) {
		// method body

		final GL2 gl = draw.getGL().getGL2();
		gl.glColor3d(0d, 0d, 0d);
		

		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();

		gl.glRotated(rpoly, -0.015d, -2/7.4d * Math.PI, -0.0135d);
		gl.glTranslated(0, 0, -300);
        gl.glPushMatrix();
		glut.glutWireSphere(110, 150, 150);
		gl.glPopMatrix();

		gl.glFlush();

		rpoly -= -0.975; // assigning the angle

		gl.glEnable(GL2.GL_LIGHTING);
		gl.glEnable(GL2.GL_LIGHT1);
		gl.glEnable(GL2.GL_NORMALIZE);

		float[] ambientLight = { 2.1f, 3.f, 2.f, 3f };
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_AMBIENT, ambientLight, 0);

		float[] diffuseLight = { 0f, 2.3f, 1f, 0f };
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, diffuseLight, 1);

	}

	@Override
	public void dispose(GLAutoDrawable draw) {
		// method body
	}

	@Override
	public void init(GLAutoDrawable draw) {
		// method body
		GL2 gl = draw.getGL().getGL2(); // get the OpenGL graphics context
		glu = new GLU(); // get GL Utilities
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // set background (clear) color
		gl.glClearDepth(1f); // set clear depth value to farthest
		gl.glEnable(GL2.GL_DEPTH_TEST); // enables depth testing
		gl.glDepthFunc(GL2.GL_LEQUAL); // the type of depth test to do
		gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST); // best
																		// perspective
																		// correction
		gl.glShadeModel(GL2.GL_SMOOTH_POINT_SIZE_GRANULARITY);
	}

	@Override
	public void reshape(GLAutoDrawable draw, int y, int x, int width, int height) {

		GL2 gl = draw.getGL().getGL2(); // get the OpenGL 2 graphics contex
		if (height == 0)
			height = 1; // prevent divide by zero
		float aspect = (float) width / height;
		gl.glPushMatrix();
		// Set the view port (display area) to cover the entire window
		gl.glViewport(0, 0, width, height);
		glu.gluLookAt(0, 0, 0, 0, 0, 0, 0, 0, 0);
		

		// Setup perspective projection, with aspect ratio matches viewport
		gl.glMatrixMode(GL2.GL_PROJECTION); // choose projection matrix
		gl.glLoadIdentity(); // reset projection matrix
		glu.gluPerspective(90, aspect, 1, 1000); // fovy, aspect, zNear, zFar

		// Enable the model-view transform
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity(); // reset
		gl.glPopMatrix();

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

		final FPSAnimator animator = new FPSAnimator(glCanvas, 120, true);
		animator.start();
		
		glCanvas.isDoubleBuffered();

	}

}
