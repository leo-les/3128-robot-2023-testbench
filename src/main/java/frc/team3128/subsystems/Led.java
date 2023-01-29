package frc.team3128.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Led extends SubsystemBase{
    private static Led instance;
    private AddressableLED m_led;
    private AddressableLEDBuffer m_ledBuffer;

    public Led(){
        InitLeds();
    }
    public static synchronized Led getInstance() {
        if (instance == null) {
            instance = new Led();
        }
        return instance;
    }
    
    public void InitLeds() {
        m_led = new AddressableLED(9);

        m_ledBuffer = new AddressableLEDBuffer(60);
        m_led.setLength(m_ledBuffer.getLength());

        m_led.setData(m_ledBuffer);
        m_led.start();
    }

    public void setYellow() {
        for (var i = 0; i < m_ledBuffer.getLength(); i++) {
            // Sets the specified LED to the RGB values for red
            m_ledBuffer.setRGB(i, 255, 255, 0);
         }
         
         m_led.setData(m_ledBuffer);
    }
    
    public void setColor(int r, int g, int b) {
        for (var i = 0; i < m_ledBuffer.getLength(); i++) {
            // Sets the specified LED to the RGB values for red
            m_ledBuffer.setRGB(i, r, g, b);
         }
         
         m_led.setData(m_ledBuffer);
    }


    
}
