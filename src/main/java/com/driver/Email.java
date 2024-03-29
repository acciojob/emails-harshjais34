package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    //  public void setEmailId(String emailId) {
    //     this.emailId = emailId;
    //  }

    public String getPassword() {
        return password;
    }

    // public void setPassword(String password) {
    //  this.password = password;
    // }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(this.password.equals(oldPassword))
        {
            if(newPassword.length()>=8)
            {
                int up=0;
                int lo=0;
                int digit=0;
                int sp=0;
                for(int i =0 ; i <newPassword.length();i++)
                {
                    char ch =newPassword.charAt(i);
                    if(ch >='A' && ch <='Z')
                        up++;
                    else if(ch>='a' && ch<='z')
                        lo++;
                    else if(ch>='0' && ch <='9')
                        digit++;
                    else
                        sp++;
                }
                if(up >=1 && lo>=1 && digit >=1 && sp>=1)
                {
                    this.password=newPassword;
                }

            }

        }


    }
}
