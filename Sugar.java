class Sugar extends Cookie {
 String Shape; 
 boolean isDecorated; 
    
    Sugar()
    {
    Shape = "";
    isDecorated = false;
  }
  Sugar(String aShape)
  {
    Shape = aShape;
    isDecorated = false;
  }
  String getShape(){
    return Shape;
  }
  void setShape(String aShape){
    Shape = aShape;
  }
  void shapeCutOut(String aShape, int number){
    System.out.println(number + " cookies were cut into " + aShape);
    super.setNumber(number);
  }
  void decorate(){
    if(super.IsReady()== true) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else{
      System.out.println("Make sure to bake cookies first");
    }
  }
}