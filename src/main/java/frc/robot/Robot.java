package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

// Robot Class
public class Robot extends TimedRobot {

  // Variables
  private final WPI_TalonFX motor1 = new WPI_TalonFX(22);
  private final XboxController controller = new XboxController(0);

  // Teleop periodic
  @Override
  public void teleopPeriodic() {
    motor1.set(controller.getAButton() ? 0.5 : 0.0);
  }



}
