package hello;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.junit.Test;
import groovy.util.logging.Slf4j;

@Slf4j
class HelloWorldTest {

    /**
    * Simply does a minimal test bringing up a display. An exception in the process will fail this test
    **/
    @Test
    void trySetupDisplay() {
        try {
            log.info "Creating test display"
            Display.setTitle("Hello World")
            Display.create()
            assert Display.isCreated()
        } finally {
            Display.destroy()
        }
    }

}