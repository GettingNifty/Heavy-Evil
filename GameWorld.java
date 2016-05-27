package hEvil;

import javax.swing.JFrame;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class GameWorld implements GLEventListener{
		   @Override
		   public void display(GLAutoDrawable arg0) {
		      // method body
		   }
		   @Override
		   public void dispose(GLAutoDrawable arg0) {
		      //method body
		   }
		   @Override
		   public void init(GLAutoDrawable arg0) {
		      // method body
		   }
		   @Override
		   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		      // method body
		   }
		   public static void game(String[] args) {
		      //getting the capabilities object of GL2 profile
		      final GLProfile profile = GLProfile.get(GLProfile.GL2);
		      GLCapabilities glc = new GLCapabilities(profile);
		      final GLCanvas glCanvas = new GLCanvas(glc);
		      
		      GameWorld b = new GameWorld();
		      glCanvas.addGLEventListener(b);
		      glCanvas.setSize(400, 400);
		      //creating frame
		      final JFrame frame = new JFrame (" Basic Frame");
		      //adding canvas to it
		      frame.getContentPane().add(glCanvas);
		      frame.setSize(frame.getContentPane().getPreferredSize());
		      frame.setVisible(true);
		      
		      
		      
		      
		   }
	

}
