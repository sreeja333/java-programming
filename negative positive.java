class Main {
  public static void main(String[] args) {
    int number = 109;
    if (number > 0)
    {
      System.out.println(number+"is a positive number");
    } 
    else if (number<0)
    {
      System.out.println(number+"is a negative number");
    }
    else if (number <= 0)
    {
      System.out.println(number+"is a zero");
    }
    else
    System.out.println(number+"is either positive or negative or zero");
  }
}