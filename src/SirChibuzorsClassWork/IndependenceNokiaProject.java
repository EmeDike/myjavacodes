package SirChibuzorsClassWork;

import java.util.Scanner;

public class IndependenceNokiaProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            while (true) {
                printMainMenu();
                int userInput = input.nextInt();

                switch (userInput) {
                    case 1:
                        handlePhoneBook();
                        break;
                    case 2:
                        handleMessages();
                        break;
                    case 3:
                        System.out.println("Chart");
                        break;
                    case 4:
                        handleCallRegister();
                        break;
                    case 5:
                        handleTones();
                        break;
                    case 6:
                        handleSettings();
                        break;
                    case 7:
                        System.out.println("Call divert");
                        break;
                    case 8:
                        System.out.println("Games");
                        break;
                    case 9:
                        System.out.println("Calculator");
                        break;
                    case 10:
                        System.out.println("Reminders");
                        break;
                    case 11:
                        handleClock();
                        break;
                    case 12:
                        System.out.println("Profiles");
                        break;
                    case 13:
                        System.out.println("SIM services");
                        break;
                    case 0:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Wrong Input, try again");
                }
            }
        }

    private static void handleClock() {
    }

    private static void handleSettings() {
    }

    private static void handleTones() {
    }

    private static void handleCallRegister() {
    }

    private static void handleMessages() {
    }

    private static void printMainMenu() {
            System.out.println("""
                Menu   
                1-> Phone book
                2-> Messages
                3-> Chart
                4-> Call Register
                5-> Tones
                6-> Settings
                7-> Call Divert
                8-> Games
                9-> Calculator
                10-> Reminders
                11-> Clock
                12-> Profiles
                13-> SIM services
                0-> Exit
                """);
        }

        private static void handlePhoneBook() {
            while (true) {
                printPhoneBookMenu();
                int userInput = input.nextInt();

                switch (userInput) {
                    case 1:
                        System.out.println("Search Activated");
                        break;
                    case 2:
                        System.out.println("Service Nos Activate");
                        break;
                    case 3:
                        System.out.println("Add name Activated");
                        break;
                    case 4:
                        System.out.println("Erase Activated");
                        break;
                    case 5:
                        System.out.println("Edit Activated");
                        break;
                    case 6:
                        System.out.println("Assign tone Activated");
                        break;
                    case 7:
                        System.out.println("Send b'card is Activated");
                        break;
                    case 8:
                        handlePhoneBookOption();
                        break;
                    case 9:
                        System.out.println("Speed dail activated");
                        break;
                    case 10:
                        System.out.println("Voice tag activated");
                        break;
                    case 0:
                        return; // Go back to the main menu
                    default:
                        System.out.println("Wrong input, try again!!");
                }
            }
        }

        private static void printPhoneBookMenu() {
            System.out.println("""
                Phone Book:
                1-> Search
                2-> Service Nos.
                3-> Add name
                4-> Erase
                5-> Edit
                6-> Assign tone
                7-> Send b'card
                8-> Option
                9-> Speed dials
                10-> Voice tags
                0-> Back to main menu
                """);
        }

        private static void handlePhoneBookOption(Scanner input) {
            System.out.println("""
                Option
                1-> Type of view
                2-> Memory Status
                """);
            int userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Type of view Activated");
                    break;
                case 2:
                    System.out.println("Memory Status Activated");
                    break;
                default:
                    System.out.println("Sorry wrong input, try again.");

    private static void handleCallRegister(Scanner input) {
        while (true) {
            printCallRegisterMenu();
            int callRegister = input.nextInt();

            switch (callRegister) {
                case 1:
                    System.out.println("Missed calls");
                    break;
                case 2:
                    System.out.println("Received calls");
                    break;
                case 3:
                    System.out.println("Dialled numbers");
                    break;
                case 4:
                    System.out.println("Erase recent call list");
                    break;
                case 5:
                    handleShowCallDuration(input);
                    break;
                case 6:
                    handleShowCallCost(input);
                    break;
                case 7:
                    handleCallCostSettings(input);
                    break;
                case 8:
                    System.out.println("Prepaid credit");
                    break;
                case 0:
                    return; // Go back to the main menu
                default:
                    System.out.println("Wrong input, try again.");
            }
        }
    }

    private static void printCallRegisterMenu() {
        // ... (unchanged)
    }

    private static void handleShowCallDuration(Scanner input) {
        System.out.println("""
                Show call duration
                1-> Last call duration
                2-> All call's duration
                3-> Received call's duration
                4-> Dialled calls duration
                5-> Clear timers
                0-> Back to call register menu
                """);

        int showCallDuration = input.nextInt();
        switch (showCallDuration) {
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All call's duration");
                break;
            case 3:
                System.out.println("Received call's duration");
                break;
            case 4:
                System.out.println("Dialled calls duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;
            case 0:
                // Go back to the call register menu
                break;
            default:
                System.out.println("Wrong input, try again.");
        }
    }

    private static void handleShowCallCost(Scanner input) {
        // ... (similar structure to handleShowCallDuration)
    }

    private static void handleCallCostSettings(Scanner input) {
        // ... (similar structure to handleShowCallDuration)
    }

    private static void handleTones(Scanner input) {
        // Implementation for handling "Tones" section
    }

    private static void handleShowCallDuration(Scanner input) {
        System.out.println("""
                Show call duration
                1-> Last call duration
                2-> All call's duration
                3-> Received call's duration
                4-> Dialled calls duration
                5-> Clear timers
                0-> Back to call register menu
                """);

        int showCallDuration = input.nextInt();
        switch (showCallDuration) {
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All call's duration");
                break;
            case 3:
                System.out.println("Received call's duration");
                break;
            case 4:
                System.out.println("Dialled calls duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;
            case 0:
                // Go back to the call register menu
                break;
            default:
                System.out.println("Wrong input, try again.");
        }
    }}
