class Cookie{
  private int number,bakeTime,bakeTemp;
  private boolean isBaked;

  Cookie(){
    number = 0; 
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }
  Cookie (int aNum, int aBakeTemp) {
    number = aNum; 
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTemp;
    isBaked = false;
  }
  boolean IsReady(){
    return isBaked;
  }
  void setNumber(int aCookieNumber){
    number = aCookieNumber;
  }
  void bake(int aBakeTemp, int aBakeTime){
    System.out.println(number + " cookies backed at " + aBakeTemp + " degrees Farenheit for " + aBakeTime + " minutes");
    isBaked=true;
  }

}