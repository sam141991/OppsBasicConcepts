fun main(){
    var mobilemobile:Mobile=Mobile("Nokia","Zx2020","Blue")
    var mobilemobile2:Mobile=Mobile("Samsung","Xyz2023","Red")
    var mobilemobile3:Mobile=Mobile("Realme","POP234","White")

    println(mobilemobile.brand)
    println(mobilemobile2.model)
    println(mobilemobile3.colors)

}
class Mobile (brnd:String,modls:String,newcolors:String){
    var brand:String?=null
    var model:String?=null
    var colors:String?=null

    //why declare
   // passing variables  assign with  Mobile class variables
  init{
      brand=brnd
      model=modls
      colors=newcolors

      println(brnd+" "+modls+" "+colors)
  }

}
fun getBrand(){

}
fun getModel(){

}
fun getColors(){

}