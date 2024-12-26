
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("Недопустимые стороны треугольника: сумма любых двух сторон должна быть больше третьей стороны.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return String.format("Треугольник со сторонами: %.2f, %.2f, %.2f может существовать.", sideA, sideB, sideC);
    }
}