import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.setName("Felicidad");
        hotel.setLocal("Brasil - Ceará - Fortaleza");
        hotel.setClassification(5);
        hotel.showTechnicalFiles();

        Reservation reservation = new Reservation();

        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.print("##-- Menu --##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| 1.View Hotel´s     |\n");
            System.out.print("| 2.Go out!              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int option = menu.nextInt();

            if (option == 2) {
                System.out.println("Goodbye");
                menu.close();
            }

            switch (option) {
                case 1:
                    hotel.showTechnicalFiles();
                    System.out.println("Would you like to make a reservation?");
                    System.out.println("1.Would you like to make a reservation?");
                    System.out.println("2. cancel reservation");
                    int option2 = menu.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("How many days you want to stay?");
                            int days = menu.nextInt();
                            reservation.durationInDays = days;
                            reservation.value = reservation.durationInDays * 20;
                            System.out.println("The value of the reservation is: " + reservation.value);
                            System.out.println("Would you like to reserve?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int option3 = menu.nextInt();
                            switch (option3) {
                                case 1:
                                    System.out.println("Reserved");
                                    break;
                                case 2:
                                    System.out.println("Ok");
                                    break;
                                default:
                                    System.out.println("Bad option");
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Goodbye!");
                        default:
                            System.out.println("Bad option");
                            break;
                    }
                    case 2:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Bad option");
                    break;
            }

        }
    }

}
