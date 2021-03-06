// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.connection.marshal

import scavlink.message.{Message, Bundle}
import scavlink.message.sensesoar._
import scavlink.message.enums._
import akka.util.{ByteIterator, ByteStringBuilder}

object SensesoarMarshaller extends BundleMarshaller {
  val bundle = Bundle.sensesoar

  def magic = Map(170 -> 15, 172 -> 108, 174 -> 146, 176 -> 16, 178 -> 32, 180 -> 159, 182 -> 24, 183 -> 248, 184 -> 79, 186 -> 5, 188 -> 170, 190 -> 157, 192 -> 209, 194 -> 243)

  def _marshal(message: Message)(implicit builder: ByteStringBuilder) = message match {
    case ObsPosition(a,b,c) => _int32_t(a); _int32_t(b); _int32_t(c)
    case ObsVelocity(a) => _float_3(a)
    case ObsAttitude(a) => _double_4(a)
    case ObsWind(a) => _float_3(a)
    case ObsAirVelocity(a,b,c) => _float(a); _float(b); _float(c)
    case ObsBias(a,b) => _float_3(a); _float_3(b)
    case ObsQff(a) => _float(a)
    case ObsAirTemp(a) => _float(a)
    case FiltRotVel(a) => _float_3(a)
    case LlcOut(a,b) => _int16_t_4(a); _int16_t_2(b)
    case PmElec(a,b,c) => _float(a); _float(b); _float_3(c)
    case SysStat(a,b,c,d) => _uint8_t(a); _uint8_t(b); _uint8_t(c); _uint8_t(d)
    case CmdAirspeedChng(a,b) => _float(b); _uint8_t(a)
    case CmdAirspeedAck(a,b) => _float(a); _uint8_t(b)
  }

  def _unmarshal(msgId: Int)(implicit iter: ByteIterator) = msgId match {
    case 170 => ObsPosition(lon=int32_t, lat=int32_t, alt=int32_t)
    case 172 => ObsVelocity(vel=float_3)
    case 174 => ObsAttitude(quat=double_4)
    case 176 => ObsWind(wind=float_3)
    case 178 => ObsAirVelocity(magnitude=float, aoa=float, slip=float)
    case 180 => ObsBias(accBias=float_3, gyroBias=float_3)
    case 182 => ObsQff(qff=float)
    case 183 => ObsAirTemp(airT=float)
    case 184 => FiltRotVel(rotVel=float_3)
    case 186 => LlcOut(servoOut=int16_t_4, motorout=int16_t_2)
    case 188 => PmElec(pwcons=float, batstat=float, pwgen=float_3)
    case 190 => SysStat(gps=uint8_t, act=uint8_t, mod=uint8_t, commRssi=uint8_t)
    case 192 => CmdAirspeedChng(spCmd=float, targetSystem=uint8_t)
    case 194 => CmdAirspeedAck(spCmd=float, ack=uint8_t)
  }
}
