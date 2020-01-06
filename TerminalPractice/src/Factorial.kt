fun Factorial(number : Int) : Long
{
    if(number == 1){
        return number.toLong()
    }else{
        return number * Factorial(number -1).toLong()
    }
}

fun main(args : Array<String>)
{
    println("please enter any number to get factorial: ")
    println(Factorial(readLine()!!.toInt()))
}