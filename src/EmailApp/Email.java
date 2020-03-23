package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companySuffix = "aecompany.com";

    //constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    //    System.out.println("EMAIL CREATED:" + this.firstName + " " + this.lastName);

// Call a method asking for the department - return the departmen
        this.department = setDepartment();
    //    System.out.println("Department: " + this.department);

        // Call a method that returns random password
        this.password = randomPassoword(defaultPasswordLength);
        System.out.println("Your random password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"." + companySuffix;
        System.out.println("Your email is: " + email);

    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for Accounting\n0 for none\n Enter a department code:");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice ==1){return "sales";}
        else if(depChoice == 2){ return "dev";}
        else if (depChoice == 3) { return "acc"; }
        else if(depChoice > 3){return "";}
        else {return " ";}
    }

    private String randomPassoword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPRSTUVWYZ0123456789!@#$%&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

 // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    // change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){ return mailboxCapacity;}
    public String getAlternateEmail(){ return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +"\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }
}
