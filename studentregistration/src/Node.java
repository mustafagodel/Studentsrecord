public class Node {
    int number;
    String name;
    String surname;
    int mid;
    int fin;
    double average;
    String situation;
    Node next;

    public Node(int number, String name, String surname, int mid, int fin) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.mid = mid;
        this.fin = fin;
        average=mid*0.4+fin*0.6;
        if (average>=50){
            situation="Passed";
        }else{
            situation="Left";
        }
        next=null;
    }
}
