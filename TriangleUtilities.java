 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
       String outcome = "";
       for (int i = 0; i < numberOfStars; i++){
       outcome += "*";    
    }
    return outcome;
}
    
    public static String getTriangle(int numberOfRows) {
        String outcome = "";
        int height = 0;
        for (int i = 0; i < numberOfRows; i++){
         for (int j = 0; j < height; j++){
             outcome += "*";
    }
        height++;
        outcome +="\n";
}
return outcome;
}

 public static String getSmallTriangle() {
        String outcome = "";
        for (int i = 0; i < 4; i++){
        for (int j = 0; j < i; j++){
             outcome += "*";
    }
        outcome +="\n";
}
return outcome;
  }

    public static String getLargeTriangle() {
        String outcome = "";
        for (int i = 0; i < 9; i++){
        for (int j = 0; j < i; j++){
             outcome += "*";
    }
        outcome +="\n";
}
return outcome;
 }
}
