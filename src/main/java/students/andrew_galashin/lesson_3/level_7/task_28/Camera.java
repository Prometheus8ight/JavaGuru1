package students.andrew_galashin.lesson_3.level_7.task_28;

class Camera {
    String company;
    String color;
    String series;
    int model;

        Camera(String cameraCompany, String cameraColor, String cameraSeries, int cameraModel){
            this.company = cameraCompany;
            this.color = cameraColor;
            this.series = cameraSeries;
            this.model = cameraModel;

        }

            public void info () {
                System.out.println("Производитель камеры: " + this.company );
                System.out.println("Цвет камеры: " + this.color);
                System.out.println("Серия камеры: " + this.series);
                System.out.println("Модель камеры: " + this.model);

            }
}
