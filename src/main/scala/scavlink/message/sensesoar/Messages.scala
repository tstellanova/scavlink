// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.message.sensesoar

import scavlink.message._
import scavlink.message.enums._

/**
 * Position estimate of the observer in global frame
 * @param lon Longitude expressed in 1E7
 * @param lat Latitude expressed in 1E7
 * @param alt Altitude expressed in milimeters
 */
case class ObsPosition(lon: Int = 0, lat: Int = 0, alt: Int = 0)
extends Message {
  val _id = 170
  val _name = "OBS_POSITION"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_POSITION" + " lon=" + lon + " lat=" + lat + " alt=" + alt
}

/**
 * velocity estimate of the observer in NED inertial frame
 * @param vel Velocity
 */
case class ObsVelocity(vel: (Float,Float,Float) = (0,0,0))
extends Message {
  val _id = 172
  val _name = "OBS_VELOCITY"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_VELOCITY" + " vel=" + vel
}

/**
 * attitude estimate of the observe
 * @param quat Quaternion re;im
 */
case class ObsAttitude(quat: (Double,Double,Double,Double) = (0,0,0,0))
extends Message {
  val _id = 174
  val _name = "OBS_ATTITUDE"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_ATTITUDE" + " quat=" + quat
}

/**
 * Wind estimate in NED inertial frame
 * @param wind Wind
 */
case class ObsWind(wind: (Float,Float,Float) = (0,0,0))
extends Message {
  val _id = 176
  val _name = "OBS_WIND"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_WIND" + " wind=" + wind
}

/**
 * Estimate of the air velocity
 * @param magnitude Air speed
 * @param aoa angle of attack
 * @param slip slip angle
 */
case class ObsAirVelocity(magnitude: Float = 0, aoa: Float = 0, slip: Float = 0)
extends Message {
  val _id = 178
  val _name = "OBS_AIR_VELOCITY"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_AIR_VELOCITY" + " magnitude=" + magnitude + " aoa=" + aoa + " slip=" + slip
}

/**
 * IMU biases
 * @param accBias accelerometer bias
 * @param gyroBias gyroscope bias
 */
case class ObsBias(accBias: (Float,Float,Float) = (0,0,0), gyroBias: (Float,Float,Float) = (0,0,0))
extends Message {
  val _id = 180
  val _name = "OBS_BIAS"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_BIAS" + " accBias=" + accBias + " gyroBias=" + gyroBias
}

/**
 * estimate of the pressure at sea level
 * @param qff Wind
 */
case class ObsQff(qff: Float = 0)
extends Message {
  val _id = 182
  val _name = "OBS_QFF"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_QFF" + " qff=" + qff
}

/**
 * ambient air temperature
 * @param airT Air Temperatur
 */
case class ObsAirTemp(airT: Float = 0)
extends Message {
  val _id = 183
  val _name = "OBS_AIR_TEMP"
  val _bundle = Bundle.sensesoar
  override def toString = "OBS_AIR_TEMP" + " airT=" + airT
}

/**
 * filtered rotational velocity
 * @param rotVel rotational velocity
 */
case class FiltRotVel(rotVel: (Float,Float,Float) = (0,0,0))
extends Message {
  val _id = 184
  val _name = "FILT_ROT_VEL"
  val _bundle = Bundle.sensesoar
  override def toString = "FILT_ROT_VEL" + " rotVel=" + rotVel
}

/**
 * low level control output
 * @param servoOut Servo signal
 * @param motorout motor signal
 */
case class LlcOut(servoOut: (Short,Short,Short,Short) = (0,0,0,0), motorout: (Short,Short) = (0,0))
extends Message {
  val _id = 186
  val _name = "LLC_OUT"
  val _bundle = Bundle.sensesoar
  override def toString = "LLC_OUT" + " servoOut=" + servoOut + " motorout=" + motorout
}

/**
 * Power managment
 * @param pwcons current power consumption
 * @param batstat battery status
 * @param pwgen Power generation from each module
 */
case class PmElec(pwcons: Float = 0, batstat: Float = 0, pwgen: (Float,Float,Float) = (0,0,0))
extends Message {
  val _id = 188
  val _name = "PM_ELEC"
  val _bundle = Bundle.sensesoar
  override def toString = "PM_ELEC" + " pwcons=" + pwcons + " batstat=" + batstat + " pwgen=" + pwgen
}

/**
 * system status
 * @param gps gps status
 * @param act actuator status
 * @param mod module status
 * @param commRssi module status
 */
case class SysStat(gps: Byte = 0, act: Byte = 0, mod: Byte = 0, commRssi: Byte = 0)
extends Message {
  val _id = 190
  val _name = "SYS_Stat"
  val _bundle = Bundle.sensesoar
  override def toString = "SYS_Stat" + " gps=" + gps + " act=" + act + " mod=" + mod + " commRssi=" + commRssi
}

/**
 * change commanded air speed
 * @param targetSystem Target ID
 * @param spCmd commanded airspeed
 */
case class CmdAirspeedChng(targetSystem: SystemId = 0, spCmd: Float = 0)
extends Message with TargetSystem[CmdAirspeedChng] {
  val _id = 192
  val _name = "CMD_AIRSPEED_CHNG"
  val _bundle = Bundle.sensesoar
  def setTargetSystem(systemId: SystemId): CmdAirspeedChng = copy(targetSystem = systemId)
  override def toString = "CMD_AIRSPEED_CHNG" + " targetSystem=" + targetSystem + " spCmd=" + spCmd
}

/**
 * accept change of airspeed
 * @param spCmd commanded airspeed
 * @param ack 0:ack, 1:nack
 */
case class CmdAirspeedAck(spCmd: Float = 0, ack: Byte = 0)
extends Message {
  val _id = 194
  val _name = "CMD_AIRSPEED_ACK"
  val _bundle = Bundle.sensesoar
  override def toString = "CMD_AIRSPEED_ACK" + " spCmd=" + spCmd + " ack=" + ack
}
