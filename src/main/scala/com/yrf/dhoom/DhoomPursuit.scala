// DhoomPursuit.scala - Ali helps Jai chase the gang
object DhoomPursuit {
  def main(args: Array[String]): Unit = {
    println("Dhoom Pursuit - Ali’s Plan for Jai")

    // Chase data (change kar, Jai bhai!)
    val target = "Kabir’s Gang"
    val clueStrength = 70      // Clue quality (0-100)
    val bikeFuel = 60          // Fuel percentage (0-100)
    val backupReady = true     // Police support

    // Decision logic with if-else and logical operators
    if (clueStrength >= 60 && bikeFuel >= 50 && backupReady) {
      println(s"Chase on, Jai! Full throttle after $target!")
      println(s"Clues: $clueStrength%, Fuel: $bikeFuel%, Backup: Haan!")
    } else if (clueStrength >= 60 && bikeFuel < 50) {
      println(s"Clues strong ($clueStrength%), but fuel’s low ($bikeFuel%). Refuel, then nab $target!")
    } else if (clueStrength < 60 && bikeFuel >= 50 && backupReady) {
      println(s"Fuel’s good ($bikeFuel%), backup’s here, but clues weak ($clueStrength%). Scout more, bhai!")
    } else if (clueStrength >= 60 && !backupReady) {
      println(s"Clues solid ($clueStrength%), but no backup. Solo chase $target—risky, Jai!")
    } else {
      println(s"Abort chase—Clues: $clueStrength%, Fuel: $bikeFuel%, Backup: Nahi. Regroup, bhai!")
    }

    // Ali ka bonus tip
    if (clueStrength > 80 || bikeFuel > 90) {
      println("Clues ya fuel zabardast? Speed maar, Kabir ko pakad lenge!")
    }
  }
}