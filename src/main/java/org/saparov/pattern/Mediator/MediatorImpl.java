package org.saparov.pattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private List<Friend> friends = new ArrayList<>();
    
    public void registerFriend(Friend friend){
        friends.add(friend);
        friend.setMediator(this);
        
    }
    
    @Override
    public void send(String message, Friend sender) {
       for(Friend friend : friends){
           if(friend != sender){
               friend.receive(message);
           }
       }
    }
}
