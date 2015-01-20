package hello;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

public class HelloWorld {
    public static void main (String args[]){
        try {
            Display.setTitle("Hello World");
            Display.create();

            while(!Display.isCloseRequested()){
                Thread.sleep(100);      
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Display.destroy();
        }
    }
}