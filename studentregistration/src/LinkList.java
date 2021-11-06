import java.util.Scanner;

public class LinkList {

    Node head = null;
    Node tail = null;
    Node temp = null;
    Node temp2 = null;
    int number;
    String name;
    String surname;
    int mid;
    int fin;
    double average;
    String situation;
    Scanner input = new Scanner(System.in);

    void ad() {
        System.out.println("Enter student information");
        System.out.println("Number :" );
        number = input.nextInt();
        input.nextLine();
        System.out.println("Name   :" );
        name = input.nextLine();
        System.out.println("SurName :");
        surname = input.nextLine();
        System.out.println("Midterm exam:" );
        mid = input.nextInt();
        System.out.println("Final exam :");
        fin = input.nextInt();
        Node eleman = new Node(number, name, surname, mid, fin);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head = eleman;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("Enter the student number you want to delete");
            number = input.nextInt();
            if (number == head.number && head.next == null) {
                head = null;
                tail = null;
                System.out.println("Student number deleted");
            } else if (number == head.number && head.next != null) {
                head = head.next;
                System.out.println("Student number deleted");
            } else {
                temp = head;
                while (temp.next != null) {
                    if (number == temp.number) {
                    temp2.next=temp.next;
                    System.out.println("Student number deleted");
                    }
                        temp2 = temp;
                        temp = temp.next;
                }
                if (number == temp.number) {
                    temp2.next=null;
                    tail=temp2;
                    System.out.println("Student number deleted");
                }
            }
        }
    }
    void Print(){
        if (head==null){
            System.out.println("list is empty");
        }else{
            temp=head;
            while (temp!=null){
                System.out.println(temp.number+"student's information");
                System.out.println("****************************************");
                System.out.println("Name : "+temp.name);
                System.out.println("SurName : "+temp.surname);
                System.out.println("Midterm exam:" + temp.mid);
                System.out.println("Final exam:" + temp.fin);
                System.out.println("Avarage:" + temp.average);
                System.out.println("Situation:" + temp.situation);
                System.out.println("****************************************");
                temp=temp.next;
            }
        }
    }
}