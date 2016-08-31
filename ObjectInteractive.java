package hEvil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.util.Map;

import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Shape3D;
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

public class ObjectInteractive extends Frame {

	private static final long serialVersionUID = 819877942509843369L;

	public ObjectInteractive() {

		/*
		 * IN ORDER TO LOAD THE OBJECT MODEL AFTER SEPARATING IT INTO PARTS IN
		 * BLENDER, JAVA3D REQUIRES YOU TO OPEN THE OBJECT IN A TEXT EDITOR AND
		 * ADD "#" IN FRONT OF EVERY OBJECT "o". COMMAND F TO SEARCH FOR TEXT
		 * "o" AND ENTER TO CYCLE, UNLESS IT PROVIDES YOU WITH ARROW KEYS eg.
		 * 
		 * o gargoyle <------wrong
		 * 
		 * # o gargoyle <------right
		 */

		/* Obtain the scene's BranchGroup, from which components are removed */
		GraphicsConfiguration graphicsConfigI = SimpleUniverse
				.getPreferredConfiguration();

		setLayout(new BorderLayout());

		Canvas3D canvas3DI = new Canvas3D(graphicsConfigI);
		add(canvas3DI);
		canvas3DI.setSize(1200, 800);
		canvas3DI.setVisible(true);
		canvas3DI.setBackground(Color.BLACK);

		BranchGroup root = new BranchGroup();
		root.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		root.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);

		ObjectFile loaderI = new ObjectFile(ObjectFile.LOAD_ALL);
		loaderI.setFlags(ObjectFile.RESIZE);

		Color3f light1ColorI = new Color3f(1.8f, 0.1f, 0.1f);

		Vector3f light1DirectionI = new Vector3f(2.0f, 12.0f, -12.0f);

		BoundingSphere boundsI =

		new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);

		DirectionalLight light1I

		= new DirectionalLight(light1ColorI, light1DirectionI);

		light1I.setInfluencingBounds(boundsI);

		root.addChild(light1I);

		/* Remove all children (you don't want a MultiParentException) */

		root.removeAllChildren();

		Shape3D modelI = new Shape3D();
		Scene modelSceneI = null;

		try {
			modelSceneI = loaderI.load("Images/untitled.obj");
			modelI = (Shape3D) modelSceneI.getSceneGroup().getChild(0);
			modelSceneI.getSceneGroup().removeChild(0);
			modelI.getAppearance().getMaterial();

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

		root.addChild(modelSceneI.getSceneGroup());
		root.addChild(modelI);

		SimpleUniverse universeI = new SimpleUniverse(canvas3DI);
		universeI.getViewingPlatform().setNominalViewingTransform();

		universeI.addBranchGraph(root);

		ViewingPlatform viewPlatformI = universeI.getViewingPlatform();

		TransformGroup viewTransformI = viewPlatformI
				.getViewPlatformTransform();

		Transform3D t3dI = new Transform3D();
		t3dI.lookAt(new Point3d(0, 0, 4), new Point3d(0, 0, 0), new Vector3d(0,
				1, 0));
		t3dI.invert();
		viewTransformI.setTransform(t3dI);

	}

	TransformGroup getGargoyle(Scene sceneI) {

		/* Obtain the scene's BranchGroup, from which components are removed */
		BranchGroup rootI = sceneI.getSceneGroup();
		rootI.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		rootI.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);

		rootI.compile();

		@SuppressWarnings("unchecked")
		Map<String, Shape3D> nameMap = sceneI.getNamedObjects();

		TransformGroup transformGroup = new TransformGroup();

		transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

		Transform3D transforms = new Transform3D();

		/* Creates rotation transforms for x, y and z axis */
		Transform3D rotX = new Transform3D();
		Transform3D rotY = new Transform3D();
		Transform3D rotZ = new Transform3D();

		rotX.rotX(15D); // +15 degrees on the X axis
		rotY.rotY(30D); // +30 degrees on the Y axis
		rotZ.rotZ(-20D); // -20 degrees on the Z axis

		/* Combines all rotation transforms */
		transforms.mul(rotX, rotY);
		transforms.mul(transforms, rotZ);

		/* Translation: translates 2 on X, 3 on Y and -10 on Z */
		Vector3f translationVector = new Vector3f(2F, 3F, -10F);
		transforms.setTranslation(translationVector);

		/* Non uniform scaling: scales 3x on X, 1x on Y and 2x on Z */
		Vector3d scale = new Vector3d(3D, 1D, 2D);
		transforms.setScale(scale);

		/* Apply all transformations */
		transformGroup.setTransform(transforms);

		TransformGroup wings = new TransformGroup();
		TransformGroup teeth = new TransformGroup();
		TransformGroup gargoyle = new TransformGroup();
		TransformGroup eyes = new TransformGroup();
		transformGroup.addChild(gargoyle);

		eyes.addChild(nameMap.get("eye_left"));
		eyes.addChild(nameMap.get("eye_right"));
		wings.addChild(nameMap.get("gargoyle.003"));
		wings.addChild(nameMap.get("gargoyle.004"));
		teeth.addChild(nameMap.get("gargoyle.005"));
		teeth.addChild(nameMap.get("gargoyle.006"));
		teeth.addChild(nameMap.get("gargoyle.007"));
		teeth.addChild(nameMap.get("gargoyle.008"));
		teeth.addChild(nameMap.get("gargoyle.009"));
		teeth.addChild(nameMap.get("gargoyle.010"));
		teeth.addChild(nameMap.get("gargoyle.011"));
		teeth.addChild(nameMap.get("gargoyle.012"));
		teeth.addChild(nameMap.get("gargoyle.013"));
		teeth.addChild(nameMap.get("gargoyle.014"));
		teeth.addChild(nameMap.get("gargoyle.015"));
		teeth.addChild(nameMap.get("gargoyle.016"));
		teeth.addChild(nameMap.get("gargoyle.017"));
		teeth.addChild(nameMap.get("gargoyle.018"));
		teeth.addChild(nameMap.get("gargoyle.019"));
		teeth.addChild(nameMap.get("gargoyle.020"));
		teeth.addChild(nameMap.get("gargoyle.021"));
		teeth.addChild(nameMap.get("gargoyle.022"));
		teeth.addChild(nameMap.get("gargoyle.023"));
		teeth.addChild(nameMap.get("gargoyle.024"));
		teeth.addChild(nameMap.get("gargoyle.025"));
		teeth.addChild(nameMap.get("gargoyle.026"));
		teeth.addChild(nameMap.get("gargoyle.027"));
		teeth.addChild(nameMap.get("gargoyle.028"));
		teeth.addChild(nameMap.get("gargoyle.029"));
		teeth.addChild(nameMap.get("gargoyle.030"));
		teeth.addChild(nameMap.get("gargoyle.031"));
		teeth.addChild(nameMap.get("gargoyle.032"));
		teeth.addChild(nameMap.get("gargoyle.033"));
		teeth.addChild(nameMap.get("gargoyle.034"));
		teeth.addChild(nameMap.get("gargoyle.035"));
		teeth.addChild(nameMap.get("gargoyle.036"));
		teeth.addChild(nameMap.get("gargoyle.037"));
		teeth.addChild(nameMap.get("gargoyle.038"));
		teeth.addChild(nameMap.get("gargoyle.039"));
		teeth.addChild(nameMap.get("gargoyle.040"));
		teeth.addChild(nameMap.get("gargoyle.041"));
		teeth.addChild(nameMap.get("gargoyle.042"));
		teeth.addChild(nameMap.get("gargoyle.043"));
		teeth.addChild(nameMap.get("gargoyle.044"));
		teeth.addChild(nameMap.get("gargoyle.045"));
		teeth.addChild(nameMap.get("gargoyle.046"));
		teeth.addChild(nameMap.get("gargoyle.047"));
		teeth.addChild(nameMap.get("gargoyle.048"));
		teeth.addChild(nameMap.get("gargoyle.049"));
		teeth.addChild(nameMap.get("gargoyle.050"));
		teeth.addChild(nameMap.get("gargoyle.051"));
		teeth.addChild(nameMap.get("gargoyle.052"));
		teeth.addChild(nameMap.get("gargoyle.053"));
		teeth.addChild(nameMap.get("gargoyle.054"));
		teeth.addChild(nameMap.get("gargoyle.055"));
		teeth.addChild(nameMap.get("gargoyle.056"));

		/* Construct the groups */

		gargoyle.addChild(teeth);
		gargoyle.addChild(wings);
		gargoyle.addChild(eyes);
		rootI.addChild(gargoyle);

		/* Enable transform capability (it is not enabled by default) */
		enableTransformCapability(eyes, wings, teeth, gargoyle);

		return gargoyle;

	}

	void enableTransformCapability(TransformGroup... parts) {
		for (TransformGroup part : parts) {
			part.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);

		}

	}

	public static void main(String[] args) {

		ObjectInteractive frameObj = new ObjectInteractive();
		frameObj.setSize(1200, 800);
		frameObj.setVisible(true);

	}

}
