import java.util.List;
class User{

}
class guestUser {
    private String guestID;

    public  void browseQuestion(){
        return ;
    }
    public void viewQuestionDetail(){};
    
 
}
class registeredUser {
    private String userID;
    private String registeredDate;
    private String subscriptionType; 
    private Question question;

    public void logIn(){};
    public void viewQuestionDetail(){};
    public void askQuestion(){};
    public void answerQuestion(){};
    public Question editQuestion(){
        return null;
    };
    public Answer editAnswer(){
        return null;
    };
    public void buyPremiumTier(){};
    
}
class Subscription {
    private int subscibtionId;
    private String subscriptionEndDate;
    private String subscriptionType;

    public void UpdatePremium(){};
    
}
class Payment {
    private int paymentId;
    private Double paymentAmount; 


    public void viewQuestionDetail(){};
}

class Question{

}
class Answer{}
class Main {
    
}

