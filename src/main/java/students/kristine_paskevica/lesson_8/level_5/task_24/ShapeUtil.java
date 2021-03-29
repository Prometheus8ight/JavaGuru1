package students.kristine_paskevica.lesson_8.level_5.task_24;

import java.util.Random;

class ShapeUtil {

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        double trijstMala = random.nextInt(7);
        return new Triangle("triangle", trijstMala);
    }

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("circle", random.nextInt(6));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("square", random.nextInt(8));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("rectangle", random.nextInt(8), random.nextInt(8));
    }
}
