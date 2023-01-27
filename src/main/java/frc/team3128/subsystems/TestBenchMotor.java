package frc.team3128.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team3128.common.NAR_EMotor;
import frc.team3128.common.hardware.motorcontroller.NAR_CANSparkMax;
import frc.team3128.common.hardware.motorcontroller.NAR_TalonFX;

public class TestBenchMotor extends SubsystemBase {
    private NAR_TalonFX motor = new NAR_TalonFX(9);
    // private NAR_CANSparkMax spark = new NAR_CANSparkMax(19, MotorType.kBrushless);

    public TestBenchMotor() {}

    // public void run() {
    //     motor.set(0.1);
        
    // }

    // public void stop() {
    //     motor.set(0);
        
    // }

    public void run2() {
        motor.set(0.2);
    }

    public void runReverse() {
        motor.set(-0.2);
    }

    public void stop2() {
        motor.set(0);
    }
    
    public double logRPM() {
        return motor.getSelectedSensorVelocity() * 60 * 60 / 42 / 60 / 42 * 16;
    }

}
