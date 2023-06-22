import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManagementSystem tms=new TicketManagementSystem();
        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.println("1.Create a bus ticket");
           System.out.println("2.Create a train ticket");
           System.out.println("3.Create a Plane ticket");
           System.out.println("4. Resolve a ticket");
           System.out.println("5.Print open tickets");
           System.out.println("6.Exit");
           System.out.println("Enter a choice");

           int choice = scanner.nextInt();
           scanner.nextLine();

        switch (choice){
            case 1:
                System.out.println("Enter ticket description");
                String busDescription =scanner.nextLine();
                System.out.println("Enter bus number:");
                String busNumber =scanner.nextLine();
                System.out.println("Enter departure time ");
                String busDepartureTime=scanner.nextLine();
                tms.createBusTicket(busDescription, busNumber,busDepartureTime);

                break;
            case 2:
                System.out.print("Enter ticket description: ");
                String trainDescription = scanner.nextLine();
                System.out.print("Enter train number: ");
                String trainNumber = scanner.nextLine();
                System.out.print("Enter departure time: ");
                String trainDepartureTime = scanner.nextLine();
                System.out.print("Enter platform: ");
                String trainPlatform = scanner.nextLine();
                tms.createTrainTicket(trainDescription, trainNumber, trainDepartureTime, trainPlatform);

                break;
            case 3:
                System.out.print("Enter ticket description: ");
                String planeDescription = scanner.nextLine();
                System.out.print("Enter flight number: ");
                String flightNumber = scanner.nextLine();
                System.out.print("Enter departure time: ");
                String planeDepartureTime = scanner.nextLine();
                System.out.print("Enter gate: ");
                String gate = scanner.nextLine();
                tms.createPlaneTicket(planeDescription, flightNumber, planeDepartureTime, gate);

                break;
            case 4:
                System.out.print("Enter ticket ID to resolve: ");
                int ticketId = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                tms.resolveTicket(ticketId);
                break;
            case 5:
                tms.printOpenTickets();
                break;
            case 6:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");


        }

        System.out.println();

        }

    }
}