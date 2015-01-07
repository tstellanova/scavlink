// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.message.enums

object MavFrame extends Enumeration {
  /**
   * Global coordinate frame, WGS84 coordinate system. First value / x: latitude, second value / y: longitude, third value / z: positive altitude over mean sea level (MSL)
   */
  val GLOBAL = Value(0)
  /**
   * Local coordinate frame, Z-up (x: north, y: east, z: down).
   */
  val LOCAL_NED = Value(1)
  /**
   * NOT a coordinate frame, indicates a mission command.
   */
  val MISSION = Value(2)
  /**
   * Global coordinate frame, WGS84 coordinate system, relative altitude over ground with respect to the home position. First value / x: latitude, second value / y: longitude, third value / z: positive altitude with 0 being at the altitude of the home location.
   */
  val GLOBAL_RELATIVE_ALT = Value(3)
  /**
   * Local coordinate frame, Z-down (x: east, y: north, z: up)
   */
  val LOCAL_ENU = Value(4)
  /**
   * Global coordinate frame, WGS84 coordinate system. First value / x: latitude in degrees*1.0e-7, second value / y: longitude in degrees*1.0e-7, third value / z: positive altitude over mean sea level (MSL)
   */
  val GLOBAL_INT = Value(5)
  /**
   * Global coordinate frame, WGS84 coordinate system, relative altitude over ground with respect to the home position. First value / x: latitude in degrees*10e-7, second value / y: longitude in degrees*10e-7, third value / z: positive altitude with 0 being at the altitude of the home location.
   */
  val GLOBAL_RELATIVE_ALT_INT = Value(6)
  /**
   * Offset to the current local frame. Anything expressed in this frame should be added to the current local frame position.
   */
  val LOCAL_OFFSET_NED = Value(7)
  /**
   * Setpoint in body NED frame. This makes sense if all position control is externalized - e.g. useful to command 2 m/s^2 acceleration to the right.
   */
  val BODY_NED = Value(8)
  /**
   * Offset in body NED frame. This makes sense if adding setpoints to the current flight path, to avoid an obstacle - e.g. useful to command 2 m/s^2 acceleration to the east.
   */
  val BODY_OFFSET_NED = Value(9)
  /**
   * Global coordinate frame with above terrain level altitude. WGS84 coordinate system, relative altitude over terrain with respect to the waypoint coordinate. First value / x: latitude in degrees, second value / y: longitude in degrees, third value / z: positive altitude in meters with 0 being at ground level in terrain model.
   */
  val GLOBAL_TERRAIN_ALT = Value(10)
  /**
   * Global coordinate frame with above terrain level altitude. WGS84 coordinate system, relative altitude over terrain with respect to the waypoint coordinate. First value / x: latitude in degrees*10e-7, second value / y: longitude in degrees*10e-7, third value / z: positive altitude in meters with 0 being at ground level in terrain model.
   */
  val GLOBAL_TERRAIN_ALT_INT = Value(11)
}