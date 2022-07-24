package rsk

fun main (args:Array<String>)
{
    val x=A()
        x.myAge()

}
open class A{


var age:Int?=null
fun myAge()
{
    this.age=10
    println("Age=${this.age}")

}}
open class B: A() {

}
class c:B()
{

}

