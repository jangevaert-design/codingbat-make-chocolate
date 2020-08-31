public class makeChocolate {
  public int makeChocolate(int small, int big, int goal) {
    if ((goal > (big * 5 + small)) || ((goal % 5) > small)) {
      return -1;
    }
    else if(goal < (big * 5)) {
      return (goal % 5);
    } else {
      return goal - big * 5;
    }
  }
}
