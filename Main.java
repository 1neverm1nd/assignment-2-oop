public class Main {
    public static void main(String[] args) {
        // Создаем локомотивы
        Locomotive locomotive1 = new Locomotive("Talgo-locomotive1", 100);
        Locomotive locomotive2 = new Locomotive("Talgo-locomotive2", 120);

        // Создаем вагоны
        Carriage carriage1 = new Carriage("BH34", 50, 20);
        Carriage carriage2 = new Carriage("BH35", 60, 25);

        // Создаем поезд
        Train train = new Train("Talgo AST-ATA");

        // Добавляем локомотивы и вагоны к поезду
        train.addLocomotive(locomotive1);
        train.addLocomotive(locomotive2);
        train.addCarriage(carriage1);
        train.addCarriage(carriage2);

        // Выводим информацию о поезде
        System.out.println("Train details: the train is delayed for two hours and thirty minutes");
        System.out.println("Train name: " + train.getName());
        System.out.println("Total cargo capacity: " + train.calculateTotalCargoCapacity());
        System.out.println("Total passenger capacity: " + train.calculateTotalPassengerCapacity());
    }
}