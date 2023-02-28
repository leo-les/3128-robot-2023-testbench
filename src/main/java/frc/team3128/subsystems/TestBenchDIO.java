package frc.team3128.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;

public class TestBenchDIO {
    private DigitalInput m_sensor;

    public TestBenchDIO() {
        m_sensor = new DigitalInput(0);
    }

    public boolean sense() {
        return m_sensor.get();
    }
}
