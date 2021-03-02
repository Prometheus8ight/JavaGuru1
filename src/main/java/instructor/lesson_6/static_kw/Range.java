package instructor.lesson_6.static_kw;

public class Range {

    int leftBound;
    int rightBound;

    public Range() {
    }

    public Range(int leftBound, int rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    public static Range of(int leftBound, int rightBound) {
        return new Range(leftBound, rightBound);
    }

    public static Range ofLeftBound(int leftBound) {
        return new Range(leftBound, leftBound + 1);
    }

    public static Range ofRightBound(int rightBound) {
        return new Range(rightBound - 1, rightBound);
    }

    public void printInfo() {
        System.out.println("[" + leftBound + " : " + rightBound + "]");
    }

/*    public Range(int leftBound) {
        this.leftBound = leftBound;
        this.rightBound = leftBound + 1;
    }

    public Range(int rightBound) {
        this.leftBound = rightBound - 1;
        this.rightBound = rightBound;
    }*/

}
