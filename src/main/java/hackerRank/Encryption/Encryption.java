package hackerRank.Encryption;

public class Encryption{

    public String makeEncryption(String input){
        double norm =  Math.sqrt(input.trim().length());
        int row = (int) Math.floor(norm);
        int columns = (int) Math.ceil(norm);
        if(row*columns < input.length()){
            row = (int) Math.round(norm);
            columns = (int) Math.round(norm);
        }
        String output = "" ;
        for(int index = 0;index < columns;index++){
            String conString= "";
            for(int index2=0;index2<row;index2++){
                int reStart = index2*columns+index;
                int reLast = reStart+1;
                if(reLast <= input.length()) {
                    conString += input.substring(reStart, reLast);
                }
            }
            output += conString+" ";
        }
        return output;
    }
}
