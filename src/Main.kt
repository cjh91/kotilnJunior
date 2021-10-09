fun main() {
  println(functionWithArgsAndReturn(1997, 2021))
}

/***
 * Defining and variables
 */
fun vars() {
  // Data types
  // 1. Integer -> Int -> Whole number -> 7
  // 2. Double -> Double - > Decimal number -> 3.14
  // 3. String -> String -> Text -> "Test"
  // 4. Boolean -> Boolean -> Logical -> "true || "false"

  // Declaring variables that can chane value, keyword - "var"
  var thisIsInt = 7
  var thisIsDouble = 3.14
  var thisIsString = "Test"
  var thisIsBoolean = true
  var myVar: Int

  println("Initial value of Int $thisIsInt")
  println("Initial value of Double $thisIsDouble")
  println("Initial value of Boolean $thisIsBoolean")

  // Declaring variables that can Not change value, keyword - "val"
  val  thisIsIntVal = 9

  // Declaring variables as constants, keyword - "const val"
//  const val MYCONST = "my Constant"

  // Changing values to var
  thisIsInt = 90
  thisIsDouble += 0.86
  thisIsBoolean = !thisIsBoolean

  println("value of Int $thisIsInt")
  println("value of Double $thisIsDouble")
  println("value of Boolean $thisIsBoolean")
}

/**
 * Defining editiong and using arrays
 */
fun arrays() {
  // Array declaration
  // Arrays have fixed allocated memory
  var arrayA = arrayOf(1,2,3,4,5,6,7,8,9)
  var arrayB: Array<String> = emptyArray()

  // Array list declaration
  // Array list have dynamic memory allocation
  val arrayListA = mutableListOf(1,3,4,5)
  val arrayListB: ArrayList<String> = arrayListOf()
  val arrayListC = listOf<Boolean>(true, false, true)

  // Editing Array values
  arrayA[0] = 99

  // Add values to array
  arrayA += 100
  arrayB += "First text"

  // Edit ArrayList values
  arrayListA[3] = 89

  // Add values to arrayList
  arrayListB.add("testing 2")

  // Editing immutable arrayList
//  arrayListC[0] = false

  // Actions with arrays and arrayLists

//  arrayA.forEach {
//    println("Iterrating trough value $it")
//  }

  arrayListC.forEachIndexed { index, value ->
    println("Currently we are at index $index and its values is $value")
  }
}

/**
 * If statements
 */
fun ifStatements() {
  val number = -2

  if (number % 2 == 0 && number > 0) {
    println("Number $number is even and positive")
  } else if (number % 2 != 0 && number > 0) {
    println("Number $number is odd and positive")
  } else {
    println("Number $number is negotive")
  }
}

/**
 * For Loops
 */
fun forLoops() {
  val startYear = 2005
  val endYear = 2010

  var longYearCounter = 0
  var shortYearCounter = 0

  for(i in startYear..endYear) {
    if (i % 4 == 0) {
      longYearCounter += 1
    } else {
      shortYearCounter += 1
    }
  }

  println("In given range there were $longYearCounter long years and $shortYearCounter short years")
}

/**
 * While Loops
 */
fun whileLoops() {
  var passRegMet = false

  while (!passRegMet) {
    print("Please enter password: ")
    var userInput = readLine()

    if (userInput!!.length < 8) {
      println("Password has to be at least 8 chars long")
    } else {
      println("Password valid")
      passRegMet = true
    }
  }


}

/**
 * When cases
 */
fun whenCases() {
  val answer = true
  when(answer) {
    true ->  println("Variable is true")
    false -> {
      println("Variable is false")
      println("Bye!")
    }
  }

}

/**
 * Defining simple function
 */
fun simpleFunction() {
  println("This is a simple function!")
}

/**
 * Defining function with arguments
 */
fun functionWithArgs(age: Int, name: String) {
  println("Your name is $name and your $age is years old")
}

/**
 * Function with return
 */
fun functionWithReturn (): String {
  return "Potato"
}

/**
 * Function with arguments and return
 */
fun functionWithArgsAndReturn(birthYear: Int, currentYear: Int = 2020): Int {
  return currentYear - birthYear
}
