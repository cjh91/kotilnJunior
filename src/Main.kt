fun main() {
  arrays()
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

