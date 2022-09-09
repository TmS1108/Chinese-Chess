public class XiangQi //1 error found on 14 july 2020 , the chess u are moving cannot move to the place b4
  //error 2 found (elephant can move like horse)
{
  /* The game that keeps track of all the information, such as
   * the grid/rules and which player's turn */
  public final static int GRID_HEIGHT = 11;// The default height of the grid (DO NOT CHANGE)
  public final static int GRID_WIDTH = 11;// The default width of the grid (DO NOT CHANGE)
  //====================== PRIVATE METHOD =======================//
  private int p1NumEat;//Keep Track of Black Chess Eaten p1 = red
  private int p2NumEat; //Keep Track of Red Chess Eaten p2 = black
  private int currPlayer;//Keep Track of Currplayer
  private ChessPiece[][]grid;//Grid
  private General redGen;//Reference to red General Object
  private General blackGen;//Reference to black General Object
  
  
  //======================= CONSTRUCTOR =======================//
  public XiangQi()
  {
    this.p1NumEat = 1;//Starts with 1
    this.p2NumEat = 1;//Starts with 1
    
    this.grid = new ChessPiece[ XiangQi.GRID_HEIGHT ][ XiangQi.GRID_WIDTH ];
    this.grid[0][0] = new Chariot("C",ChessPiece.RED);//Set red Chariot Location
    this.grid[0][1] = new Horse("H",ChessPiece.RED);//Set red Horse Location
    this.grid[0][2] = new Elephant("E",ChessPiece.RED);//Set red Elephant Location
    this.grid[0][3] = new Advisor("A",ChessPiece.RED);//Set red Advisor Location
    this.grid[0][4] = new General("G",ChessPiece.RED);//Set red General Location
    this.redGen = (General)this.grid[0][4];//reference to general object
    this.grid[0][5] = new Advisor("A",ChessPiece.RED);
    this.grid[0][6] = new Elephant("E",ChessPiece.RED);
    this.grid[0][7] = new Horse("H",ChessPiece.RED);
    this.grid[0][8] = new Chariot("C",ChessPiece.RED);
    this.grid[2][1] = new Cannon("F",ChessPiece.RED);//Set Cannon Location
    this.grid[2][7] = new Cannon("F",ChessPiece.RED);
    this.grid[3][0] = new Pawn("P",ChessPiece.RED);//Set red Pawn Location
    this.grid[3][2] = new Pawn("P",ChessPiece.RED);
    this.grid[3][4] = new Pawn("P",ChessPiece.RED);
    this.grid[3][6] = new Pawn("P",ChessPiece.RED);
    this.grid[3][8] = new Pawn("P",ChessPiece.RED);
    
    this.grid[10][0] = new Chariot("C",ChessPiece.BLACK);//Set black chariot Location
    this.grid[10][1] = new Horse("H",ChessPiece.BLACK);//Set black horse Location
    this.grid[10][2] = new Elephant("E",ChessPiece.BLACK);//Set black elephant Location
    this.grid[10][3] = new Advisor("A",ChessPiece.BLACK);//Set black advisor Location
    this.grid[10][4] = new General("G",ChessPiece.BLACK);//Set black general Location
    this.blackGen = (General)this.grid[10][4];//reference to general object
    this.grid[10][5] = new Advisor("A",ChessPiece.BLACK);
    this.grid[10][6] = new Elephant("E",ChessPiece.BLACK);
    this.grid[10][7] = new Horse("H",ChessPiece.BLACK);
    this.grid[10][8] = new Chariot("C",ChessPiece.BLACK);
    this.grid[8][1] = new Cannon("F",ChessPiece.BLACK);//Set black cannon Location
    this.grid[8][7] = new Cannon("F",ChessPiece.BLACK);
    this.grid[7][0] = new Pawn("P",ChessPiece.BLACK);
    this.grid[7][2] = new Pawn("P",ChessPiece.BLACK);//Set black Pawn Location
    this.grid[7][4] = new Pawn("P",ChessPiece.BLACK);
    this.grid[7][6] = new Pawn("P",ChessPiece.BLACK);
    this.grid[7][8] = new Pawn("P",ChessPiece.BLACK);
  }
  
  /* It returns the 2D grid to the caller
   * 
   * @return - The 2D grid containing ChessPiece objects */
  public ChessPiece[][]GetGrid()
  {
    return this.grid;
  }
  
  /* Returns the current player, represented by a number value
   * 
   * @return - The value that represents the player.
   *           0 represents player RED (value 0 is stored in ChessPiece.RED)
   *           1 represents player BLACK (value 1 is stored in ChessPiece.BLACK) */   
  public int GetCurrPlayer()
  {
    return this.currPlayer;
  }
  
  /* Set who will be the start player
   * 
   * @param startPlayer - The value that represents the player */
  public void SetCurrPlayer(int startPlayer)
  {
    this.currPlayer = startPlayer;
  }
  
  /* Switch player turn to the next player (If current player is Red, then it 
   * switches to Black. If current player is Black, then it switches to Red) */   
  public void SwitchPlayer()
  {
    if ( this.currPlayer == ChessPiece.RED ) 
    {
      System.out.println("   BLACK          BLACK          BLACK          BLACK");
      this.currPlayer = ChessPiece.BLACK;
    }
    else
    {
      System.out.println("RED        RED        RED       RED       RED        RED");
      this.currPlayer = ChessPiece.RED;
    }
  }
  
  /* Check winner when one of the general pass away
   * @return - Returns true, if there is a winner.
   *           Returns false, if there is no winner */    
  public boolean AnnounceWinner()
  {
    if( redGen.isAlive() == false && blackGen.isAlive() == true )
    {
      System.out.println("BLACK WINS!!!pOgGers");
      return true;
    }
    else if ( blackGen.isAlive() == false && redGen.isAlive() == true )
    {
      System.out.println("RED WINS!!!pOgGers");
      return true;
    }
    else
    {
      return false;
    }
  }
  
  /*ChessType - Find the specific piece and its type at rowStart and colStart [Polymophyism]
   *Check whether the move is in the grid
   *If grid is null,move chess to destination and remove the chess from the original*/
  public boolean Move(int startRow, int startCol, int endRow, int endCol)
  {
    // Find the piece and its type at rowStart and colStart //Polymophyism
    boolean ChessType = grid[startRow][startCol].PossibleMove(startRow, startCol, endRow, endCol) ;
    if( ChessType == true )
    {
      //Within the grid
      if( endRow >= 0 && endRow < 11 && endCol >= 0 && endCol < 9 )
      {
        // checks if the player is only moving their own color chess
        if ( this.grid[startRow][startCol].GetColor() == this.GetCurrPlayer() )
        {
          if ( this.grid[endRow][endCol] == null )
          {
            this.grid[endRow][endCol] = this.grid[startRow][startCol];
            this.grid[startRow][startCol] = null;
            return true;
          }
          else if( this.grid[startRow][startCol].GetColor() == this.grid[endRow][endCol].GetColor()  )
          {
            System.out.println("You're Friends for a reason.....Returning Back to original position! Next turn!");
            return false;// Not move
          }
          else
          {
            System.out.println("Coming through(eat)");
            //Red
            if ( this.currPlayer == 0 )
            {
              //If eaten, set it to not Alive
              this.grid[endRow][endCol].setAlive(false);
              String notalive[] = new String[32];
              
              for (int i = 0; i< notalive.length;i++)
              {
                if (notalive[i] == null)
                {
                  if (this.grid[endRow][endCol].isAlive() == false)
                  {
                    notalive[i] = this.grid[endRow][endCol].GetName();
                    System.out.println(notalive[i]);
                    break;
                  }
                }
              }
              
                
              //String[][] notAlive = new ChessPiece();
              
                //remove piece at destination
                removePieceAt(endRow,endCol);
                //The startRow & startCol replace the endRow & startCol
                this.grid[endRow][endCol] = this.grid[startRow][startCol];
                //Original Position Set to null
                this.grid[startRow][startCol] = null;
                //Keep Track on how many black eaten
                System.out.println("Total Black Chess Eaten:" + p1NumEat++ + "  ");
              
              //}
              //if ( this.grid[endRow][endCol].isAlive() == false ) 
              //{
              //System.out.println(grid[endRow][endCol].GetName()); 
              //}
            
            }
            //Black
            else if ( this.currPlayer == 1  )
            {
              //If eaten, set it to not Alive
              this.grid[endRow][endCol].setAlive(false);
              //remove piece at destination
              removePieceAt(endRow,endCol);
              //The startRow & startCol replace the endRow & startCol
              this.grid[endRow][endCol] = this.grid[startRow][startCol];
              //Original Position Set to null
              this.grid[startRow][startCol] = null;
              //Keep Track on how many red eaten
              System.out.println("Total Red Chess Eaten:" + p2NumEat++ + "  ");
            }
          }
        }
        else
        {
          System.out.println("Wrong Colour :) Next turn!");
          return false;
        }
      }
      else
      {
        System.out.println("Out Of Bound/ RowColumn does not exists");//Elephant
        return false;
      }
    }
    else
    {
      System.out.println("AYAYA AYAYA AYAYA AYAYA AYAYA AYAYA AYAYA AYAYA");
      return false;
    }
    return true;
  }
  
   
  //Remove piece at destination
  public void removePieceAt(int endRow,int endCol)
  {
   
    this.grid[endRow][endCol] = null;
  }
  
  
}

 