package instructor.lesson_6.static_kw;

public class RangeDemo {

    int bar = 0;

    public static void main(String[] args) {

//        Range r1 = new Range();
//        Range r2 = new Range(0, 5);

        Range r1 = Range.of(0, 0);
        Range r2 = Range.of(0, 5);

        Range r3 = Range.ofLeftBound(10);
        Range r4 = Range.ofRightBound(15);

        Range r5 = Range.of(5, 8);

        r1.printInfo();
        r2.printInfo();
        r3.printInfo();
        r4.printInfo();
        r5.printInfo();

        Math.max(1, 5);
        Math.max(2.0f, 5.0f);


        RangeDemo rangeDemo = new RangeDemo();
        rangeDemo.bar++;
        rangeDemo.foo();
    }

    public void foo() {

    }
}
