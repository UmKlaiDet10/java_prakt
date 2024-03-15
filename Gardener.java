import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название растения: ");
        String plantName = scanner.nextLine();

        Plant plant = new Plant(plantName);
        plant.filter();

        System.out.println("Измененное название растения: " + plant);

        scanner.close();
    }
}
