public class ContactManager {
    Contact [] myFriends;
    int friendsContact;
    ContactManager(){
        friendsContact=0;
        myFriends=new Contact[500];
    }
    void addContact(Contact contact){
        myFriends[friendsContact]=contact;
        friendsContact++;
    }
    Contact searchContact(String searchName){
        for (int i = 0; i < friendsContact; i++){
            if (myFriends[i].name.equals(searchName)){
                return  myFriends[i];
            }
        }
        return null;

    }

    public static void main(String[] args) {
        //Create Contactmanager object
        ContactManager myContactManager =new ContactManager();
        //Create a new Contact object for james
        Contact frinedJames =new Contact();
        //Set the fields name
        frinedJames.name="James";
        frinedJames.phoneNumber="938679201";
        //add a new Contact to the ContactManager
        myContactManager.addContact(frinedJames);

        //Create a new Contact object for cezana
        Contact friendsCezana=new Contact();
        //Set the fields
        friendsCezana.name="Cezana";
        friendsCezana.phoneNumber="930947879";
        //Add Cezana Contact to the ContactManager
        myContactManager.addContact(friendsCezana);
       Contact result = myContactManager.searchContact("Cezana");


    }
}
