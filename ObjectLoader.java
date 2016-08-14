package hEvil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.swing.JFrame;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.universe.SimpleUniverse;



public class ObjectLoader extends JFrame{

	private static final long serialVersionUID = 1L;

	public ObjectLoader() {
		
		setLayout(new BorderLayout());
		GraphicsConfiguration graphicsConfig = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas3D = new Canvas3D(graphicsConfig);
		add(canvas3D);
		
		SimpleUniverse universe = new SimpleUniverse(canvas3D);
		universe.getViewingPlatform().setNominalViewingTransform();
		
		BranchGroup scene = new BranchGroup();
		

		ObjectFile loader = new ObjectFile(ObjectFile.LOAD_ALL);
		loader.setFlags(ObjectFile.RESIZE);

		Scene modelScene = null;

		try {
			modelScene = loader.load("Images/gargoyle.obj");

		} catch (Exception e) {

		}

		DirectionalLight lighting = new DirectionalLight(new Color3f(
				Color.WHITE), new Vector3f(0f, 0f, -1f));
		lighting.setInfluencingBounds(new BoundingSphere(new Point3d(0.0, 0.0,
				1.0), 100));

		scene.addChild(modelScene.getSceneGroup());
		scene.addChild(lighting);
		universe.addBranchGraph(scene);
		
	}

	public static void main(String[] args) {

		ObjectLoader framezy = new ObjectLoader();
		framezy.setSize(1200, 800);
		framezy.setVisible(true);
		
	}
}