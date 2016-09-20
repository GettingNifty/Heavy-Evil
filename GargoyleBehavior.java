package hEvil;

import java.awt.event.KeyEvent;
import java.util.Enumeration;

import javax.media.j3d.Behavior;
import javax.media.j3d.Bounds;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupOnAWTEvent;
import javax.vecmath.Vector3f;



public class GargoyleBehavior extends Behavior {

	TransformGroup[] groups;
	Transform3D[] transforms;
	Vector3f[] translations;
	WakeupOnAWTEvent wake;
	int hitCount;
	int bodyPartIndex;

	public GargoyleBehavior(TransformGroup[] groups) {
		// TODO Auto-generated constructor stub

		this.groups = groups;
		wake = new WakeupOnAWTEvent(KeyEvent.VK_RIGHT);
		translations = new Vector3f[groups.length];
		transforms = new Transform3D[groups.length];

		for (int i = 0; i < groups.length; i++) {
			translations[i] = new Vector3f(0f, 0f, 0f);
			transforms[i] = new Transform3D();
		}
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		wakeupOn(wake);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void processStimulus(Enumeration enumeration) {
		// TODO Auto-generated method stub
		KeyEvent k = (KeyEvent) wake.getAWTEvent()[0];
		if ((k.getKeyCode() == KeyEvent.VK_RIGHT) && (hitCount++ % 4 == 0)) {
			bodyPartIndex = (bodyPartIndex + 1) % 3;

			translations[bodyPartIndex].set(translations[bodyPartIndex].x,
											translations[bodyPartIndex].y,
											translations[bodyPartIndex].z + 0.1f);
			transforms[bodyPartIndex]
					.setTranslation(translations[bodyPartIndex]);
			groups[bodyPartIndex].setTransform(transforms[bodyPartIndex]);

		}
		wakeupOn(wake);
	}

	void addBehavior(TransformGroup[] parts, TransformGroup gargoyle,
			Bounds bounds) {
		Behavior behavior = new GargoyleBehavior(parts);

		behavior.setSchedulingBounds(bounds);
		gargoyle.addChild(behavior);

	
	}

}
