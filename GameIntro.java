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

public class GameIntro extends JFrame implements GLEventListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4398496580240607317L;

	private double rpoly;
	
	GLU glu = new GLU();

	public void display(GLAutoDrawable draw) {
		// method body

		final GL2 gl = draw.getGL().getGL2();
		gl.glColor3d(3d, 2d, 1d);

		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();// Reset The View
		gl.glScaled(0.5d, 0.5d, -1.0d);
		gl.glRotated(rpoly, -0.1d, -1d/7.4*Math.PI, -0.1d);
		gl.glTranslated(0.1d, 0d, 0.1d);

		gl.glBegin(GL2.GL_QUADS);

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

		rpoly -= -0.5375; // assigning the angle

		gl.glEnable(GL2.GL_LIGHTING);
		gl.glEnable(GL2.GL_LIGHT1);
		gl.glEnable(GL2.GL_NORMALIZE);
		
		float[] ambientLight = { 2.1f, 3.f, 10.f, 1f };
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_ACCUM_ALPHA_BITS, ambientLight, 0);
		
		

		float[] diffuseLight = { 3f, 2.3f, 1f, 1f };
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, diffuseLight, 2);

	}

	@Override
	public void dispose(GLAutoDrawable draw) {
		// method body
	}

	@Override
	public void init(GLAutoDrawable draw) {
		// method body
		 GL2 gl = draw.getGL().getGL2();      // get the OpenGL graphics context
	      glu = new GLU();                         // get GL Utilities
	      gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // set background (clear) color
	      gl.glClearDepth(1f);      // set clear depth value to farthest
	      gl.glEnable(GL2.GL_DEPTH_TEST); // enables depth testing
	      gl.glDepthFunc(GL2.GL_LEQUAL);  // the type of depth test to do
	      gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST); // best perspective correction
	      gl.glShadeModel(GL2.GL_SMOOTH);
	}

	@Override
	public void reshape(GLAutoDrawable draw, int y, int x, int width,
			int height) {
		
		GL2 gl = draw.getGL().getGL2();  // get the OpenGL 2 graphics context
		 
	      if (height == 0) height = 1;   // prevent divide by zero
	      float aspect = (float)width / height;
	 
	      // Set the view port (display area) to cover the entire window
	      gl.glViewport(0, 0, width, height);
	 
	      // Setup perspective projection, with aspect ratio matches viewport
	      gl.glMatrixMode(GL2.GL_PROJECTION);  // choose projection matrix
	      gl.glLoadIdentity();             // reset projection matrix
	      glu.gluPerspective(225d, aspect, 0.0364d, 110.0); // fovy, aspect, zNear, zFar
	 
	      // Enable the model-view transform
	      gl.glMatrixMode(GL2.GL_MODELVIEW);
	      gl.glLoadIdentity(); // reset

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

	
	}

}
