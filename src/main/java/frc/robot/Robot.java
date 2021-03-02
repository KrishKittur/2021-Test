package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

// Robot Class
public class Robot extends TimedRobot {

  // Variables
  private final XboxController controller = new XboxController(0);
  private final CANSparkMax motor1 = new CANSparkMax(22, MotorType.kBrushless);
  private final CANSparkMax motor2 = new CANSparkMax(23, MotorType.kBrushless);
  private final CANSparkMax motor3 = new CANSparkMax(25, MotorType.kBrushless);
  private final CANSparkMax motor4 = new CANSparkMax(26, MotorType.kBrushless);

  // Teleop Init
  @Override
  public void teleopInit() {

  }

  // Teleop Periodic
  @Override
  public void teleopPeriodic() {
    motor1.set(controller.getAButton() ? 0.5 : 0.0);
    motor2.set(controller.getBButton() ? 0.5 : 0.0);
  }


}
