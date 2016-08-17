package hEvil;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;

import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;
import com.sun.j3d.utils.universe.SimpleUniverse;

public class ObjectLoader extends Frame {

	private static final long serialVersionUID = 1L;

	public ObjectLoader() {

		setLayout(new BorderLayout());
		GraphicsConfiguration graphicsConfig = SimpleUniverse
				.getPreferredConfiguration();

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

		scene.addChild(modelScene.getSceneGroup());
		universe.addBranchGraph(scene);

	}

	public static void main(String[] args) {

		ObjectLoader framezy = new ObjectLoader();
		framezy.setSize(1200, 800);
		framezy.setVisible(true);

	}
}