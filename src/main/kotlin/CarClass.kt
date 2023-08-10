fun main(){
//create objects
    val newcar:carclass=carclass()
    var newcar2:carclass=carclass()
    newcar.color="yellow"
    newcar2.brand="Swift"
    //newcar.model="2020"

  //  println(newcar.color)
    println(newcar2.brand)
    //println(newcar.model)
}
//declare class
class carclass(){
//declare attributes
 var brand:String?=null
    var color:String?=null
    var model:String?=null


    //intilaise

    fun getColor(){

        println("Car is $color")
   }
    fun getModel(){

        println("Car is $model")
    }
    fun getBrand(){

        println("Car is $brand")
    }
}


