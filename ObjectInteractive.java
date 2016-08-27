package hEvil;

import java.awt.BorderLayout;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 819877942509843369L;

	
		
		
		

		
	
		TransformGroup getGargoyle(Scene scene1) {

			/* Obtain the scene's BranchGroup, from which components are removed */
			BranchGroup root = scene1.getSceneGroup();
			
			Map<String, Shape3D> nameMap = scene1.getNamedObjects();

			for (String name : nameMap.keySet()) {
				System.out.printf("Name: %s\n", name);
			}
			/* Remove all children (you don't want a MultiParentException) */

			root.removeAllChildren();

			/* Construct the groups */
			TransformGroup teeth = new TransformGroup();
			TransformGroup gargoyle = new TransformGroup();
			
			ObjectFile loader = new ObjectFile(ObjectFile.LOAD_ALL);
			loader.setFlags(ObjectFile.RESIZE);
			
			Color3f light1Color = new Color3f(1.8f, 0.1f, 0.1f);
			
			Vector3f light1Direction = new Vector3f(2.0f, 12.0f, -12.0f);
			
			BoundingSphere bounds =

					new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
			
			DirectionalLight light1

			= new DirectionalLight(light1Color, light1Direction);

			light1.setInfluencingBounds(bounds);

			root.addChild(light1);

			Scene modelScene = null;
			Shape3D model = nameMap.get("gargoyle");
			
			ObjectFile loader1 = new ObjectFile(ObjectFile.LOAD_ALL);
			loader1.setFlags(ObjectFile.RESIZE);

			try {
				modelScene = loader1.load("Images/untitled.obj");
				model = (Shape3D) modelScene.getSceneGroup().getChild(0);
				modelScene.getSceneGroup().removeChild(0);
				model.getAppearance().getMaterial();

			} catch (Exception e) {
				e.printStackTrace();
			}

			root.addChild(modelScene.getSceneGroup());
			root.addChild(model);
			
			GraphicsConfiguration graphicsConfig = SimpleUniverse
					.getPreferredConfiguration();
			
			setLayout(new BorderLayout());
			
			Canvas3D canvas3D = new Canvas3D(graphicsConfig);
			add(canvas3D);
			canvas3D.setSize(1200, 800);
			canvas3D.setVisible(true);
			
			SimpleUniverse universe = new SimpleUniverse(canvas3D);
			universe.getViewingPlatform().setNominalViewingTransform();

			universe.addBranchGraph(root);

			ViewingPlatform viewPlatform = universe.getViewingPlatform();
			TransformGroup viewTransform = viewPlatform.getViewPlatformTransform();
			Transform3D t3d = new Transform3D();
			viewTransform.getTransform(t3d);
			t3d.lookAt(new Point3d(0, 0, 4), new Point3d(0, 0, 0), new Vector3d(0,
					1, 0));
			t3d.invert();
			viewTransform.setTransform(t3d);

			/* Build the graph --> LEFT LEGS */
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

			
			gargoyle.addChild(teeth);

			/* Enable transform capability (it is not enabled by default) */
			enableTransformCapability(teeth, gargoyle);

			return gargoyle;
		}
		
		void enableTransformCapability(TransformGroup... parts) {
			for (TransformGroup part : parts) {
				part.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
				
				
			}
		
		
		
		
		}

	

	
	public static void main(String[] args) {

		ObjectInteractive frame = new ObjectInteractive();
		frame.setSize(1200, 800);
		frame.setVisible(true);

	}

}
