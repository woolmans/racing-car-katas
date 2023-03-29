package tddmicroexercises.tirepressuremonitoringsystem;

public interface Sensor {
  double OFFSET = 16;

  double popNextPressurePsiValue();
}
