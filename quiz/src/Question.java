public class Question {

    private String text;
    private String[] options;
    private int indextOfCorrectAns;

    public Question(String text,String[] options, int indexOfCorrectAns) {
        this.text = text;
        this.options = options;
        this.indextOfCorrectAns = indexOfCorrectAns + 1;
    }

    public String getText(){
        return this.text;
    }

    public int getOptionsSize() {
        return this.options.length;
    }

    public String[] getOptions() {
        return this.options;
    }

    public boolean isCorrectAnswer(int answer) {
        return answer == this.indextOfCorrectAns;
    }

}
