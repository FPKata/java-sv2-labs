package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public int answerTruePercent(String answers){
        boolean[] booleans = convert(answers);
        int numberOfTrue = 0;
        for (int i = 0; i < booleans.length; i++){
            if (booleans[i]){
                numberOfTrue++;
            }
        }
        return (int) Math.round((double) numberOfTrue / booleans.length * 100);
    }

    boolean[] convert(String checkboxes) {
        try{
            return binaryStringConverter.binaryStringToBooleanArray(checkboxes);
        }catch(NullPointerException | IllegalArgumentException ex){
            throw new InvalidBinaryStringException(ex);
        }
    }
}
