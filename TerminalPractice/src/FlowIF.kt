fun main(args : Array<String>)
{


    while(true)
    {
        println("please enter your choice\nadd\nminus\nmultiply\ndivide\n")
        var choice : String = readLine()!!
        println("please enter two numbers: ")
        Calculator(readLine()!!.toInt(), readLine()!!.toInt(),choice)
        println("enter x to exit: ")
        if(readLine()!! == "x"){
            break
        }

    }

    for(i in 1..5)
    {
        println("Please enter your name, course, cgpa, age and timing")
        StudentData(readLine()!!, readLine()!!, readLine()!!.toFloat(), readLine()!!.toInt(), readLine()!! )
    }



}
fun StudentData(name : String = "", course : String = "", cgpa : Float = 0.0f, age : Int = 0, timing : String ="" )
{
    println("name: $name\n" +
            "course: $course\n" +
            "cgpa: $cgpa\n" +
            "age: $age\n" +
            "timing: $timing")


}
fun Calculator(num1 : Int, num2 : Int, choice : String)
{
    var a : Int = num1
    var b : Int = num2
    when(choice)
    {
        "add" -> println(a + b)
        "minus" ->  if(a > b){
            println(a - b)
        }else{
            println(b - a)
        }
        "multiply" -> println(a * b)
        "divide" -> if(a > b && b != 0){
            println(a / b)
        }else if(b > a && a != 0){
            println(b / a)
        }else{
            println("can not divide by zero")
        }

    }
}