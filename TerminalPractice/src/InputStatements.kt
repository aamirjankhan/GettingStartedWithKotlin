import java.util.Scanner
fun main(args : Array<String>)
{
    //various input styles
    println("please enter your name: ")
    var name : String
    name = readLine()!!
    println("your name is : "+name)
    //using readline we can only take input in the form of string but we can typecast them...
    val reader = Scanner(System.`in`)
    //now reader object will be used to take input from the user...
    //reader object is an object of Scanner class
    println("please enter your age: ")
    var age : Int = reader.nextInt()
    println("your age is $age")
}