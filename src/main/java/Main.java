import collections.List;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int choise;
        Scanner scan = new Scanner(System.in);
        List<String> elements=new List<String>(10);
        String x;
        int c;
        while (true){
            System.out.println("1.Add element\n2.delete element\n3.Get size\n4.get data\n5.display\n6.exit");
            System.out.print("Enter your choise : ");
            choise = scan.nextInt();
            switch (choise){
                case 1:
                    System.out.print("Enter element to insert : ");
                    x=scan.next();
                    elements.add(x);
                    break;
                case 2:
                    System.out.print("Enter element to delete : ");
                    x=scan.next();
                    elements.delete(x);
                    break;
                case 3:
                    System.out.println("Size of List is "+elements.size());
                    break;
                case 4:
                    System.out.print("Enter index value to get data :");
                    c=scan.nextInt();
                    System.out.println("Data at the index"+c+"is : "+elements.get(c));
                    break;
                case 5:
                    System.out.print("Data in the list is : ");
                    elements.display();
                    break;
                default:
                    return;
            }
        }
    }
}
