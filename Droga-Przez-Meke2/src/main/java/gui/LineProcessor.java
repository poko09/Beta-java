package gui;

public class LineProcessor extends App implements Runnable {

    Runnable LineProcessor = new LineProcessor();  // won't this cause infinite recursion?
    App newSimulation = new App();


//    public LineProcessor() {
//        // ...
//    }

    @Override
    public void run() {
        newSimulation.init();

    }
}
