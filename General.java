/* General Chess */
public class General extends ChessPiece
{
   //====================== Constructor =========================//
  public General(String name,int color)
  {
    super(name,color);
  }
  
 //Checks which Row/Column can general piece go
  public boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol)
  {
    boolean result = false;
    //Checks if ChessPiece is Red
    if( GetColor() == ChessPiece.RED )
    {
      //Checks if general/king is within palace
      if ( endCol > 2 && endCol < 6 && endRow < 3 )
      {
        if ( startRow == endRow || startCol == endCol )
        {
          //Red General Possible Move
          if (( startRow - 1 == endRow ) ||  ( startRow + 1 == endRow ) ||  ( startCol - 1 == endCol ) || ( startCol + 1 == endCol ))
          {
            result = true;
            System.out.println("Possible Move Exist");
          }
          else
          {
            System.out.println("Move either vertical,horizontal ( 1 box ) only :)[Possible Move doesn't exist]");
            result = false;
          }
        }
        else
        {
          System.out.println("Move either vertical,horizontal ( 1 box ) only :)[Possible Move doesn't exist]");
          result = false;
        }
      }
      //WARNING
      else 
      {
        System.out.println("The General must be within the Palace");
        result = false;
      }
    }
    //Checks if ChessPiece is Black
    else if ( GetColor() == ChessPiece.BLACK )
    {
       //Checks if general/king is within palace
      if ( endCol > 2 && endCol < 6 && endRow > 7 )
      {
        if ( startRow == endRow || startCol == endCol )
        {
          //Black General Possible Move
          if(( startRow - 1 == endRow ) ||  ( startRow + 1 == endRow ) ||  ( startCol - 1 == endCol ) || ( startCol + 1 == endCol ))
          {
            System.out.println("Possible Move Exist");
            result = true;
          }
          else
          {
            System.out.println("Move either vertical,horizontal ( 1 box ) only :)[Possible Move doesn't exist]");
            result = false;
          }
        }
        else
        {
          System.out.println("Move either vertical,horizontal ( 1 box ) only :)[Possible Move doesn't exist]");
          result = false;
        }
      }
    //WARNING
      else 
      {
        System.out.println("The General must be within the Palace");
        result = false;
      }      
    }
    return result;
  }

}
