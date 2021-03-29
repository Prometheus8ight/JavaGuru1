package instructor.lesson_10.message;

class MockRandomGenerator implements RandomGenerator {

    private final int answer;

    public MockRandomGenerator(int answer) {
        this.answer = answer;
    }

    @Override
    public int next(int from, int to) {
        return answer;
    }
}
