package students.deniss_jankovskis.lesson_8.level_5.task_21;

class Square {

    public double height1, height2, width1, width2;

    Square(double height1) {
        this.height1 = height1;
        this.height2 = height1;
        this.width1 = height1;
        this.width2 = height1;

    }


    @Override
    public String toString() {
        return "Square{" +
                "height1=" + height1 +
                ", height2=" + height2 +
                ", width1=" + width1 +
                ", width2=" + width2 +
                '}';
    }

}
