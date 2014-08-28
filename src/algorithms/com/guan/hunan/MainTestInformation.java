package algorithms.com.guan.hunan;

import java.awt.GraphicsConfiguration;

import javax.media.j3d.Canvas3D;

import com.sun.j3d.utils.universe.SimpleUniverse;

public class MainTestInformation {

	public static void main(String[] args) {


		System.out.println("LD Library Path:" + System.getProperty("java.library.path"));

		GraphicsConfiguration config =
			       SimpleUniverse.getPreferredConfiguration();

			    Canvas3D canvas3D = new Canvas3D(config);
			    System.out.println(canvas3D);
	}

}
