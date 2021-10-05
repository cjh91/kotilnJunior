fun main() {
  vars()
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



