package de.eightbitboy.klimb;

import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;

public class Klimb extends com.jme3.app.SimpleApplication {

	public static void main(String[] args) {
		Klimb app = new Klimb();
		app.start();
	}

	@Override
	public void simpleInitApp() {
		Box b = new Box(1, 1, 1);
		Geometry geom = new Geometry("Box", b);
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		mat.setColor("Color", ColorRGBA.Blue);
		geom.setMaterial(mat);
		rootNode.attachChild(geom);
	}
}