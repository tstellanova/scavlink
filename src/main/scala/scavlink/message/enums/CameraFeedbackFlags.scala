// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.message.enums

object CameraFeedbackFlags extends Enumeration {
  val _UNKNOWN = Value(0)
  /**
   * Shooting video, not stills
   */
  val VIDEO = Value(1)
  /**
   * Unable to achieve requested exposure (e.g. shutter speed too low)
   */
  val BADEXPOSURE = Value(2)
  /**
   * Closed loop feedback from camera, we know for sure it has successfully taken a picture
   */
  val LOSEDLOOP = Value(3)
  /**
   * Open loop camera, an image trigger has been requested but we can't know for sure it has successfully taken a picture
   */
  val OPENLOOP = Value(4)
}