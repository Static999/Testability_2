public class BmiService {
    public float calculate(int weight, float height) {
        float index;
        index = (int) (weight / (height * height));

        return index;


    }
}
