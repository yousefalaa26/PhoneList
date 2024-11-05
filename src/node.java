public class node {
    String name;
    String phoneNumber;
    node next;

    node(String name, String phoneNumber) {
        this.name= name;
        this.phoneNumber= phoneNumber;
        next  = null;
    }
}

class PhoneList {
    private node head;


    private boolean isEmpty() {
        return head == null;
    }

    public void addContact(String name, String phoneNumber) {
        if (isEmpty()) {
            head = new node(name, phoneNumber);
            System.out.println("Contact added: "+ name +", "+ phoneNumber);
            return;
        }

        node temp = head;
        while (temp.next != null) {
            temp= temp.next;
        }
        temp.next = new node(name, phoneNumber);

        System.out.println("Contact added: "+ name +", "+ phoneNumber);
    }

    public void displayList(){
        if(isEmpty()){
            System.out.println("Phone list is empty");
            return;
        }
        node temp = head;
        while(temp != null){
            System.out.println("Name: "+temp.name+", Phone: "+temp.phoneNumber);
            temp = temp.next;
        }
    }

    public void searchContact(String name){
        if(isEmpty()){
            System.out.println("Phone list is empty");
            return;
        }
        node temp = head;
        while(temp != null){
            if ( temp.name.equalsIgnoreCase(name)){
                System.out.println("Contact found: Name: "+temp.name+", Phone: "+temp.phoneNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Contact with name "+name+" not found");
    }

    public void deleteContact(String name){
        if(isEmpty()){
            System.out.println("Phone list is empty");
            return;
        }
        if(head.name.equalsIgnoreCase(name)){
            System.out.println("Deleting contact with name "+name+", Phone: "+head.phoneNumber);
            head = head.next;
            return;
        } // If node is the head

        node temp = head;
        while(temp.next != null){
            if (temp.next.name.equalsIgnoreCase(name)){
                System.out.println("Deleting contact with name "+name+", Phone: "+temp.next.phoneNumber);
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Contact not found");
    }
}
