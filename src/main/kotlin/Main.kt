fun main(args: Array<String>) {
    val reader = FileReader();

    //println(reader.getPuzzle1())
    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
    oneA()
}

fun oneA() {
    val getFile = FileReader();
    val numbers = getFile.getPuzzle1()

    for (number in numbers){
        println(number)
    }

    var previousNumber = numbers[0]
    var increased = 0;
    numbers.forEach {
        if (it > previousNumber){
            increased++
        }
        previousNumber = it;
    }
    println(increased)
}


