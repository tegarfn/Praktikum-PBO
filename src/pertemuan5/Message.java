package pertemuan5;

class Message {
    void add(String name) {
        System.out.println("Adding " + name + " to Data...");
    }

    void update(String name) {
        System.out.println("Updating " + name + " to Data...");
    }

    void delete(String name) {
        System.out.println("Removing " + name + " from Data...");
    }

    void noData() {
        System.out.println("Data not found...");
    }

    void noData(String name) {
        System.out.println("Data " + name + " not found...");
    }

    void noChoice() {
        System.out.println("Invalid choice...");
    }

    void exit() {
        System.out.println("Exiting...");
    }
}
