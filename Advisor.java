/* Advisor Chess */
public class Advisor extends ChessPiece
{
  //======================= Constructor ========================//
  public Advisor(String name,int color)
  {
    super(name,color);
  }
  //Checks which Row/Column can advisor piece go
  public boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol)
  {
    boolean result = false;
     //Checks if ChessPiece is Red
    if( GetColor() == ChessPiece.RED )
    {

      //Checks if advisor is within palace
      if ( endCol > 2 && endCol < 6 && endRow < 3 )//cannot be same row and column //row
      {
        if (( startRow + 1 == endRow && startCol + 1 == endCol ) ||  
            ( startRow - 1 == endRow && startCol - 1 == endCol ) ||  
            ( startRow + 1 == endRow && startCol - 1 == endCol ) ||  
            ( startRow - 1 == endRow && startCol + 1 == endCol ))
        {
          result = true;
          System.out.println("Possible Move Exist");
        }
        else
        {
          System.out.println("Only Diagonal ( 1 box )[Possible Move Doesn't Exist]");
          result = false;
        }
      }
      //Illegal
      else 
      {
        System.out.println("Advisor must be within the Palace");
        result = false;
      }
    }
  
    //Checks if ChessPiece is Black
    else if ( GetColor() == ChessPiece.BLACK )
    {
      //Checks if advisor is within palace
      if ( endCol > 2 && endCol < 6 && endRow > 7 )
      {
        if(( startRow - 1 == endRow && startCol - 1 == endCol ) || ( startRow - 1 == endRow && startCol + 1 == endCol ) ||  
           ( startRow + 1 == endRow && startCol + 1 == endCol ) || ( startRow + 1 == endRow && startCol - 1 == endCol ))
        {
          result = true;
          System.out.println("Possible Move Exist");
        }
        else
        {
          System.out.println("Only Diagonal ( 1 box )[Possible Move Doesn't Exist]");
          result = false;
        }
      }
      //Illegal
      else 
      {
        System.out.println("Advisor must be within the Palace");
        result = false;
      }      
    }
  return result;
  }
}