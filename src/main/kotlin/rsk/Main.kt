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
@JvmOverloads
//named parameters
fun main(args:Array<String>){
    log( message = "Hello World!")
    log( loglevel = 2,message = "Hello World!")
}
//named parameters
fun log (message: String,loglevel:Int=1){

    println(message+loglevel)
}


