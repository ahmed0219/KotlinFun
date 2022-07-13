
package rsk

fun main (args: Array< String>)
{
    val text= "With   multiple  \t  whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}
fun replaceMultipleWhiteSpace(value:String):String{
    var regex=Regex("\\s+") //find multiple white space
    return regex.replace(value," ")//replace the multiple white space with just one
}
fun String.replaceMultipleWhiteSpaceEx() :String
{
    var regex =Regex("\\s+")
    return regex.replace(this," ")
}