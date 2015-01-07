// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.connection.marshal

import scavlink.message.{Message, Bundle}
import scavlink.message.slugs._
import scavlink.message.enums._
import akka.util.{ByteIterator, ByteStringBuilder}

object SlugsMarshaller extends BundleMarshaller {
  val bundle = Bundle.slugs

  def magic = Map(170 -> 75, 172 -> 168, 173 -> 2, 176 -> 228, 177 -> 167, 179 -> 132, 180 -> 146, 181 -> 104, 184 -> 45, 185 -> 113, 186 -> 101, 188 -> 5, 189 -> 246, 191 -> 17, 192 -> 187, 193 -> 160, 194 -> 51, 195 -> 59, 196 -> 129, 197 -> 39)

  def _marshal(message: Message)(implicit builder: ByteStringBuilder) = message match {
    case CpuLoad(a,b,c) => _uint16_t(c); _uint8_t(a); _uint8_t(b)
    case SensorBias(a,b,c,d,e,f) => _float(a); _float(b); _float(c); _float(d); _float(e); _float(f)
    case Diagnostic(a,b,c,d,e,f) => _float(a); _float(b); _float(c); _int16_t(d); _int16_t(e); _int16_t(f)
    case SlugsNavigation(a,b,c,d,e,f,g,h,i,j) => _float(a); _float(b); _float(c); _float(d); _float(e); _float(f); _float(g); _uint16_t(j); _uint8_t(h); _uint8_t(i)
    case DataLog(a,b,c,d,e,f) => _float(a); _float(b); _float(c); _float(d); _float(e); _float(f)
    case GpsDateTime(a,b,c,d,e,f,g,h,i,j,k,l) => _uint8_t(a); _uint8_t(b); _uint8_t(c); _uint8_t(d); _uint8_t(e); _uint8_t(f); _uint8_t(g); _uint8_t(h); _uint8_t(i); _uint8_t(j); _uint8_t(k); _uint8_t(l)
    case MidLvlCmds(a,b,c,d) => _float(b); _float(c); _float(d); _uint8_t(a)
    case CtrlSrfcPt(a,b) => _uint16_t(b); _uint8_t(a)
    case SlugsCameraOrder(a,b,c,d,e) => _uint8_t(a); _int8_t(b); _int8_t(c); _int8_t(d); _int8_t(e)
    case ControlSurface(a,b,c,d) => _float(c); _float(d); _uint8_t(a); _uint8_t(b)
    case SlugsMobileLocation(a,b,c) => _float(b); _float(c); _uint8_t(a)
    case SlugsConfigurationCamera(a,b,c) => _uint8_t(a); _uint8_t(b); _uint8_t(c)
    case IsrLocation(a,b,c,d,e,f,g) => _float(b); _float(c); _float(d); _uint8_t(a); _uint8_t(e); _uint8_t(f); _uint8_t(g)
    case VoltSensor(a,b,c) => _uint16_t(b); _uint16_t(c); _uint8_t(a)
    case PtzStatus(a,b,c) => _int16_t(b); _int16_t(c); _uint8_t(a)
    case UavStatus(a,b,c,d,e,f) => _float(b); _float(c); _float(d); _float(e); _float(f); _uint8_t(a)
    case StatusGps(a,b,c,d,e,f,g) => _float(e); _uint16_t(a); _uint8_t(b); _uint8_t(c); _uint8_t(d); _int8_t(f); _uint8_t(g)
    case NovatelDiag(a,b,c,d,e,f,g) => _uint32_t(b); _float(f); _uint16_t(g); _uint8_t(a); _uint8_t(c); _uint8_t(d); _uint8_t(e)
    case SensorDiag(a,b,c,d) => _float(a); _float(b); _int16_t(c); _int8_t(d)
    case Boot(a) => _uint32_t(a)
  }

  def _unmarshal(msgId: Int)(implicit iter: ByteIterator) = msgId match {
    case 170 => CpuLoad(batVolt=uint16_t, sensLoad=uint8_t, ctrlLoad=uint8_t)
    case 172 => SensorBias(axBias=float, ayBias=float, azBias=float, gxBias=float, gyBias=float, gzBias=float)
    case 173 => Diagnostic(diagFl1=float, diagFl2=float, diagFl3=float, diagSh1=int16_t, diagSh2=int16_t, diagSh3=int16_t)
    case 176 => SlugsNavigation(uM=float, phiC=float, thetaC=float, psiDotC=float, ayBody=float, totalDist=float, dist2Go=float, hC=uint16_t, fromWP=uint8_t, toWP=uint8_t)
    case 177 => DataLog(fl1=float, fl2=float, fl3=float, fl4=float, fl5=float, fl6=float)
    case 179 => GpsDateTime(year=uint8_t, month=uint8_t, day=uint8_t, hour=uint8_t, min=uint8_t, sec=uint8_t, clockStat=uint8_t, visSat=uint8_t, useSat=uint8_t, gppgl=uint8_t, sigUsedMask=uint8_t, percentUsed=uint8_t)
    case 180 => MidLvlCmds(hCommand=float, uCommand=float, rCommand=float, targetSystem=uint8_t)
    case 181 => CtrlSrfcPt(bitfieldPt=uint16_t, targetSystem=uint8_t)
    case 184 => SlugsCameraOrder(targetSystem=uint8_t, pan=int8_t, tilt=int8_t, zoom=int8_t, moveHome=int8_t)
    case 185 => ControlSurface(mControl=float, bControl=float, targetSystem=uint8_t, idSurface=uint8_t)
    case 186 => SlugsMobileLocation(latitude=float, longitude=float, targetSystem=uint8_t)
    case 188 => SlugsConfigurationCamera(targetSystem=uint8_t, idOrder=uint8_t, order=uint8_t)
    case 189 => IsrLocation(latitude=float, longitude=float, height=float, targetSystem=uint8_t, option1=uint8_t, option2=uint8_t, option3=uint8_t)
    case 191 => VoltSensor(voltage=uint16_t, reading2=uint16_t, r2Type=uint8_t)
    case 192 => PtzStatus(pan=int16_t, tilt=int16_t, zoom=uint8_t)
    case 193 => UavStatus(latitude=float, longitude=float, altitude=float, speed=float, course=float, targetSystem=uint8_t)
    case 194 => StatusGps(magVar=float, csFails=uint16_t, gpsQuality=uint8_t, msgsType=uint8_t, posStatus=uint8_t, magDir=int8_t, modeInd=uint8_t)
    case 195 => NovatelDiag(receiverStatus=uint32_t, posSolAge=float, csFails=uint16_t, timeStatus=uint8_t, solStatus=uint8_t, posType=uint8_t, velType=uint8_t)
    case 196 => SensorDiag(float1=float, float2=float, int1=int16_t, char1=int8_t)
    case 197 => Boot(version=uint32_t)
  }
}
