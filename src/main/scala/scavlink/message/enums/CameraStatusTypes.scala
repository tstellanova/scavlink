// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.message.enums

object CameraStatusTypes extends Enumeration {
  /**
   * Camera heartbeat, announce camera component ID at 1hz
   */
  val HEARTBEAT = Value(0)
  /**
   * Camera image triggered
   */
  val TRIGGER = Value(1)
  /**
   * Camera connection lost
   */
  val DISCONNECT = Value(2)
  /**
   * Camera unknown error
   */
  val ERROR = Value(3)
  /**
   * Camera battery low. Parameter p1 shows reported voltage
   */
  val LOWBATT = Value(4)
  /**
   * Camera storage low. Parameter p1 shows reported shots remaining
   */
  val LOWSTORE = Value(5)
  /**
   * Camera storage low. Parameter p1 shows reported video minutes remaining
   */
  val LOWSTOREV = Value(6)
}