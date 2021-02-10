package students.pavels_steinbors.lesson_3.level_7.task_28;

class Ball {

        String name;
        String color;
        String material;

    Ball(String ballModel, String ballColor, String ballMaterial) {
        this.name = ballModel;
        this.color = ballColor;
        this.material = ballMaterial;
    }
    public void putBallModel () {
        System.out.println("Ball model: " + this.name);
    }
    public void putBallColor () {
        System.out.println("Color is: " + this.color);
    }
    public void putBallMaterial () {
        System.out.println("Ball material is: " + this.material);
    }

}
