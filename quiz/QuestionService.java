package quiz;

import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[4];
    String selection[] = new String[4];

    public QuestionService(){
        questions[0]=new Question(1,"size of int","2","4","8","1","4");
        questions[1]=new Question(2,"size of float","2","4","8","6","4");
        questions[2]=new Question(3,"size of double","2","4","8","1","8");
        questions[3]=new Question(4,"size of char","2","4","8","1","2");
    }   

    public void playQuiz(){
        int i=0;

        for(Question question : questions){

            System.out.println("Question No : "+ question.getId() + " ?");
            System.out.println(question.getQuestion());
            System.out.print(question.getOpt1() + "\t");
            System.out.print(question.getOpt2() + "\t");
            System.out.print(question.getOpt3() + "\t");
            System.out.println(question.getOpt4()+ "\t");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            selection[i]=sc.nextLine();
            i++;
        }
        System.out.println();

        for(String s : selection){
            System.out.println(s);
        }

    }



    public void printScore(){
        int score = 0;
        
        for(int i=0; i<questions.length; i++){
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println();
        System.out.println(score);
    }

}
