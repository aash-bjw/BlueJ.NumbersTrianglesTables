 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String outcome ="";
        int table;
        for (int i = 1; i <= 4; i++){
            for (int j =1; j <= 4; j++){
              table = i*j;
              outcome += String.format("%4s|",table + " ");
        
    }
            outcome += "\n";
    } 
    return outcome;
}

    public static String getLargeMultiplicationTable() {
        String outcome ="";
        int table;
        for (int i = 1; i <= 9; i++){
            for (int j =1; j <= 9; j++){
              table = i*j;
              outcome += String.format("%9s|",table + " ");
        
    }
            outcome += "\n";
    } 
    return outcome;
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome ="";
        int table;
        for (int i = 1; i <= tableSize; i++){
            for (int j =1; j <= tableSize; j++){
              table = i*j;
              outcome += String.format("%4s|",table + " ");
        
    }
            outcome += "\n";
    } 
    return outcome;
    }
}
