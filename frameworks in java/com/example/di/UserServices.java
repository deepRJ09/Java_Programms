package com.example.di;

@Service
public class UserServices implements UserService {
    @Inject
    private NotificationService notificationService;
    @Override
    public  void registrationUser(String username){
        System.out.println("User registration: "+username);
        notificationService.sendNotification(username);
    }


}
