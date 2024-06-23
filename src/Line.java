public class Line {
    private String text;
    private int seqNum;

    public Line(String text, int seqNum) {
        this.text = text;
        this.seqNum = seqNum;
    }

    public String getText() {
        return text;
    }

    public int getSeqNum() {
        return seqNum;
    }
}
