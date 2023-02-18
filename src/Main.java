public class Main {
    public static void main(String[] args) {
        System.out.print("Индекс массы тела: ");
        {
            BmiService service = new BmiService();
            int weight = 74; // Вес (кг)
            float height = 1.77F; // Рост (м)
            float index = service.calculate( weight, (float) height);
            System.out.print(index);
        }
    }
}