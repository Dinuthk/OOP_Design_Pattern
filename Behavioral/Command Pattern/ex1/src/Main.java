public class Main {
    public static void main(String[] args) {
        // Receivers
        Light light = new Light();
        Fan fan = new Fan();

        // Concrete Commands
        Command lightOn = new LightOnCommand(light);
        Command fanOff = new FanOffCommand(fan);

        // Invoker
        SmartHomeAssistant assistant = new SmartHomeAssistant();

        // Execute Commands
        assistant.setCommand(lightOn);
        assistant.executeCommand(); // Output: Light is ON

        assistant.setCommand(fanOff);
        assistant.executeCommand(); // Output: Fan is OFF
    }
}
