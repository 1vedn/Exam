public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(6, 4, 5.);
            System.out.println(triangle);

            Triangle invalidTriangle = new Triangle(1, 2, 3);
            System.out.println(invalidTriangle);

        } catch (IllegalTriangleException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}

