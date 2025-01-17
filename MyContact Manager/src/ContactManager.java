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
}
