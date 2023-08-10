import java.lang.Exception

fun main(){
    try {
        division(20,0)
    }catch(e:Exception){
     e.printStackTrace()
    }
    println("Executed successfully")
}
fun division(num1:Int,num2:Int)
{
 println(num1/num2)
}