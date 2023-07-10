package org.example.Solid.bad.l;

import java.util.Scanner;

public class LSP_bad {
    public static void main(String[] args) {

            Datarepo_LSP_bad datarepo = new Datarepo_LSP_bad();
            int choice;
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println();
                System.out.println("Welcome");
                System.out.println("1. View All Numbers");
                System.out.println("2. Add a new Number");
                System.out.println("3. Update a number in specific position");
                System.out.println("4. Delete a number");
                System.out.println("5. Average of the numbers");
                System.out.println("6. Find the position of a number");
                System.out.println("7. Find the square of a number");
                System.out.println("8. Increase numbers by a specific amount");
                System.out.println("9. Multiply list by a specific number");
                System.out.println("10. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        datarepo.viewNumbers();
                        break;

                    case 2:
                        scanner.nextLine();
                        System.out.print("Enter Number you want to add: ");
                        int numberTobeAdded = scanner.nextInt();
                        datarepo.addNumber(numberTobeAdded);
                        System.out.println("Updated List of Numbers");
                        datarepo.viewNumbers();
                        break;

                    case 3:
                        scanner.nextLine();
                        System.out.print("Enter position in list at which you want to update the Number: ");
                        int position = scanner.nextInt();

                        System.out.print("Enter new number to replace : ");
                        int updatedNumber = scanner.nextInt();
                        datarepo.Update(position,updatedNumber);
                        break;

                    case 4:
                        scanner.nextLine();
                        System.out.print("Enter position at which you want to delete the number: ");
                        position = scanner.nextInt();
                        datarepo.deleteAtPosition(position);
                        break;
                    case 5:
                        System.out.println("The avg is : "+datarepo.avg());
                        break;
                    case 6:
                        scanner.nextLine();
                        System.out.print("Enter number whose position you want to find : ");
                        int numbertoFind = scanner.nextInt();
                        System.out.println("The number is present at position "+datarepo.positionedAt(numbertoFind));
                        break;
                    case 7:
                        scanner.nextLine();
                        System.out.print("Enter number whose position you want to find : ");
                        int numbertobeSquared = scanner.nextInt();
                        System.out.println("Square of "+numbertobeSquared+" is : "+datarepo.square(numbertobeSquared));
                        break;
                    case 8:
                        scanner.nextLine();
                        System.out.print("Enter by how much you want to increase the numbers : ");
                        int increment = scanner.nextInt();
                        datarepo.addAlltoList(increment);
                        break;
                    case 9:
                        scanner.nextLine();
                        System.out.print("Enter by which number you want to multiply the list : ");
                        int mul = scanner.nextInt();
                        datarepo.multiplyAll(mul);
                        break;
                    case 10:
                        System.out.println("Program exited Successfuly");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 10);
            scanner.close();
        }
    }