package hackerRank.Encryption;

public class Encryption{

    public String makeEncryption(String input){
        double norm =  Math.sqrt(input.trim().length());
        int rows = (int) Math.floor(norm);
        int colums = (int) Math.ceil(norm);
        if(rows * colums < input.length()){
            rows = (int) Math.round(norm);
        }

        return outputText(input,rows,colums);
    }

    private String outputText(String text,int rows,int colums){
        String result = "";
        int reStart = 0;
        int reLast = 0;
        for(int columsNum = 0;columsNum < colums;columsNum++){
            for(int rowNum = 0;rowNum < rows;rowNum++){
                reStart = rowNum * colums + columsNum;
                reLast  = reStart+1;
                if(reLast <= text.length()){
                    result += text.substring(reStart,reLast);
                }
            }
            result += " ";
        }

        return result;
    }
}
