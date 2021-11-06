import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose=-1;
        LinkList liste=new LinkList();
        Scanner input=new Scanner(System.in);
        while (choose!=0){
            System.out.println("Student Registration App");
            System.out.println("1-New record");
            System.out.println("2-Delete record");
            System.out.println("3-List records");
            System.out.println("4-Quit");
            System.out.println("Your Choice");
            choose=input.nextInt();
            if (choose==1){
                liste.ad();
            }else if(choose==2){
                liste.delete();
            }else if(choose==3){
                liste.Print();
            }else if(choose==4){
                System.out.println("Exiting the program");
                break;
            }else{
                System.out.println("You made the wrong choice [1-4]");
            }

        }
    }
}
