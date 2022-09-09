/* ChessPiece object for every chesspiece in the game */
public abstract class ChessPiece 
{
  public final static int RED = 0; //Value that represents RED Chess
  public final static int BLACK = 1;//Value that represents BLACK Chess
  //====================== PRIVATE METHOD =======================//
  private int color;
  private String name;
  private boolean isAlive;
  //======================= CONSTRUCTOR =======================//
  public ChessPiece(String name,int color)//Either red or black
  {
    this.color = color;//Every chess will has its own respective color
    this.name = name;//Every chess will has its own name in the start
    this.isAlive = true; //Every chess is alive in the start
  }
  
  //======================= GET SET METHOD =======================//
  
  /* Gets the name of the chess
   * @return - The name of chesspiece whenever game starts*/
  public String GetName()
  {
    return this.name;
  }
  
  /* Gets the color for the chesspiece
   * @return - The color object that contains the color*/
  public int GetColor()
  {
    return this.color;
  }
  
  /* Gets the fate of the chess
   * @return - keep check the fate of the chess*/
  
  public boolean isAlive()
  {
    return this.isAlive;
  }
  
 
  
  
  /* Sets the fate of the chess(isAlive or isDead)
   * @param isAlive - keep check the fate of the chess*/
  public void setAlive(boolean isAlive)
  {
    this.isAlive = isAlive;
    
  }
  
  /* @param startRow - Original Position Row
   * @param startCol - Original Position Col
   * @param endRow - Destination Position Row
   * @param endCol - Destination Position Col*/
  public abstract boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol);
  
  
  
}