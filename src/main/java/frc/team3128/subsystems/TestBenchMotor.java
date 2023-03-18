package frc.team3128.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team3128.common.hardware.motorcontroller.NAR_CANSparkMax;
import frc.team3128.common.hardware.motorcontroller.NAR_TalonFX;
import frc.team3128.common.hardware.motorcontroller.NAR_TalonSRX;

public class TestBenchMotor extends SubsystemBase {
    private static TestBenchMotor instance;
    private NAR_TalonFX m_falcon;
    private NAR_TalonSRX m_775;
    private NAR_CANSparkMax m_neo;
    
    public TestBenchMotor() {
        m_falcon = new NAR_TalonFX(0);
        m_775 = new NAR_TalonSRX(3);
        m_neo = new NAR_CANSparkMax(1, MotorType.kBrushless);
    }

    public static synchronized TestBenchMotor getInstance() {
        if (instance == null) {
            instance = new TestBenchMotor();
        }
        return instance;
    }

    // ---------- falcon methods ----------

    public void runFalcon() {
        m_falcon.set(0.2);
    }

    public void reverseRunFalcon() {
        m_falcon.set(-0.2);
    }

    public void stopFalcon() {
        m_falcon.set(0);
    }

    // ---------- 775 methods ----------

    public void run775() {
        m_775.set(0.3);
    }

    public void reverseRun775() {
        m_775.set(-0.3);
    }

    public void stop775() {
        m_775.set(0);
    }

    // ---------- neo methods ----------

    public void runNeo() {
        m_neo.set(0.3);
    }

    public void reverseRunNeo() {
        m_neo.set(-0.3);
    }

    public void stopNeo() {
        m_neo.set(0);
    }
    

}
