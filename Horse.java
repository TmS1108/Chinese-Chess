/* Horse Chess */
public class Horse extends ChessPiece
{
  //======================= Constructor =========================//
  public Horse(String name,int color)
  {
    super(name,color);
  } 
  
  //Checks which Row/Column can horse piece go
  public boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol)
  {
    boolean result = false;
      //Checks if ChessPiece is Red
    if( GetColor() == ChessPiece.RED )
    {
      if (( startRow - 1 == endRow && startCol - 2 == endCol ) ||  ( startRow - 1 == endRow && startCol + 2 == endCol )||  (startRow - 2 == endRow && startCol + 1 == endCol) ||  (startRow - 2 == endRow && startCol - 1 == endCol )||
          ( startRow + 1 == endRow && startCol + 2 == endCol ) ||  ( startRow + 1 == endRow && startCol - 2 == endCol )||  (startRow + 2 == endRow && startCol - 1 == endCol) ||  (startRow + 2 == endRow && startCol + 1 == endCol )||
          ( startRow + 2 == endRow && startCol + 1 == endCol ) ||  ( startRow + 2 == endRow && startCol - 1 == endCol )||  (startRow + 1 == endRow && startCol - 2 == endCol) ||  (startRow + 1 == endRow && startCol + 2 == endCol ))
      {
        result = true;
        System.out.println("Possible Move Exist");
      }
      else 
      {
        System.out.println("Horse L Shape only/Possible Move Doesn't exist");
        result = false;
      }
    }
    else if ( GetColor() == ChessPiece.BLACK )
    {
      if (( startRow - 1 == endRow && startCol - 2 == endCol ) ||  ( startRow - 1 == endRow && startCol + 2 == endCol )||  (startRow - 2 == endRow && startCol + 1 == endCol) ||  (startRow - 2 == endRow && startCol - 1 == endCol )||
          ( startRow + 1 == endRow && startCol + 2 == endCol ) ||  ( startRow + 1 == endRow && startCol - 2 == endCol )||  (startRow + 2 == endRow && startCol - 1 == endCol) ||  (startRow + 2 == endRow && startCol + 1 == endCol )||
          ( startRow + 2 == endRow && startCol + 1 == endCol ) ||  ( startRow + 2 == endRow && startCol - 1 == endCol )||  (startRow + 1 == endRow && startCol - 2 == endCol) ||  (startRow + 1 == endRow && startCol + 2 == endCol ))
      {
        result = true;
        System.out.println("Possible Move Exist");
      }
      else 
      {
        System.out.println("Horse L Shape only/Possible Move Doesn't exist");
        result = false;
      }      
    }
    return result;
  }
}





