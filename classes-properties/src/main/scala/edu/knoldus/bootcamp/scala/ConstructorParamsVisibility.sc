// var fields
class PersonVar(var name: String)
val pVar = new PersonVar("Alvin Alexander")
// getter
pVar.name
//setter
pVar.name = "Fred Flinstone"

// val fields
class PersonVal(val name: String)
val pVal = new PersonVal("Alvin Alexander")
// getter
pVal.name
//setter
//pVal.name = "Fred Flinstone" //re-assignment to val error

// Fields without val or var
class Person(name: String)
val p = new Person("Alvin Alexander")
// getter
//p.name  //value name is not accessible
//setter
//p.name = "Fred Flinstone"  //value name is not accessible

// Adding private to val or var
class PersonPrivateVar(private var name: String) { def getName {println(name)} }
val personPrivateVar = new PersonPrivateVar("Alvin Alexander")
//personPrivateVar.name  //value name is not accessible since it is private
personPrivateVar.getName

// Case Class
case class PersonCaseClass(name: String)
val personCaseClass = PersonCaseClass("Dale Cooper")
personCaseClass.name