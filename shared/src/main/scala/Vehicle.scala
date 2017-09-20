
sealed trait Vehicle

final case class Truck(name: String) extends Vehicle
final case class MotorCycle(name: String) extends Vehicle

object Serialization {
  import play.api.libs.json._

  implicit val truckFormat = Json.format[Truck]
  implicit val motorCycleFormat = Json.format[MotorCycle]
  implicit val vehicleFormat = Json.format[Vehicle]
}
