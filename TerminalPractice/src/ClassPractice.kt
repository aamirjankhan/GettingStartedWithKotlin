fun main(args: Array<String>)
{
    println("Hello World!!!")
    //data types in kotlin
    //data types in kotlin are as follows
    //Int
    //Boolean
    //String
    //Float
    //Double
    //Long
    //Short
    //Character
    val numFloat : Float
    numFloat = 23.33f
    val numInt : Int
    numInt = 234
    val numDouble : Double
    numDouble = 23.55556666
    val name : String
    name = "Aamir Jan Khan"
    val grade : Char
    grade = 'A'
    val correct : Boolean
    correct = true
    val incorrect : Boolean
    incorrect = false
    println("integer value is $numInt\ndouble value is $numDouble\n/" +
            "float value is $numFloat\nmy name is $name\nmy grade is $grade/" +
            "\ninformation is $correct\ninformation is not $incorrect")
    val num1 = 12
    val num2 = 15
    val max = if(num1 > num2){
        println("num1 is greater")
        num1
    }else{
        println("num2 is greater")
        num2
    }
    println("max value is $max")
    val present = if("jan" in name){
        println("jan is present")
        correct
    }else{
        println("jan is not present")
        incorrect
    }
    println(present)
    //kotlin is case sensitive too
    //array integer
    val arrint = intArrayOf(1,2,3,4,5,6,7,6,5,4,3,2,1,10)
    println(arrint[5])
    for(j in arrint){
        print(j)
    }
    println()
    //array float
    val arrfloat  = floatArrayOf(1.1f,2.2f,3.3f,4.4f)
    println(arrfloat[1])
    for(i in arrfloat){
        print(i)
    }
    println()
    //array character
    val arrcharacter = charArrayOf('a','b','c','d','A','B','C','D')
    println(arrcharacter)






}