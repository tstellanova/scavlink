package scavlink.test

import akka.actor.{Actor, ActorLogging}
import scavlink.connection.{VehicleDown, VehicleUp}
import scavlink.link.SentPacket
import scavlink.link.telemetry.DefaultTelemetryStreams
import scavlink.link.telemetry.TelemetryTellAPI._
import scavlink.message.Packet


class PacketPrinter extends Actor with ActorLogging {

  def receive = {
    case e@VehicleUp(vehicle) =>
      log.info(s"!!! $e")
      vehicle.link.events.subscribeToAll(self)
      vehicle.setTelemetryStreams(DefaultTelemetryStreams.all)

    case e@VehicleDown(vehicle) =>
      log.info(s"!!! $e")
      vehicle.link.events.unsubscribe(self)

    case p: Packet => log.debug(s"<-- $p")

    case SentPacket(p) => log.debug(s"  --> $p")

    case e => log.debug(s"*** $e")
  }
}
