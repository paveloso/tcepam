package tcepam.week2.tsk67;

@MyInfoAnnotation
public class Submarine {

    private boolean running;

    public boolean isRunning() {
        return running;
    }

    public void onOff() {
        if (!running) {
            Engine engine = new Engine();
            engine.start();
        } else {
            Engine engine = new Engine();
            engine.stop();
        }
    }


    class Engine {
        void start() {
            running = true;
        }

        void stop() {
            running = false;
        }
    }
}
