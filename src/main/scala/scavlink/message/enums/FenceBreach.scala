// Code generated by sbt-mavgen. Manual edits will be overwritten
package scavlink.message.enums

object FenceBreach extends Enumeration {
  /**
   * No last fence breach
   */
  val NONE = Value(0)
  /**
   * Breached minimum altitude
   */
  val MINALT = Value(1)
  /**
   * Breached maximum altitude
   */
  val MAXALT = Value(2)
  /**
   * Breached fence boundary
   */
  val BOUNDARY = Value(3)
}
