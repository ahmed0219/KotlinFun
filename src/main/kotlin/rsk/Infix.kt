package rsk
fun main(args:Array<String>)
{
val h1=Header("H1")
val h2=Header("H2")
   // val h3 = h1.plus(h2)
    val h3=h1 plus h2
    println(h3.Name)



    val h4=h1+h2
    println(h4.Name)
}
class Header(var Name:String ) {

}
/*fun Header.plus(other:Header):Header{
    return Header(this.Name+other.Name)
}*/
operator infix fun Header.plus(other:Header):Header
{
    return Header(this.Name + other.Name)
}
//Infix Functions can be member or extensions functions Have a single parameter and marked with infix keyword