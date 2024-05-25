import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalendarApp {
    private static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Calendar App Menu:");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Edit Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEvent(scanner);
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    editEvent(scanner);
                    break;
                case 4:
                    deleteEvent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting Calendar App. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addEvent(Scanner scanner) {
        System.out.print("Enter event date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);

        System.out.print("Enter event time (HH:mm): ");
        String timeStr = scanner.nextLine();
        LocalTime time = LocalTime.parse(timeStr);

        System.out.print("Enter event title: ");
        String title = scanner.nextLine();

        System.out.print("Enter event description: ");
        String description = scanner.nextLine();

        events.add(new Event(date, time, title, description));
        System.out.println("Event added successfully!");
    }

    private static void viewEvents() {
        System.out.println("Upcoming Events:");
        for (Event event : events) {
            System.out.println(event);
        }
    }

    private static void editEvent(Scanner scanner) {
        System.out.print("Enter the index of the event to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < events.size()) {
            Event event = events.get(index);
            System.out.print("Enter updated event title: ");
            String title = scanner.nextLine();
            event.setTitle(title);

            System.out.print("Enter updated event description: ");
            String description = scanner.nextLine();
            event.setDescription(description);

            System.out.println("Event updated successfully!");
        } else {
            System.out.println("Invalid event index.");
        }
    }

    private static void deleteEvent(Scanner scanner) {
        System.out.print("Enter the index of the event to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < events.size()) {
            events.remove(index);
            System.out.println("Event deleted successfully!");
        } else {
            System.out.println("Invalid event index.");
        }
    }
}

class Event {
    private LocalDate date;
    private LocalTime time;
    private String title;
    private String description;

    public Event(LocalDate date, LocalTime time, String title, String description) {
        this.date = date;
        this.time = time;
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return date + " " + time + " - " + title + ": " + description;
    }
}
