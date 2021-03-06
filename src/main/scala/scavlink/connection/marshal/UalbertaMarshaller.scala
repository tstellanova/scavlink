// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.connection.marshal

import scavlink.message.{Message, Bundle}
import scavlink.message.ualberta._
import scavlink.message.enums._
import akka.util.{ByteIterator, ByteStringBuilder}

object UalbertaMarshaller extends BundleMarshaller {
  val bundle = Bundle.ualberta

  def magic = Map(220 -> 34, 221 -> 71, 222 -> 15)

  def _marshal(message: Message)(implicit builder: ByteStringBuilder) = message match {
    case NavFilterBias(a,b,c,d,e,f,g) => _uint64_t(a); _float(b); _float(c); _float(d); _float(e); _float(f); _float(g)
    case RadioCalibration(a,b,c,d,e,f) => _uint16_t_3(a); _uint16_t_3(b); _uint16_t_3(c); _uint16_t_2(d); _uint16_t_(5)(e); _uint16_t_(5)(f)
    case UalbertaSysStatus(a,b,c) => _uint8_t(a); _uint8_t(b); _uint8_t(c)
  }

  def _unmarshal(msgId: Int)(implicit iter: ByteIterator) = msgId match {
    case 220 => NavFilterBias(usec=uint64_t, accel0=float, accel1=float, accel2=float, gyro0=float, gyro1=float, gyro2=float)
    case 221 => RadioCalibration(aileron=uint16_t_3, elevator=uint16_t_3, rudder=uint16_t_3, gyro=uint16_t_2, pitch=uint16_t_(5), throttle=uint16_t_(5))
    case 222 => UalbertaSysStatus(mode=uint8_t, navMode=uint8_t, pilot=uint8_t)
  }
}
