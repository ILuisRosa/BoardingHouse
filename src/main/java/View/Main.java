package View;

import Model.Room;
import Model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //Create a array with 10 positions
        var rooms = new Room[10];

        //Fill the array and set them identifier
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].setIdentifier(i);
        }

        System.out.println("How many rooms will be rented?");
        int roomsQuantity = sc.nextInt();

        //Will read the data from user and create a new student, so he will be allocated in the respective room
        for (int i = 0; i < roomsQuantity; i++) {

            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            var st = new Student(name, email);
            rooms[room].setOcupied(true);
            rooms[room].setStudentID(st);
        }

        //Print the array and the busy rooms together with who is with
        System.out.println();
        System.out.println("Busy Rooms:");
        for (Room room : rooms) {
            if (room.isOcupied()) {
                System.out.println(room.getIdentifier()
                        + ": " + room.getStudentID().getStudent());
            } else {
                System.out.println("Rentable");
            }
        }

    }
}