package hEvil;

import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import com.sun.j3d.loaders.objectfile.*;
import com.sun.j3d.loaders.Scene;
import java.awt.Color;
import javax.vecmath.*;

public class ObjectLoader {

	public static void main(String[] args) {
		SimpleUniverse universe = new SimpleUniverse();
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
		universe.getViewingPlatform().setNominalViewingTransform();
	}
}
