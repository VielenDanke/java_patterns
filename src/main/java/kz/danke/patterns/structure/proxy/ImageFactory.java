package kz.danke.patterns.structure.proxy;

//Factory to get image objects. 
public class ImageFactory {
	//We'll provide proxy to caller instead of real object
	public static Image getImage(String filename) {
	    return new ImageProxy(filename);
    }
}
