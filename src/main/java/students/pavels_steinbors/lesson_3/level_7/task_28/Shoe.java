package students.pavels_steinbors.lesson_3.level_7.task_28;

class Shoe {

    String name;
    String color;
    String material;

    Shoe(String shoeModel, String shoeColor, String shoeMaterial) {
        this.name = shoeModel;
        this.color = shoeColor;
        this.material = shoeMaterial;

    }
    public void putShoeModel () {
        System.out.println("Football shoe model: " + this.name);
    }
    public void putShoeColor () {
        System.out.println("Color is: " + this.color);
    }
    public void putShoeMaterial () {
        System.out.println("Shoe material is: " + this.material);
    }


}
