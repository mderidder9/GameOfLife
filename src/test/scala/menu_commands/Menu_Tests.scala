package menu_commands
  
import org.scalatest.FunSpec
import org.scalatest.Matchers

class Menu_tests extends FunSpec with Matchers {
  
  describe("Game of Life --"){
    describe("it has the following objects"){
  
  //First commands
  //•SHOW GAME AREA - displays everything necessary to observe the progress of the game (e.g., a text-based representation of the game board, player hands, the score board, etc)
  it("Shows the game area mockup with the spaces denoted and the location of players, as well as a hud for player info"){
  var gameArea="___________________________________________________________________________________________ \n"+
  "|    A    |    B    |    C    |    A    |    B    |    B    |    A    |    C    |    D    | \n"+
  "|  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  | \n"+
  "|  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  |  *   *  | \n"+
  "__________|_________|_________|_________|_________|_________|_________|_________|_________| \n"
  var pl1Hud="Car 1 Job:??? Money:??? Roll:??? Stocks:??? Insurances:??? Education:???"
  var pl2Hud="Car 2 Job:??? Money:??? Roll:??? Stocks:??? Insurances:??? Education:???"
  var pl3Hud="Car 3 Job:??? Money:??? Roll:??? Stocks:??? Insurances:??? Education:???"
  var pl4Hud="Car 4 Job:??? Money:??? Roll:??? Stocks:??? Insurances:??? Education:???"
  var playerOrder=Array(pl1Hud,pl2Hud,pl3Hud,pl4Hud)
  var current=0
  var gameArea1=gameArea+"\n "+ playerOrder(current)
  
  Menu.sGameArea shouldBe(gameArea1) 
  }
  //•SHOW PLAYER ORDER - shows player names in the order they will play
  it("Shows player order"){
  val expectedResult="1,2,3,4"
  Menu.sGameOrder shouldBe(expectedResult)
  }
  //•ADVANCE ORDER
  it("Shows the next player order"){
  val nextResult="2,3,4,1"
  Menu.sGameArea shouldBe(nextResult)
    }
  }
}
}