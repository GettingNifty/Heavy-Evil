package hEvil;

import java.util.Map;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.loaders.Scene;

public class Transform {

	public Transform() {

	}

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

		/* Enable transform capability (it is not enabled by default) */
		enableTransformCapability(teeth);

		return teeth;
	}

	void enableTransformCapability(TransformGroup... parts) {
		for (TransformGroup part : parts) {
			part.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
