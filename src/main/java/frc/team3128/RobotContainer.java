package frc.team3128;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.team3128.common.hardware.input.NAR_Joystick;
import frc.team3128.common.utility.NAR_Shuffleboard;
import frc.team3128.subsystems.TestBenchPiston;
import frc.team3128.subsystems.TestBenchDIO;
import frc.team3128.subsystems.TestBenchMotor;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {

    private TestBenchMotor testBenchMotor;
    private TestBenchPiston testBenchPiston;
    private TestBenchDIO testBenchDIO;
    private NAR_Joystick m_leftStick;
    private NAR_Joystick m_rightStick;

    private CommandScheduler m_commandScheduler = CommandScheduler.getInstance();
    private Command auto;

    private boolean DEBUG = false;

    public RobotContainer() {

        m_leftStick = new NAR_Joystick(0);
        m_rightStick = new NAR_Joystick(1);
        testBenchMotor = TestBenchMotor.getInstance();
        testBenchPiston = TestBenchPiston.getInstance();
        testBenchDIO = TestBenchDIO.getInstance(); 

        configureButtonBindings();
        dashboardInit();
    }   

    private void configureButtonBindings() {

        // m_rightStick.getButton(1).onTrue(new RunCommand(testBenchMotor::runFalcon,testBenchMotor));
        // m_rightStick.getButton(1).onFalse(new RunCommand(testBenchMotor::stopFalcon,testBenchMotor));

        // m_rightStick.getButton(1).onTrue(new RunCommand(testBenchMotor::run775,testBenchMotor));
        // m_rightStick.getButton(1).onFalse(new RunCommand(testBenchMotor::stop775,testBenchMotor));

        // m_rightStick.getButton(1).onTrue(new RunCommand(testBenchMotor::runNeo,testBenchMotor));
        // m_rightStick.getButton(1).onFalse(new RunCommand(testBenchMotor::stopNeo,testBenchMotor));
    }

    private void dashboardInit() {
        // if (DEBUG) {
        //     SmartDashboard.putData("CommandScheduler", CommandScheduler.getInstance());
        //     SmartDashboard.putNumber("xxxxxxMotorRPMxxxxxxx", testBenchMotor.logRPM());
        // }
            
    }

    public void stopDrivetrain() {

    }

    public Command getAutonomousCommand() {
        return auto;
    }

    public void updateDashboard() {
        //NAR_Shuffleboard.addData("Sensor", "megSwitch", testBenchDIO.sense(), 0, 0);
        // SmartDashboard.putBoolean("-----MagSwitch-----", testBenchDIO.sense());
    }
}
