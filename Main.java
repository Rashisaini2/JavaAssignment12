import java.util.*;
import java.util.Scanner;

 class Employee {

    //create private and static/class variables
    private String name;
    private int in_time,out_time;
    private String message;
    private float payment;
    static int count;


    public Employee(){
        count++;

    }

    public Employee(String name, int intime, float payment, String message){
        this.name = name;
        this.in_time = intime;
        this.payment = payment;
        this.message = message;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {

            this.name = name;
        }

    public int getIntime() {

        return this.in_time;
    }
    public void setIntime(int intime) {

        this.in_time = intime;
    }

    public int getOuttime() {

        return this.out_time;
    }

    public void setOuttime(int outtime) {

        this.out_time = outtime;
    }

     public String getMessage() {
         return this.message;
     }

     public void setMessage(String message) {

         this.message = message;
     }


     public float getPayment() {
         return this.payment;
     }

     public void setPayment(float payment) {

         this.payment = payment;
     }


}


public class Main {
    public static void main(String[] args) {

        int i;
        Scanner scn = new Scanner(System.in);
        Employee emp = new Employee();
        emp.count = 0;
    do {


//        System.out.println(emp.getName());
        System.out.print("Press 1 to continue:");
        i = scn.nextInt();
        if(i != 1)
            break;
        else
            takeInput(emp);


    }while(i == 1);



    }
         static void takeInput(Employee emp){
            //print count;

                 Scanner scn = new Scanner(System.in);
                 String name;
                 int paymentPerHour, in_time = 0, out_time = 0;
                 float totalHour = (out_time - in_time);
                 float extraHour;
                 float salary = 0;

                 System.out.println("Please enter your name");
                 name = scn.nextLine();

                 boolean numeric = false;
                 try {

                     Integer.parseInt(name);
                     numeric = true;
                 } catch (NumberFormatException e) {

                 }

                 if (numeric) {
                     System.out.println("Please enter a correct name:");
//                takeInput(emp);
                 } else {

                     emp.setName(name);
                     System.out.println("Please enterS the hour you arrived to work (HH)");
                     in_time = scn.nextInt();
                     if (in_time < 7 || in_time > 22 || in_time < 0) {
                         System.out.println("Please enter the correct hour you arrived to work (HH)");
                     } else {
                         emp.setIntime(in_time);
                         System.out.println("Please enter the hour you exit from work(HH)");
                         out_time = scn.nextInt();
                         if (out_time > 22 || out_time < 0 || out_time < 7) {
                             System.out.println("Please enter the correct hour you exit from work (HH)");
                         } else {
                             emp.setOuttime(out_time);
                             totalHour = (out_time - in_time);
                         }

                     }


                 paymentPerHour = 200;


                 if (totalHour >= 9) {
                     extraHour = (float) (totalHour - 9);
                     salary +=  ((float) (totalHour) * paymentPerHour) + ((float) (extraHour) * 100);

                 } else if (totalHour <= 9) {
                     salary += ((float) (totalHour) * paymentPerHour);
                 }
                  else if (totalHour > 22) {
                     System.out.println("You cant work more than 15 hours a day");
                 }

                 float payment = 0;
                  payment = salary;
                 String message;
                 emp.count++;
                 if(payment > 0)
                 {
                     message = "Successful";
                     System.out.println(message);
                     System.out.println("You have been working for: " + totalHour + " Hours" + ",And your payment is: " + salary);
                     System.out.println("Total number of employees are:" + emp.count);

                 }
                 else
                 {
                     message = "Unsuccessful";
                     System.out.println(message);
                     System.out.println("You have been working for: " + totalHour + " Hours" + ",And your payment is: " + salary);
                     System.out.println("Total number of employees are:" + emp.count);
                 }

             }
        }

    }

















