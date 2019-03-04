package org.thathanka.lwjgl2

import groovy.util.logging.Slf4j
import org.lwjgl.opengl.Display

/**
 * Created by travis on 1/27/16.
 */
@Slf4j
class HelloWorld {

    def init(){
        Display.setTitle("Hello World");
        Display.create();
    }

    def run(){
        try {
            init()
            while (!Display.isCloseRequested()) {
                Thread.sleep(100);
            }
        } catch (Exception e) {
            log.error("Exception: $e")
        } finally {
            Display.destroy();
        }
    }

    static void main(String[] args) {
        new HelloWorld().run()
    }
}
