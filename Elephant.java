/* Elephant Chess */
public class Elephant extends ChessPiece
{
  //======================= Constructor =========================//
  public Elephant(String name,int color)
  {
    super(name,color);
  }
  
  //Checks which Row/Column can elephant piece go
  public boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol)
  {
    boolean result = false;
    //Checks if ChessPiece is Red
    if( GetColor() == ChessPiece.RED )
    {
        //EndRow and endCol cannot be the same as the original row and col
        if ( startRow != endRow && startCol != endCol)
        {
          if ( startRow + 2 == endRow  ||  startCol + 2 == endCol  ||  startCol - 2 == endCol || startRow - 2 == endRow )
          {
            System.out.println("Possible Move Exist");
            result = true;
          }
          //Illegal
          else 
          {
            System.out.println("[Possible Move doesn't exist]");
            result = false;
          }
        }
        else
        {
          System.out.println("Move Diagonally only :)[Possible Move doesn't exist]");
          result = false;
        }
      }
    //Checks if ChessPiece is Black
    else if ( GetColor() == ChessPiece.BLACK )
    {
        //EndRow and endCol cannot be the same as the original row and col
        if ( startRow != endRow && startCol != endCol)
        {
          if (( startRow + 2 == endRow ) || ( startCol + 2 == endCol ) || ( startCol - 2 == endCol ) || ( startRow - 2 == endRow))
          {
            System.out.println("Possible Move Exist");
            result = true;
          }
          //Illegal
          else 
          {
            System.out.println("[Possible Move doesn't exist]");
            result = false;
          }      
        }
        else
        {
          System.out.println("Move Diagonally only :)[Possible Move doesn't exist]");
          return false;
        }
      }
    
      
      return result;
    }
  }
