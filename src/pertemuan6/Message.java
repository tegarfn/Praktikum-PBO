package pertemuan6;

final class Message {
    final void add(String name) {
        System.out.println("Adding " + name + " to Data...");
    }

    final void update(String name) {
        System.out.println("Updating " + name + " to Data...");
    }

    final void delete(String name) {
        System.out.println("Removing " + name + " from Data...");
    }

    final void noData() {
        System.out.println("Data not found...");
    }

    final void noData(String name) {
        System.out.println("Data " + name + " nost found...");
    }

    final void noChoice() {
        System.out.println("Invalid choice...");
    }

    final void exit() {
        System.out.println("Exiting...");
    }
}
