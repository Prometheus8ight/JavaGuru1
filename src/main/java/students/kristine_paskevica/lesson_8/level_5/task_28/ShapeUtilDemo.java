package students.kristine_paskevica.lesson_8.level_5.task_28;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();

        Shape tristuris = shapeUtil.createRandomTriangle();
        double tristLaukums = shapeUtil.calculateArea(tristuris);
        double tristPerimetrs = shapeUtil.calculatePerimeter(tristuris);
        System.out.println("Trīstūra laukums ir: " + tristLaukums + ", bet tā perimetrs ir: " + tristPerimetrs);


        Shape taisnsturis = shapeUtil.createRandomRectangle();
        double taisnLaukums = shapeUtil.calculateArea(taisnsturis);
        double taisnPerimetrs = shapeUtil.calculatePerimeter(taisnsturis);
        System.out.println("Taisnstūra perimetrs ir: " + taisnPerimetrs + ", bet tā laukums ir: " + taisnLaukums);

        Shape rinkis = shapeUtil.createRandomCircle();
        double rinkaLaukums = shapeUtil.calculateArea(rinkis);
        double rinkaPerimetrs = shapeUtil.calculatePerimeter(rinkis);
        System.out.println("Riņķa perimetrs ir: " + rinkaPerimetrs + ", bet tā laukums ir: " + rinkaLaukums);

        Shape kvadrats = shapeUtil.createRandomSquare();
        double kvadrLaukums = shapeUtil.calculateArea(kvadrats);
        double kvadrPerimetrs = shapeUtil.calculatePerimeter(kvadrats);
        System.out.println("Kvadrāta perimetrs ir: " + kvadrPerimetrs + ", bet tā laukums ir: " + kvadrLaukums);

    }
}
