package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class MBTIPersonalityTest {

    private ArrayList<String> questions;
    private ArrayList<String> responses;

    public MBTIPersonalityTest() {
        this.questions = new ArrayList<>();
        this.responses = new ArrayList<>();

        questions.add("A. expend energy, enjoy groups             B. conserve energy, enjoy one-on-one");
        questions.add("A. Interpret literally       B. plan for the future");
        questions.add("A. prefer immediate rewards        B. look for meaning and possibilities");
        questions.add("A. logical,thinking,questioning B. empathetic, feeling, accommodating");
        questions.add("A. organized,orderly         B. flexible, adaptable");
        questions.add("A. more outgoing,think out loud  B. more reserved, think to yourself");//
        questions.add("A. practical, realistic, experiential     B. imaginative, innovative, theoretical");//
        questions.add("A. candid, straight, forward, frank        B. tactful, kind, encouraging");//
        questions.add("A. plan, schedule B. unplanned, spontaneous");//
        questions.add("A. seek many tasks, public activities, interaction with others          B. seek private, solitary activities with quiet to concentrate");//
        questions.add("A. standard, usual, conventional B. different, novel, uniques");//
        questions.add("A. firm, tend to criticize, hold the line           B. gentle, tend to appreciate, conciliate");//
        questions.add("A. regulated, structured       B. easy-going,live and let live");//
        questions.add("A. external, communicative, express yourself B. internal, reticent, keep to yourself");//
        questions.add("A. focus on here-and-now    B. look to the future, global perspective, big picture");//
        questions.add("A. tough-minded, just            B. tender-hearted, merciful");//
        questions.add("A. preparation, plan ahead B. go with the flow, adapt as you go");//
        questions.add("A. active, initiate     B. ideas, dreams, what could be, philosophical");
        questions.add("A. facts, things, what is           B. sensitive, people-oriented, compassionate");
        questions.add("A. matter of fact, issue-oriented    B. find motivation in future goals");

        for (int i = 0; i < questions.size(); i++) {
            responses.add("");
        }
    }

    public void administerTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name  ");
        String name = scanner.nextLine();
        System.out.println("Welcome to the MBTI Personality Test!");
        System.out.println("Please answer the following questions with (A) for Yes or (B) for No:");

        for (int i = 0; i < questions.size(); i += 2) {
            System.out.print((i + 1) + ". " + questions.get(i) + "    ");
            String response1 = scanner.nextLine().toUpperCase();

            while (!response1.equals("A") && !response1.equals("B")) {
                System.out.println("Expected A or B as Response. Please enter either (A) or (B).");
                System.out.print((i + 1) + ". " + questions.get(i) + "    ");
                response1 = scanner.nextLine().toUpperCase();
            }

            responses.set(i, response1);

            if (i + 1 < questions.size()) {
                System.out.print((i + 2) + ". " + questions.get(i + 1) + "    ");
                String response2 = scanner.nextLine().toUpperCase();

                while (!response2.equals("A") && !response2.equals("B")) {
                    System.out.println("Expected A or B as Response. Please enter either (A) or (B).");
                    System.out.print((i + 2) + ". " + questions.get(i + 1) + "    ");
                    response2 = scanner.nextLine().toUpperCase();
                }

                responses.set(i + 1, response2);
            }
        }
    }
    public void calculatePersonalityTrait() {
        int totalScoreA = 0;
        int totalScoreB = 0;

        System.out.println("\nSelected Options:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i) + " - " + responses.get(i));

            if (responses.get(i).equals("A")) {
                totalScoreA++;
            } else if (responses.get(i).equals("B")) {
                totalScoreB++;
            }
        }

        System.out.println("\nTotal A: " + totalScoreA);
        System.out.println("Total B: " + totalScoreB);

        String trait;
        if (totalScoreA > totalScoreB) {
            trait = "Option A Dominant";
        } else if (totalScoreB > totalScoreA) {
            trait = "Option B Dominant";
        } else {
            trait = "Balanced";
        }

        System.out.println("\nYour MBTI personality trait is: " + trait);
        System.out.println("For more information, visit: https://www.16personalities.com/");
    }

    public static void main(String[] args) {
        MBTIPersonalityTest mbtiTest = new MBTIPersonalityTest();
        mbtiTest.administerTest();
        mbtiTest.calculatePersonalityTrait();
    }
}