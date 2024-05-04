import java.util.List;

class User{
    private String username;
    private String ipAddress;
    private Boolean sessionStatus;

    public void viewQuestion(){};
    public void viewAnswer(){};

}
class guestUser extends User {
    private String guestID;

    public  void browseQuestion(){
        return ;
    }
    public void viewQuestionDetail(){};


}
class registeredUser extends User {
    private String userID;
    private String registeredDate;
    private String subscriptionType;
    private Question question;
    private Answer answer;

    public void logIn(){};
    public void viewQuestionDetail(){};
    public Question askQuestion(String questionContent){
        Question newQuestion= new Question();
        return newQuestion;
    };
    public Answer answerQuestion(String answerContent){
        Answer newAnswer = new Answer();
        return newAnswer;
    };
    public Question editQuestion(){
        Question editedQuestion = new Question();
        return editedQuestion;
    };
    public Answer editAnswer(){
        Answer editedAnswer =new Answer();
        return editedAnswer;
    };
    public void buyPremiumTier(){};

}
class Subscription {
    private int subscibtionID;
    private String subscriptionEndDate;

    public void createSubscription(){};
    public void cancelSubscription(){};

}
class PaymentType {
    private int paymentID;
    private Double paymentAmount;


    public void processPayment(){};
    public void cancelPayment(){};
    public void getAvailableCredit(){};
}

class creditCard extends PaymentType{
    private String paymentDetail;

    public void processCardPayment(){};
}
class paypal extends PaymentType{
    private String paypaltDetail;

    public void processPaypalPayment(){};
}
class paymentCompany{
    private String companyName;
    private String companyID;

    public void verifyPayment(){};
    public void cancelPayment(){};


}
class Question{
    private int questionID;
    private String title;
    private String content;
    private List<Answer> answers;

    public int viewStatistic(){
        return 0;
    };
}
class Answer{
    private int answerID;
    private String content;

    public int viewStatistic(){return 0;};
}
class Moderator {
    private int moderatorID;
    private String privileges;
    private List<User> users;


    public void deletePost(){};
    public void banUser(){};
}
class Admin {
    private int adminID;
    private String privileges;
    private List<Moderator> moderators;
    private List<User> users;
    private List<Report> reports;

    public void deletePost(){};
    public void banUser(){};
    public void manageRole(){};
}
class Report{
    private int reportID;
    private String description;

    public Report createReport(String reportContent){
        Report report = new Report();
        return report;
    };
    public void banUser(){};
}


