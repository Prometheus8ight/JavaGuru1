package instructor.lesson_3;

class Point {

    int x; // member variable
    int y;

    Point() {
        // default constructor
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printInfo(String description) {
        System.out.println("Point " + description + " [" + this.x + ":" + this.y + "]");
    }

}
