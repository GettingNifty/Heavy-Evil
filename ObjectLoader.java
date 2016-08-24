package hEvil;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.ViewingPlatform;

public class ObjectLoader extends Frame {

	private static final long serialVersionUID = -6838195075088188544L;

	public ObjectLoader() {

		setLayout(new BorderLayout());
		GraphicsConfiguration graphicsConfig = SimpleUniverse
				.getPreferredConfiguration();

		Canvas3D canvas3D = new Canvas3D(graphicsConfig);
		add(canvas3D);
		canvas3D.setSize(1200, 800);
		canvas3D.setVisible(true);

		BranchGroup scene = new BranchGroup();

		ObjectFile loader = new ObjectFile(ObjectFile.LOAD_ALL);
		loader.setFlags(ObjectFile.RESIZE);

		Color3f light1Color = new Color3f(1.8f, 0.1f, 0.1f);

		BoundingSphere bounds =

		new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);

		Vector3f light1Direction = new Vector3f(2.0f, 12.0f, -12.0f);

		DirectionalLight light1

		= new DirectionalLight(light1Color, light1Direction);

		light1.setInfluencingBounds(bounds);

		scene.addChild(light1);

		Scene modelScene = null;

		try {
			modelScene = loader.load("Images/gargoyle.obj");

		} catch (Exception e) {

		}

		scene.addChild(modelScene.getSceneGroup());

		SimpleUniverse universe = new SimpleUniverse(canvas3D);
		universe.getViewingPlatform().setNominalViewingTransform();

		universe.addBranchGraph(scene);
		
		ViewingPlatform viewPlatform = universe.getViewingPlatform();
	    TransformGroup viewTransform = viewPlatform.getViewPlatformTransform();
	    Transform3D t3d = new Transform3D();
	    viewTransform.getTransform(t3d);
	    t3d.lookAt(new Point3d(0, 0, 4), new Point3d(0, 0, 0), new Vector3d(0, 1, 0));
	    t3d.invert();
	    viewTransform.setTransform(t3d);

	}

	public static void main(String[] args) {

		ObjectLoader frame = new ObjectLoader();
		frame.setSize(1200, 800);
		frame.setVisible(true);

	}

}