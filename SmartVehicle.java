import java.util.Random;
import java.util.concurrent.TimeUnit;

// This is the Demo Code for Major Project that consists of a various class that will be used within the project.
// The SmartVehicle class represents a vehicle with various smart features such as autopilot, obstacle detection, GPS navigation, gas detection, lane assist, and speed control.
// The class provides methods to enable and simulate these features, as well as to check for obstacles, harmful gases, and navigate to a destination.
// The main function demonstrates the functionality of the SmartVehicle class by enabling features, performing vehicle operations, and sending data to a mobile device.
// The class uses random values and time delays to simulate real-world scenarios and interactions between the vehicle's smart features.
// The SmartVehicle class can be further extended and customized to include additional features and functionalities based on specific requirements and use cases.
// Commit and Done.

public class SmartVehicle {

    // Vehicle features status
    private boolean autopilotEnabled;
    private boolean obstacleDetectionEnabled;
    private boolean gpsEnabled;
    private boolean gasDetectionEnabled;
    private boolean laneAssistEnabled;
    private boolean speedControlEnabled;

    // Constructor to initialize all features to off
    public SmartVehicle() {
        this.autopilotEnabled = false;
        this.obstacleDetectionEnabled = false;
        this.gpsEnabled = false;
        this.gasDetectionEnabled = false;
        this.laneAssistEnabled = false;
        this.speedControlEnabled = false;
    }

    // Function to enable autopilot mode
    public void enableAutopilot() {
        this.autopilotEnabled = true;
        System.out.println("Autopilot mode enabled.");
    }

    // Function to enable obstacle detection
    public void enableObstacleDetection() {
        this.obstacleDetectionEnabled = true;
        System.out.println("Obstacle detection enabled.");
    }

    // Function to enable GPS
    public void enableGPS() {
        this.gpsEnabled = true;
        System.out.println("GPS system enabled.");
    }

    // Function to enable gas detection
    public void enableGasDetection() {
        this.gasDetectionEnabled = true;
        System.out.println("Harmful gas detection enabled.");
    }

    // Function to enable lane assist
    public void enableLaneAssist() {
        this.laneAssistEnabled = true;
        System.out.println("Lane assist enabled.");
    }

    // Function to enable speed control
    public void enableSpeedControl() {
        this.speedControlEnabled = true;
        System.out.println("Speed control enabled.");
    }

    // Function to simulate data being sent to a mobile phone
    public void sendDataToMobile(String data) {
        System.out.println("Sending data to mobile: " + data);
    }

    // Function to check for obstacles and objects
    public void checkForObstacles() {
        if (this.obstacleDetectionEnabled) {
            Random rand = new Random();
            boolean obstacleDetected = rand.nextBoolean();
            if (obstacleDetected) {
                System.out.println("Obstacle detected! Taking evasive action.");
                takeEvasiveAction();
            } else {
                System.out.println("No obstacles detected.");
            }
        } else {
            System.out.println("Obstacle detection is disabled.");
        }
    }

    // Function to simulate evasive action
    private void takeEvasiveAction() {
        System.out.println("Evasive action initiated. Changing lanes and reducing speed.");
        if (this.laneAssistEnabled) {
            System.out.println("Lane assist activated: Safely changing lanes.");
        } else {
            System.out.println("Manual lane change required.");
        }
        if (this.speedControlEnabled) {
            System.out.println("Speed control activated: Reducing speed to safe levels.");
        } else {
            System.out.println("Driver attention required: Reduce speed manually.");
        }
    }

    // Function to simulate GPS navigation
    public void navigateToDestination(String destination) {
        if (this.gpsEnabled) {
            System.out.println("Navigating to " + destination + " using GPS.");
            simulateNavigation();
        } else {
            System.out.println("GPS is disabled.");
        }
    }

    // Function to simulate the navigation process
    private void simulateNavigation() {
        String[] navigationSteps = { "Starting route", "Turn left at the next junction", "Go straight for 5 miles",
                "Arriving at destination" };
        for (String step : navigationSteps) {
            System.out.println(step);
            try {
                TimeUnit.SECONDS.sleep(2); // Simulate time delay in navigation
            } catch (InterruptedException e) {
                System.out.println("Navigation interrupted.");
            }
        }
        System.out.println("Navigation completed.");
    }

    // Function to check for harmful gases
    public void checkForHarmfulGases() {
        if (this.gasDetectionEnabled) {
            Random rand = new Random();
            boolean gasDetected = rand.nextBoolean();
            if (gasDetected) {
                System.out.println("Harmful gas detected! Taking safety measures.");
                takeSafetyMeasures();
            } else {
                System.out.println("No harmful gases detected.");
            }
        } else {
            System.out.println("Gas detection is disabled.");
        }
    }

    // Function to simulate taking safety measures
    private void takeSafetyMeasures() {
        System.out.println("Activating ventilation system.");
        System.out.println("Warning driver and passengers.");
        try {
            TimeUnit.SECONDS.sleep(2); // Simulate time delay in safety measures
        } catch (InterruptedException e) {
            System.out.println("Safety measures interrupted.");
        }
        System.out.println("Safety measures completed.");
    }

    // Function to simulate the vehicle's autopilot behavior
    public void autopilotBehavior() {
        if (this.autopilotEnabled) {
            System.out.println("Autopilot mode active. Monitoring road conditions and traffic.");
            for (int i = 0; i < 3; i++) {
                checkForObstacles();
                checkForHarmfulGases();
                try {
                    TimeUnit.SECONDS.sleep(3); // Simulate autopilot actions over time
                } catch (InterruptedException e) {
                    System.out.println("Autopilot interrupted.");
                }
            }
            System.out.println("Autopilot mode completed.");
        } else {
            System.out.println("Autopilot is disabled.");
        }
    }

    // Main function to demonstrate the SmartVehicle functionality
    public static void main(String[] args) {
        SmartVehicle vehicle = new SmartVehicle();
        // Enable vehicle features
        vehicle.enableAutopilot();
        vehicle.enableObstacleDetection();
        vehicle.enableGPS();
        vehicle.enableGasDetection();
        vehicle.enableLaneAssist();
        vehicle.enableSpeedControl();

        // Simulate vehicle operations
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Vehicle Operation Cycle " + (i + 1) + " ---");
            vehicle.checkForObstacles();
            vehicle.checkForHarmfulGases();
            vehicle.navigateToDestination("City Center");
            vehicle.autopilotBehavior();

            // Simulate sending data to mobile
            vehicle.sendDataToMobile("Cycle " + (i + 1) + ": Vehicle status: OK, No issues detected.");
        }

        // Additional operations
        System.out.println("All vehicle operations completed successfully.");
    }
}