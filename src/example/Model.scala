package example

class Model extends AnyRef with Observable {
  var prop:String = _
  var prop2:String = _
  var prop3:String = _
}

trait ModelTrait {
  var traitProp:String = _
}

class SubModel extends Model with ModelTrait {
  var subProp:String = _
}

object Main {
  def main(argv:Array[String]) = {
    Console println "starting.."

    val m = new Model()
    m.prop = "whee"

    val s = new SubModel()
    s.prop = "superclass prop"
    s.subProp = "subclass prop"
    s.traitProp = "trait props too"
  }
}

object Observation {
  def changed(obj:Object, prop:String, newVal:Object) = 
    Console println "change observed> " + obj + "=>> " + prop + ":" + newVal
}

trait Observable {}

