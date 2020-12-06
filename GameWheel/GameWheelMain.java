public class GameWheelMain {
  
  
  public static void main(String[] args) { 
    
    GameWheel game = new GameWheel();
    
    Slice a = game.spinWheel();
    System.out.println("Spin 1 - Color: " + a.getColor() + ", Prize Amount: " + a.getPrizeAmount());
    Slice b = game.spinWheel();
    System.out.println("Spin 2 - Color: " + b.getColor() + ", Prize Amount: " + b.getPrizeAmount());
    Slice c = game.spinWheel();
    System.out.println("Spin 3 - Color: " + c.getColor() + ", Prize Amount: " + c.getPrizeAmount());
    
    int total = a.getPrizeAmount() + b.getPrizeAmount() + c.getPrizeAmount();
    
    if(a.getColor().equals(b.getColor()) && a.getColor().equals(c.getColor()) && b.getColor().equals(c.getColor())){
      total = total * 2;
      System.out.println("Three of the same color, double the Prize! Your Prize Total: " + total);
    }
    else{
      System.out.println("Your Prize Total: " + total);
    }
  }
  
}
