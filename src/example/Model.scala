package example

class Model extends AnyRef with Observable {
  var bar:String = _
  var prop:String = _
  var prop2:String = _
  var prop4:String = _
}

class SubModel extends Model {
  var sub:String = _
}

object Main {
  def main(argv:Array[String]) = {
    val m = new Model()
    m.prop = "whee"

    val s = new SubModel()
    s.bar = "fip"
    s.prop4 = "prop4"
  }
}

object Observation {
  def changed(obj:Object, prop:String, newVal:Object) = 
    Console println "change observed> " + obj + "=>> " + prop + ":" + newVal
}

trait Observable {}

