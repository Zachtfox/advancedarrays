import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] iceCream = {"Chocolate","Cookie Dough", "Rocky Road", "Cookies and Cream", "Moose Tracks"};
        int[] inventory = {20, 12, 15, 8, 9};
        for(int i = 0; i < iceCream.length; i++)
            System.out.println(iceCream[i] + "\n" + "Quantity: " + inventory[i] + "\n");

        System.out.println("Enter the name of the item you would like to change.");
        String entry1 = scan.nextLine();
        System.out.println("Are you adding or subtracting? (enter 'add' or 'sub' to answer.");
        String entry2 = scan.nextLine();
        System.out.println("enter the amount you would like to add or subtract.");
        int entry3 = scan.nextInt();

        if(entry1.equalsIgnoreCase("Chocolate")){
            if(entry2.equalsIgnoreCase("add")){
                System.out.println("original quantity: " + inventory[0] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[0] += entry3;
                System.out.println("new quantity: " + inventory[0]);
            }
            else if(entry2.equalsIgnoreCase("sub")){
                System.out.println("original quantity: " + inventory[0] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[0] -= entry3;
                    if(inventory[0] <= 0){
                    System.out.println("error: quantity is 0");
                }else{
                        System.out.println("new quantity: " + inventory[0]);
                    }
            }
        }


        if(entry1.equalsIgnoreCase("Cookie Dough")){
            if(entry2.equalsIgnoreCase("add")){
                System.out.println("original quantity: " + inventory[1] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[1] += entry3;
                System.out.println("new quantity: " + inventory[1]);

            }
            else if(entry2.equalsIgnoreCase("sub")){
                System.out.println("original quantity: " + inventory[1] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[1] -= entry3;
                if(inventory[1] <= 0){
                    System.out.println("error: quantity is 0");
                }else{
                    System.out.println("new quantity: " + inventory[1]);
                }
            }
        }



        if(entry1.equalsIgnoreCase("Rocky Road")){
            if(entry2.equalsIgnoreCase("add")){
                System.out.println("original quantity: " + inventory[2] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[2] += entry3;
                System.out.println("new quantity: " + inventory[2]);
            }
            else if(entry2.equalsIgnoreCase("sub")){
                System.out.println("original quantity: " + inventory[2] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[2] -= entry3;
                if(inventory[2] <=0){
                    System.out.println("error: quantity is 0");
                }else{
                    System.out.println("new quantity: " + inventory[2]);
                }
            }
        }


        if(entry1.equalsIgnoreCase("Cookies and Cream")){
            if(entry2.equalsIgnoreCase("add")){
                System.out.println("original quantity: " + inventory[3] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[3] += entry3;
                System.out.println("new quantity: " + inventory[3]);
            }
            else if(entry2.equalsIgnoreCase("sub")){
                System.out.println("original quantity: " + inventory[3] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[3] -= entry3;
                if(inventory[3] <=0){
                    System.out.println("error: quantity is 0");
                }else{
                    System.out.println("new quantity: " + inventory[3]);
                }
            }
        }


        if(entry1.equalsIgnoreCase("Moose Tracks")){
            if(entry2.equalsIgnoreCase("add")){
                System.out.println("original quantity: " + inventory[4] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[4] += entry3;
                System.out.println("new quantity: " + inventory[4]);
            }
            else if(entry2.equalsIgnoreCase("sub")){
                System.out.println("original quantity: " + inventory[4] + "\n");
                System.out.println("amount changed: " + entry3 + "\n");
                inventory[4] -= entry3;
                if(inventory[4] <=0){
                    System.out.println("error: quantity is 0");
                }else{
                    System.out.println("new quantity: " + inventory[4]);
                }
            }
        }
    }
}
