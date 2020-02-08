package hackerRank.Encryption;

public class Encryption{
    public String makeEncryption(String input){
        double norm =  Math.sqrt(input.trim().length());
        int rows = (int) Math.floor(norm);
        int colums = (int) Math.ceil(norm);
        if(rows * colums < input.length()){
            rows = (int) Math.round(norm);
            colums = (int) Math.round(norm);
        }

        return outputText(input,rows,colums);
    }

    private String outputText(String text,int rows,int colums){
        String result = "";
        for(int columsNum = 0;columsNum < colums;columsNum++){
            for(int rowNum = 0;rowNum < rows;rowNum++){
                int reStart = rowNum * colums + columsNum;
                int reLast  = reStart+1;
                if(reLast <= text.length()){
                    result += text.substring(reStart,reLast);
                }
            }
            result += " ";
        }
        return result;
    }
}
