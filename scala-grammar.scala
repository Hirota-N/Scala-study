  def printIsBaby(age: Int, isSchoolStarted: Boolean): Unit = {
    if (1 <= age && age <= 6 && !isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }