/*fun  rsk.rsk.main ()
{
  rsk.rsk.display()
}
fun rsk.rsk.display()
{
    println("Hello world!")
}*/
@file:JvmName("DisplayFunctions")
package rsk
fun log (message: String,loglevel:Int=1){
    println(message+loglevel)

}
@JvmOverloads
fun main(args:Array<String>){
    log("Hello World!",2)
}


