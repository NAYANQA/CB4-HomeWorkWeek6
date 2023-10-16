/*
18. Make your education marksheets and display in console. “BE CREATIVE”
Note: All marks from your marksheets should be store in variables and print them in
console .
 */
public class Question_18 {
    public static void main(String[] args) {


                // Creating variables for creative subjects
                int Maths  = 95;
                int English = 88;
                int Science  = 92;
                int totalMarks = Maths + English + Science;

                // Displaying a magical marks card
                System.out.println("------------ BE CREATIVE ------------");
                System.out.println("Subject\t\t\tMarks Obtained");
                System.out.println("-------------------------------------");
                System.out.println("Maths\t\t         " + Maths);
                System.out.println("English\t\t         " + English);
                System.out.println("Science\t\t         " + Science);
                System.out.println("-------------------------------------");

                // Calculating and displaying total marks and average

                double averageMarks = totalMarks / 3.0;
                System.out.println("Total Marks\t\t     " + totalMarks);
                System.out.println("Average Marks\t\t "+ averageMarks);

                }
        }



