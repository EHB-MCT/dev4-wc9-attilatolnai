fun main(args: Array<String>) {
    val reader = FileReader();
    //println(reader.getPuzzle1())
    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
    //oneA()
    oneB()
}

//fun oneA() {
//    val getFile = FileReader();
//    val numbers = getFile.getPuzzle1()
//
//    for (number in numbers){
//        println(number)
//    }
//
//    var previousNumber = numbers[0]
//    var increased = 0;
//    numbers.forEach {
//        if (it > previousNumber){
//            increased++
//        }
//        previousNumber = it;
//    }
//    println(increased)
//}

fun oneB() {
    val getFile = FileReader();
    val numbers = getFile.getPuzzle1()

    for (number in numbers){
        println(number)
    }

    var counter = 0;
    numbers.forEachIndexed{ index, i ->
        if (index < numbers.size -3){
            var sumA = numbers[index] + numbers[index + 1] + numbers[index + 2]
            var sumB = numbers[index + 1] + numbers[index + 2] + numbers[index + 3]
            if (sumB > sumA){
                counter++
            }
        }
    }
    var prevInput = numbers[0]
    var increased = 0;
    numbers.forEach{
        if (it > prevInput){
            increased++
        }
        prevInput = it;
    }
    println(counter)
}



