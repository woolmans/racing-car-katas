package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

public class AlarmTest {

  @Test
  public void testAlarmOn() {
    SensorImpl mockSensor = mock(SensorImpl.class);
    when(mockSensor.popNextPressurePsiValue()).thenReturn(16.0);

    Alarm alarm = new Alarm();
    alarm.sensor = mockSensor;
    alarm.check();

    assertTrue(alarm.isAlarmOn());
  }

  @Test
  public void testAlarmOff() {
    SensorImpl mockSensor = mock(SensorImpl.class);
    when(mockSensor.popNextPressurePsiValue()).thenReturn(18.0);

    Alarm alarm = new Alarm();
    alarm.sensor = mockSensor;
    alarm.check();

    assertFalse(alarm.isAlarmOn());
  }
}

// @Test
// public void foo() {
//     Alarm alarm = new Alarm();
//     assertFalse(alarm.isAlarmOn());
// }
