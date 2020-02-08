package hackerRank.Encryption;

public class Encryption{
    public String makeEncryption(String input){
        String output = "" ;
        double norm =  Math.sqrt(input.trim().length());
        int rows = (int) Math.floor(norm);
        int colums = (int) Math.ceil(norm);
        if(rows*colums < input.length()){
            rows = (int) Math.round(norm);
            colums = (int) Math.round(norm);
        }
        for(int index = 0;index < colums;index++){
            for(int index2=0;index2<rows;index2++){
                int reStart = index2*colums+index;
                int reLast = reStart+1;
                if(reLast <= input.length()) {
                    output += input.substring(reStart, reLast);
                }
            }
            output += " ";
        }
        return output;
    }
}
