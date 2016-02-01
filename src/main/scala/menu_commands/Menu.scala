package menu_commands

//******* MENU *******
object Menu {
  
  def showGameArea : String = {
    Board.show + "\n" +
    Scoreboard.show + "\n" +
    }
  
  def showPlayerOrder : String = {
    return PlayerOrder.show
  }
  
  def advancePlayerOrder : String = {
    PlayerOrder.advance
    return PlayerOrder.show
  }
}

//*********** BOARD ******************
object Board {
  
  val spot = Array[String](9) //fill each board spot type as wanted

  def show = {
    var result = "Board: \n" +
    result += "___________________________________________________________________________________________ \n"
    for(i <- spot){
      result += "|     " + spot(i) + "     | \n"
    }
    result += "___________________________________________________________________________________________ \n"
    result
  }
}

//******* SCOREBOARD *******
object Scoreboard {
  def show = {
    var result = "Scores:\n"
    for (p <- PlayerOrder.toArray) 
      result += p.name + " =  Job: " + p.job + ", Money: " + p.money + ", Roll: " + p.roll + ", Stocks: " + p.stocks + ", Insurance: " + p.insurance + ", Education: " + p.education + "\n"
    result.substring(0, result.length-2) + "\n"         
  }
    
}




//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {
  
  this += new Player("Car 1")
  this += new Player("Car 2")
  this += new Player("Car 3")
  this += new Player("Car 4")
  
  def advance {
    this += this.dequeue
  }
  
  def show : String = {
    var result = ""    
    for (p <- this.toArray) 
      result += p.name + ", "
    result.substring(0, result.length-2)
  }
  
}


//******* PLAYER *******
class Player (val name : String) {
  var job = "None"
  var money = "$10000"
  var roll = "None"
  var stocks = "No"
  var insurance = ArrayBuffer[String]("")
  var education = "None"
}
