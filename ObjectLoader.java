package hEvil;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.universe.SimpleUniverse;

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

		Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);

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

	}

	public static void main(String[] args) {

		ObjectLoader frame = new ObjectLoader();
		frame.setSize(1200, 800);
		frame.setVisible(true);

	}

}