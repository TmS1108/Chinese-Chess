/* To display the grid with the given 2D array */
public class Displayer
{
  
  public Displayer()
  {
  }
  
  /* Takes in the 2D grid and displays the contains as a 
   * grid on the screen, for players to see the current state
   * 
   * @param grid - The 2D array that contains ChessPiece objects */
  public void PrintGrid(ChessPiece[][] grid)
  {
    //Row
    for( int i = 0; i < grid.length ; i++ )
    {
      System.out.println("-----------------------------------------------------");
      //Column
      for( int j = 0; j < grid.length - 2 ; j++ )//grid.length - 2 as i create a grid 11 x 11 and chessgrid only need 11 x 9
      {
        if( grid[i][j] == null )
        {
          if( i == 5 ) {
          System.out.print(" ~~~ " + "|");  
          }
          else{
          System.out.print("     " + "|");
          }
        } 
        
        else
        {
          if (grid[i][j].GetColor() == ChessPiece.RED )
          {
            System.out.print( "  R" + grid[i][j].GetName() + " |");
          }
          else if( grid[i][j].GetColor() == ChessPiece.BLACK )
          {
            System.out.print( "  B" + grid[i][j].GetName() + " |" );
          }
        }
        
      }
      System.out.println("" + i);
    }
    System.out.println("-----------------------------------------------------");
    System.out.printf("%4d%5d%6d%6d%6d%6d%6d%6d%6d\n",0,1,2,3,4,5,6,7,8);
  }
}