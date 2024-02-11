import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), 22));
        System.out.println(permission(generateRandomAge(), 0));
        System.out.println(permission(generateRandomAge(), 18));
        System.out.println(permission(generateRandomAge(), -21));
    }
    public static String permission ( int ageOfMan, int outTemperature) {
        if ((ageOfMan >= 20 && ageOfMan <= 45) && (outTemperature >= -20 && outTemperature <= 20)) {
            return "Можно идти гулять";
        } else if ((ageOfMan > 0 && ageOfMan < 20) && (outTemperature >= 0 && outTemperature <= 28)) {
            return "Можно идти гулять";
        } else if (ageOfMan > 45 && (outTemperature >= -10 && outTemperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge () {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
