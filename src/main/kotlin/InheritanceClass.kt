open class Animal(){
  var name:String?=null
  var gender:String?=null
  var color:String?=null
  var age:Int?=null
}
class Dog(): Animal() {
   var dogId:String?=null
}
class Lion():Animal(){
    var lionId: String? =null
}
fun main(){
val animalData:Dog=Dog()
    animalData.dogId="123"

    animalData.gender="male"
    animalData.name="Line"
    animalData.age=30
    println(animalData.dogId+"\n"+animalData.name+"\n"+animalData.gender+"\n"+animalData.age)
}