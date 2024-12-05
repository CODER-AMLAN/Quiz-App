import java.util.*;
public class QuizApp {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of questions: ");
      int n = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the marks for each question: ");
      int mark = sc.nextInt();
      sc.nextLine();
      HashMap<String,String[]> questionMap = new HashMap<>();
      HashMap<String,String> correctAnswerMap = new HashMap<>();
      for(int i=0;i<n;i++){
         System.out.println("Enter Question "+(i+1)+" : ");
         String question = sc.nextLine();
         String[]options = new String[4];
         for(int j=0;j<4;j++){
            System.out.print("Option "+(j+1)+" : ");
            options[j]=sc.nextLine();
         }
         questionMap.put(question, options);
         System.out.println("Enter correct answer: ");
         String correctAnswer = sc.nextLine();
         correctAnswerMap.put(question, correctAnswer);
      }
   }
}