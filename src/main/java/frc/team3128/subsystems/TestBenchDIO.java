package frc.team3128.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;

public class TestBenchDIO {
    private static TestBenchDIO instance;
    private DigitalInput m_sensor;

    public TestBenchDIO() {
        m_sensor = new DigitalInput(0);
    }

    public static synchronized TestBenchDIO getInstance() {
        if (instance == null) {
            instance = new TestBenchDIO();
        }
        return instance;
    }

    public boolean sense() {
        return m_sensor.get();
    }
}
