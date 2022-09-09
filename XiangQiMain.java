import java.util.Scanner;
  
//====================== MAIN =======================//
public class XiangQiMain
  
{
  //DANIEL AND MING FROM PERIOD 4
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    Displayer displayer = new Displayer();//Creates the Displayer object
    XiangQi xQ = new XiangQi();//Creates the XiangQi object
    String player;
    int rowStart,rowEnd,colStart,colEnd;
    
    do
    {
    System.out.println("=====================================================");
    System.out.println("                       XIANG QI                      ");
    System.out.println("=====================================================");
    System.out.println("  Which Player Start First ? R | B  ");
    System.out.println("1. Red");
    System.out.println("2. Black");
    player = input.nextLine();
    
    if ( player.equals("Red") || player.equals("red") || player.equals("1") || player.equals("RED"))
    {
      xQ.SetCurrPlayer(0);//Assign RED to start first
      System.out.println("RED        RED        RED       RED       RED        RED");
    }
    else if ( player.equals("Black")|| player.equals("black") || player.equals("2")  || player.equals("BLACK"))
    {
      xQ.SetCurrPlayer(1);//Assign PLayer BLACK to start first
      System.out.println("   BLACK          BLACK          BLACK          BLACK");
    }
    else
    {
      System.out.println("Either red or black / don play");
    }
    }while( (!(player.equals("1"))) && (!(player.equals("2"))) && (!(player.equals("red"))) && (!(player.equals("black"))));
    do
    {
      displayer.PrintGrid(xQ.GetGrid());//Get the grid from array
      System.out.print("Original Row :");
      rowStart = input.nextInt();
      System.out.print("Original Column :");
      colStart = input.nextInt();
      System.out.print("To Which Row ?");
      rowEnd = input.nextInt();
      System.out.print("To Which Column ?");
      colEnd = input.nextInt();
      xQ.Move(rowStart,colStart,rowEnd,colEnd);
      xQ.AnnounceWinner();
      xQ.SwitchPlayer();
    }
    while(xQ.AnnounceWinner() != true);
  }
}










