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
}
