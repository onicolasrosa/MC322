package src.configuration.main;

import java.util.Scanner;

import src.entrypoints.controllers.ItemController;

public class Main {
    public static Library library = new Library();
    public static ItemController itemController = new ItemController();
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- Library Menu ----");
            System.out.println();
            System.out.println("1. Item Management");
            System.out.println("2. Member Management");
            System.out.println("3. Generate Reports and Statistics");
            System.out.println("4. Employee Administration");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println();
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Item Management Menu
                    itemManagementMenu(scanner);
                    break;
                case 2:
                    // Member Management Menu
                    memberManagementMenu(scanner);
                    break;
                case 3:
                    // Reports and Statistics Menu
                    reportsStatisticsMenu(scanner);
                    break;
                case 4:
                    // Employee Administration Menu
                    employeeAdministrationMenu(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the menu. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void itemManagementMenu(Scanner scanner) throws IllegalArgumentException, IllegalAccessException {
        while (true) {
            System.out.println("---- Item Management Menu ----");
            System.out.println();
            System.out.println("1. List Available Items");
            System.out.println("2. Add Item");
            System.out.println("3. Edit Item");
            System.out.println("4. Remove Item");
            System.out.println("5. Item Loan");
            System.out.println("6. Loan Renewal");
            System.out.println("7. Item Reservations");
            System.out.println("8. Back");
            System.out.println();
            System.out.println();
            System.out.print("Choose an option: ");

            int itemOption = scanner.nextInt();
            scanner.nextLine();

            switch (itemOption) {
                case 1:
                    itemController.printAllAvailableItems(library.getLibraryItems());
                    break;
                case 2:
                    itemAdditionMenu(scanner);
                    break;
                case 3:
                    editItem(scanner);
                    break;
                case 4:
                    removeItem(scanner);
                    break;
                case 5:
                    performLoan(scanner);
                    break;
                case 6:
                    performRenewal(scanner);
                    break;
                case 7:
                    makeReservation(scanner);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void memberManagementMenu(Scanner scanner) {
        while (true) {
            System.out.println("---- Member Management Menu ----");
            System.out.println();
            System.out.println("1. List Members");
            System.out.println("2. Add Member");
            System.out.println("3. Edit Member");
            System.out.println("4. Remove Member");
            System.out.println("5. Back");
            System.out.println();
            System.out.println();
            System.out.print("Choose an option: ");

            int memberOption = scanner.nextInt();
            scanner.nextLine();

            switch (memberOption) {
                case 1:
                    // List Members
                    break;
                case 2:
                    addMember(scanner);
                    break;
                case 3:
                    editMember(scanner);
                    break;
                case 4:
                    removeMember(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void reportsStatisticsMenu(Scanner scanner) {
        while (true) {
            System.out.println("---- Reports and Statistics Menu ----");
            System.out.println();
            System.out.println("1. Generate Member Activity Report");
            System.out.println("2. Generate Multimedia Item Usage Report");
            System.out.println("3. Generate Fines and Payments Report");
            System.out.println("4. Generate Item Availability Report");
            System.out.println("5. Generate Usage Statistics by Member Profile");
            System.out.println("6. Generate Most Popular Items Report");
            System.out.println("7. Back");
            System.out.println();
            System.out.println();
            System.out.print("Choose an option: ");

            int reportOption = scanner.nextInt();
            scanner.nextLine();

            switch (reportOption) {
                case 1:
                    generateMemberActivityReport();
                    break;
                case 2:
                    generateMultimediaItemUsageReport();
                    break;
                case 3:
                    generateFinesReport();
                    break;
                case 4:
                    generateItemAvailabilityReport();
                    break;
                case 5:
                    generateUsageStatisticsByProfile();
                    break;
                case 6:
                    generateMostPopularItemsReport();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void employeeAdministrationMenu(Scanner scanner) {
        while (true) {
            System.out.println("---- Employee Administration Menu ----");
            System.out.println();
            System.out.println("1. Administrators");
            System.out.println("2. Attendants");
            System.out.println("3. Managers");
            System.out.println("4. Back");
            System.out.println();
            System.out.println();
            System.out.print("Choose an option: ");

            int employeeOption = scanner.nextInt();
            scanner.nextLine();

            switch (employeeOption) {
                case 1:
                    // Administrator Administration Menu
                    administratorMenu(scanner);
                    break;
                case 2:
                    // Attendant Administration Menu
                    attendantMenu(scanner);
                    break;
                case 3:
                    // Manager Administration Menu
                    managerMenu(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void itemAdditionMenu(Scanner scanner) throws IllegalArgumentException, IllegalAccessException{
        while (true) {
            System.out.println("---- Item Administration Menu ----");
            System.out.println();
            System.out.println("1. Book");
            System.out.println("2. CD");
            System.out.println("3. DVD");
            System.out.println("4. EBook");
            System.out.println("5. Multimedia Resource");
            System.out.println("6. Back");
            System.out.println();
            System.out.println();
            System.out.print("Choose an option: ");

            int itemOption = scanner.nextInt();
            scanner.nextLine();

            switch (itemOption) {
                case 1:
                    addItem("Book" ,scanner);
                    break;
                case 2:
                    addItem("CD" ,scanner);
                    break;
                case 3:
                    addItem("DVD" ,scanner);
                    break;
                case 4:
                    addItem("EBook" ,scanner);
                    break;
                case 5:
                    addItem("MultimediaResource" ,scanner);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void administratorMenu(Scanner scanner) {
        // Logic for administrator administration
    }

    private static void attendantMenu(Scanner scanner) {
        // Logic for attendant administration
    }

    private static void managerMenu(Scanner scanner) {
        // Logic for manager administration
    }

    // Methods to perform loan, renewal, and reservation
    private static void performLoan(Scanner scanner) {
        // Logic to perform a loan
        System.out.println("Item Loan Operation");
    }

    private static void performRenewal(Scanner scanner) {
        // Logic to perform a loan renewal
        System.out.println("Loan Renewal Operation");
    }

    private static void makeReservation(Scanner scanner) {
        // Logic to make a reservation for an item
        System.out.println("Item Reservation Operation");
    }

    // Methods to add, edit, and remove items and members
    private static void addItem(String option, Scanner scanner) throws IllegalArgumentException, IllegalAccessException {
        // Logic to add a new item
        itemController.addItem(library, itemController.createItem(option, scanner));
        System.out.println("Item Addition Operation");
    }

    private static void editItem(Scanner scanner) {
        // Logic to edit an existing item
        System.out.println("Item Editing Operation");
    }

    private static void removeItem(Scanner scanner) {
        // Logic to remove an item
        System.out.println("Item Removal Operation");
    }

    private static void addMember(Scanner scanner) {
        // Logic to add a new member
        System.out.println("Member Addition Operation");
    }

    private static void editMember(Scanner scanner) {
        // Logic to edit an existing member
        System.out.println("Member Editing Operation");
    }

    private static void removeMember(Scanner scanner) {
        // Logic to remove a member
        System.out.println("Member Removal Operation");
    }

    // Methods to generate reports and statistics
    private static void generateMemberActivityReport() {
        // Logic to generate the Member Activity Report
        System.out.println("Generating Member Activity Report");
    }

    private static void generateMultimediaItemUsageReport() {
        // Logic to generate the Multimedia Item Usage Report
        System.out.println("Generating Multimedia Item Usage Report");
    }

    private static void generateFinesReport() {
        // Logic to generate the Fines and Payments Report
        System.out.println("Generating Fines and Payments Report");
    }

    private static void generateItemAvailabilityReport() {
        // Logic to generate the Item Availability Report
        System.out.println("Generating Item Availability Report");
    }

    private static void generateUsageStatisticsByProfile() {
        // Logic to generate Usage Statistics by Member Profile
        System.out.println("Generating Usage Statistics by Member Profile");
    }

    private static void generateMostPopularItemsReport() {
        // Logic to generate the Most Popular Items Report
        System.out.println("Generating Most Popular Items Report");
    }
}
