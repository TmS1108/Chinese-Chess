/* Chariot Chess */
public class Chariot extends ChessPiece
{
  //======================= Constructor =========================//
  public Chariot(String name,int color)
  {
    super(name,color);
  }
  
  //Checks which Row/Column can chariot piece go
  public boolean PossibleMove(int startRow ,int startCol,int endRow, int endCol)
  {
    boolean result = false;
    //Checks if ChessPiece is Red
    if( GetColor() == ChessPiece.RED )
    {
      //Check horizontal and vertical
      if (( startCol == endCol  &&  endRow > -1  &&  endRow < 11 ) || ( startRow == endRow  &&  endCol > -1  &&  endCol < 9 ))                                                                                               
      {
        System.out.println("Possible Move Exist");
        result = true;
      }
      else 
      {
        System.out.println("Chottomateh,Possible Move doesn't exist./Vertical and Horizontal only");
        result = false;
      }
    }
    else if ( GetColor() == ChessPiece.BLACK )
    {
      if (( startCol == endCol  &&  endRow > -1  &&  endRow < 11 ) || ( startRow == endRow  &&  endCol > -1  &&  endCol < 9 ))                                                                                          
      {
        System.out.println("Possible Move Exist");
        result = true;
      }
      else 
      {
        System.out.println("Chottomateh,Possible Move doesn't exist./Vertical and Horizontal only");
        result = false;
      }      
    }
    return result;
  }
  
}