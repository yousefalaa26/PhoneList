import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        PhoneList list = new PhoneList();
        int flag;
        String phone, name;

        while(true) {
            System.out.println();
            System.out.println("Please choose : \n1- Add new Contact.\n2- Display the list.\n3- Search contact.\n4- Delete contact");
            flag = input.nextInt();

            switch (flag){
                case 1 :
                    System.out.println("Enter a name to add: ");
                    name= input.next();
                    System.out.println("Enter a phone number to add: ");
                    phone= input.next();
                    list.addContact(name, phone);
                    break;
                case 2 :
                    list.displayList();
                    break;
                case 3:
                    System.out.println("Enter a name to search: ");
                    name = input.next();
                    list.searchContact(name);
                    break;
                case 4:
                    System.out.println("Enter a name to delete: ");
                    name = input.next();
                    list.deleteContact(name);
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }

    }
}
