/* Pawn Chess */
public class Pawn extends ChessPiece
{
  //======================= Constructor =========================//
  public Pawn(String name,int color)
  {
    super(name,color);
   
  }
  //Checks which Row/Column can pawnpiece go
  /*true - Pawn move a step forward*/
  /*false - pawn move more than 1 step*/
  public boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol)
  {
    boolean result = false;
     //Checks if ChessPiece is Red
    if( GetColor() == ChessPiece.RED )
    {
      if ( startCol == endCol )
      {
        if( startRow + 1 == endRow ) 
        {
          System.out.println("Possible Move Exist");
          result = true;
        }
        else 
        {
          System.out.println("Only Vertical Forward");
          result = false;
        }
      }
      else
        {
          System.out.println("No diagonal and horizontal");
          result = false;
        }
      }
    //Checks if ChessPiece is Black
    else if ( GetColor() == ChessPiece.BLACK )
    {
      if ( startCol == endCol )
      {
        if( startRow - 1 == endRow ) 
        {
          System.out.println("Possible Move Exist");
          result = true;
        }
        else 
        {
          System.out.println("Only Vertical Forward");
          result = false;
        }      
      }
      else
      {
        System.out.println("No diagonal and horizontal");
        result = false;
      }
    }
    return result;
  }
}
