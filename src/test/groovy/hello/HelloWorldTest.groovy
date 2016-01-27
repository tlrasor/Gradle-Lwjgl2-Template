package hello

import groovy.util.logging.Slf4j
import org.junit.Test
import org.lwjgl.opengl.Display
import org.thathanka.lglw2.HelloWorld

@Slf4j
class HelloWorldTest {

    /**
     * Simply does a minimal test bringing up a display. An exception in the process will fail this test
     **/
    @Test
    void testInit() {
        try {
            log.info "Creating test display"
            new HelloWorld().init()
            assert Display.isCreated()
        } finally {
            Display.destroy()
        }
    }

}