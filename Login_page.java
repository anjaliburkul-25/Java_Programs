package Function_programs;

import java.util.Scanner;

class Login_page {

      static  String username,password;


         void loginuser(){

          if (username.equals("Admin")&& password.equals("Admin@123")){
              System.out.println("Login success.....");
          }
          else{
              System.out.println("invalide login");
          }

        }
        public static void main(String [] args){


            Scanner sc=new Scanner(System.in);

            System.out.println("Enter username");
            username=sc.nextLine();

            System.out.println("Enter password");
            password= sc.nextLine();

            Login_page obj=new Login_page();
            obj.loginuser();


        }
    }


