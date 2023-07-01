package question17;

import java.util.ArrayList;

public class RecursiveFunction {
    
    private ArrayList<String> strings;
    private String toCount;
    
    public RecursiveFunction(String toCount){
        strings = new ArrayList<>();
        this.toCount = toCount;
    }
    
    public ArrayList<String> getStrings() {
        return strings;
    }
    
    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }
    
    public String getToCount() {
        return toCount;
    }
    
    public void setToCount(String toCount) {
        this.toCount = toCount;
    }
    
    public int countStrings(ArrayList<String> strings, String toCount){
        return count(strings, toCount);
    }
    
    //Helper method
    public int count(ArrayList<String> strings, String toCount){
        if(strings.isEmpty()){
            return 0;
        }
        if(strings.get(0).equals(toCount)){
            return 1 + count(strings, toCount);
        }
        return count(strings, toCount);
    }
    
}
