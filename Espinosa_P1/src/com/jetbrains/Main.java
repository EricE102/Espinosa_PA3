package com.jetbrains;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        //Variables
        int Single_Dig = 0, Count = 1;                          //counter variables for loops
        double Correct_Answers = 0.0;       //to calculate correct answers
        double Wrong_Answers = 0.0;         //to calculate wrong answers

        System.out.println("Please choose the type of math you wish to solve: ");
        System.out.println("1 for Addition.");
        System.out.println("2 for Subtraction.");
        System.out.println("3 for Multiplication.");
        System.out.println("4 for Division.");
        System.out.println("5 for Random Mix.");
        int Math_Type = scnr.nextInt();
        switch (Math_Type) {
            case 1: //Addition ******************************************************************************************************************************************************************************************************
                System.out.println("Please enter: ");
                System.out.println("1 for difficulty level 1(single-digit numbers)");
                System.out.println("2 for difficulty level 2(double-digit numbers)");
                System.out.println("3 for difficulty level 3(triple-digit numbers)");
                System.out.println("4 for difficulty level 4(quad-digit numbers)");
                int Add_Diff = scnr.nextInt();
                //if(Mult_Diff != 1 || Mult_Diff != 2 || Mult_Diff != 3 || Mult_Diff != 4)
                switch (Add_Diff) {
                    case 1: //level 1 addition
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 + R2;
                                System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 2://level 2 addition
                        while (Count != 0) {
                            //While loop for addition of double digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 + R2;
                                System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 3://level 3 addition
                        while (Count != 0) {
                            //While loop for addition of triple digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 + R2;
                                System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 4://level 4 of addition
                        while (Count != 0) {
                            //While loop for addition of quad digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 + R2;
                                System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;
                }
                break;


            case 2: //Subtraction ************************************************************************************************************************************************************************************


                System.out.println("Please enter: ");
                System.out.println("1 for difficulty level 1(single-digit numbers)");
                System.out.println("2 for difficulty level 2(double-digit numbers)");
                System.out.println("3 for difficulty level 3(triple-digit numbers)");
                System.out.println("4 for difficulty level 4(quad-digit numbers)");
                int Sub_Diff = scnr.nextInt();
                //if(Mult_Diff != 1 || Mult_Diff != 2 || Mult_Diff != 3 || Mult_Diff != 4)
                switch (Sub_Diff) {
                    case 1://level 1 subtraction
                        while (Count != 0) {
                            //While loop for subtraction of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 - R2;
                                System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 2://lvl 2 subtraction
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 - R2;
                                System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 3: //lvl 3 subtraction
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 - R2;
                                System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 4: //lvl 4 subtraction
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 - R2;
                                System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;
                }
                break;

            case 3: //Multiplication ********************************************************************************************************************************************************************************


                System.out.println("Please enter: ");
                System.out.println("1 for difficulty level 1(single-digit numbers)");
                System.out.println("2 for difficulty level 2(double-digit numbers)");
                System.out.println("3 for difficulty level 3(triple-digit numbers)");
                System.out.println("4 for difficulty level 4(quad-digit numbers)");
                int Mult_Diff = scnr.nextInt();
                //if(Mult_Diff != 1 || Mult_Diff != 2 || Mult_Diff != 3 || Mult_Diff != 4)
                switch (Mult_Diff) {
                    case 1://lvl 1 multiplication
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 * R2;
                                System.out.println("How much is " + R1 + " times " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 2://lvl 2 multiplication
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 * R2;
                                System.out.println("How much is " + R1 + " times " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 3://lvl 3 multiplication
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 * R2;
                                System.out.println("How much is " + R1 + " times " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 4://lvl 4 multiplication
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                int R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                int R2 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                int x = R1 * R2;
                                System.out.println("How much is " + R1 + " times " + R2 + "?");

                                int User_Input = scnr.nextInt();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }

                        }
                        break;
                }
                break;


            case 4: //Division **********************************************************************************************************************************************
                System.out.println("(Division)Please enter: ");
                System.out.println("1 for difficulty level 1(single-digit numbers)");
                System.out.println("2 for difficulty level 2(double-digit numbers)");
                System.out.println("3 for difficulty level 3(triple-digit numbers)");
                System.out.println("4 for difficulty level 4(quad-digit numbers)");
                int Div_Diff = scnr.nextInt();
                //if(Mult_Diff != 1 || Mult_Diff != 2 || Mult_Diff != 3 || Mult_Diff != 4)
                switch (Div_Diff) {
                    case 1://lvl 1 division
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                double R1 = rand.nextInt(9);            //generates a random number between 0-9
                                double R2 = rand.nextInt(9 - 1) + 1;        //generates random number between 1-9 since a number cannot be divided by 0
                                double x = R1 / R2;
                                System.out.println("How much is " + R1 + " divided by " + R2 + "?");

                                double User_Input = scnr.nextDouble();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 2://lvl 2 division
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                double R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                double R2 = rand.nextInt(99 - 1) + 1;                                       //Used to generate a random number between 0-9 for the question
                                double x = R1 / R2;
                                System.out.println("How much is " + R1 + " divided by " + R2 + "?");

                                double User_Input = scnr.nextDouble();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 3://lvl 3 division
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                double R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                double R2 = rand.nextInt(999 - 1) + 1;                                       //Used to generate a random number between 0-9 for the question
                                double x = R1 / R2;
                                System.out.println("How much is " + R1 + " divided by " + R2 + "?");

                                double User_Input = scnr.nextDouble();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;


                    case 4://lvl 4 division
                        while (Count != 0) {
                            //While loop for multiplication of single digits
                            while (Single_Dig < 10) {
                                double R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                double R2 = rand.nextInt(9999 - 1) + 1;                                       //Used to generate a random number between 0-9 for the question
                                double x = R1 / R2;
                                System.out.println("How much is " + R1 + " divided by " + R2 + "?");

                                double User_Input = scnr.nextDouble();
                                if (User_Input == x) {
                                    int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                    switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    Correct_Answers++;
                                } else {
                                    int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                    while (User_Input != x) {
                                        while (Attempts < 1) {
                                            int Neg_Resp = rand.nextInt(4);
                                            switch (Neg_Resp) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don’t give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            Attempts++;
                                        }
                                        User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                        Wrong_Answers++;                                            //Counts wrong answer
                                    }
                                }
                                Single_Dig++;                                                                    //Counts to ask 10 questions
                            }


                            System.out.println(Correct_Answers + " Correct Answers");
                            System.out.println(Wrong_Answers + " Wrong Answers");


                            if (Correct_Answers < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wrong_Answers = 0.0;
                                Correct_Answers = 0.0;
                            }
                        }
                        break;
                }

                break;

            case 5://Random Arithmetic
                System.out.println("Please choose the level of difficulty for the random arithmetic.");
                System.out.println("1 for difficulty level 1(single-digit numbers)");
                System.out.println("2 for difficulty level 2(double-digit numbers)");
                System.out.println("3 for difficulty level 3(triple-digit numbers)");
                System.out.println("4 for difficulty level 4(quad-digit numbers)");
                int Rand_Mix = scnr.nextInt();
                double Cor_Ans = 0;
                double Wro_Ans = 0;
                double Div_Input;

                switch (Rand_Mix) {
                    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    case 1://level 1 arithmetic
                        int i = 0;
                        while (Count != 0) {
                            while (i < 10) {
                                int level_one = rand.nextInt(4);
                                switch (level_one) {
                                    case 0://level 1 addition
                                        int R1 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        int R2 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        int x = R1 + R2;
                                        System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                        int User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;

                                    case 1://level 1 subtraction
                                        R1 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 - R2;
                                        System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                        User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 2://level 1 multiplication
                                        R1 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 * R2;
                                        System.out.println("How much is " + R1 + " times " + R2 + "?");
                                        User_Input = scnr.nextInt();

                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 3://level 1 division
                                        double Num = rand.nextInt(9);                                       //Used to generate a random number between 0-9 for the question
                                        double Den = rand.nextInt(9) + 1;                                       //Used to generate a random number between 0-9 for the question
                                        double y = Num / Den;
                                        System.out.println("How much is " + Num + " divided by " + Den + "?");

                                        Div_Input = scnr.nextDouble();
                                        if (Div_Input == y) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (Div_Input != y) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                Div_Input = y;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;
                                }
                                i++;
                            }
                            System.out.println(Cor_Ans + " Correct Answers");
                            System.out.println(Wro_Ans + " Wrong Answers");


                            if (Cor_Ans < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wro_Ans = 0.0;
                                Cor_Ans = 0.0;
                                Div_Input = 0;
                                i = 0;
                            }
                        }
                        break;

                    case 2://level 2 arithmetic
                        i = 0;
                        while (Count != 0) {
                            while (i < 10) {
                                int level_one = rand.nextInt(4);
                                switch (level_one) {

                                    case 0://level 1 addition
                                        int R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        int R2 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        int x = R1 + R2;
                                        System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                        int User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;

                                    case 1://level 1 subtraction
                                        R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 - R2;
                                        System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                        User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 2://level 1 multiplication
                                        R1 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 * R2;
                                        System.out.println("How much is " + R1 + " times " + R2 + "?");
                                        User_Input = scnr.nextInt();

                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 3://level 1 division
                                        double Num = rand.nextInt(99);                                       //Used to generate a random number between 0-9 for the question
                                        double Den = rand.nextInt(99) + 1;                                       //Used to generate a random number between 0-9 for the question
                                        double y = Num / Den;
                                        System.out.println("How much is " + Num + " divided by " + Den + "?");

                                        Div_Input = scnr.nextDouble();
                                        if (Div_Input == y) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (Div_Input != y) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                Div_Input = y;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;
                                }
                                i++;
                            }
                            System.out.println(Cor_Ans + " Correct Answers");
                            System.out.println(Wro_Ans + " Wrong Answers");


                            if (Cor_Ans < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wro_Ans = 0.0;
                                Cor_Ans = 0.0;
                                Div_Input = 0;
                                i = 0;
                            }
                        }
                        break;

                    case 3://level 3 arithmetic
                        i = 0;
                        while (Count != 0) {
                            while (i < 10) {
                                int level_one = rand.nextInt(4);
                                switch (level_one) {

                                    case 0://level 3 addition
                                        int R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        int R2 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        int x = R1 + R2;
                                        System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                        int User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;

                                    case 1://level 1 subtraction
                                        R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 - R2;
                                        System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                        User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 2://level 1 multiplication
                                        R1 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 * R2;
                                        System.out.println("How much is " + R1 + " times " + R2 + "?");
                                        User_Input = scnr.nextInt();

                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 3://level 1 division
                                        double Num = rand.nextInt(999);                                       //Used to generate a random number between 0-9 for the question
                                        double Den = rand.nextInt(999) + 1;                                       //Used to generate a random number between 0-9 for the question
                                        double y = Num / Den;
                                        System.out.println("How much is " + Num + " divided by " + Den + "?");

                                        Div_Input = scnr.nextDouble();
                                        if (Div_Input == y) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (Div_Input != y) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                Div_Input = y;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;
                                }
                                i++;
                            }
                            System.out.println(Cor_Ans + " Correct Answers");
                            System.out.println(Wro_Ans + " Wrong Answers");


                            if (Cor_Ans < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wro_Ans = 0.0;
                                Cor_Ans = 0.0;
                                Div_Input = 0;
                                i = 0;
                            }
                        }
                        break;

                    case 4:
                        i = 0;
                        while (Count != 0) {
                            while (i < 10) {
                                int level_one = rand.nextInt(4);
                                switch (level_one) {

                                    case 0://level 3 addition
                                        int R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                        int R2 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                        int x = R1 + R2;
                                        System.out.println("How much is " + R1 + " plus " + R2 + "?");

                                        int User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;

                                    case 1://level 1 subtraction
                                        R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 - R2;
                                        System.out.println("How much is " + R1 + " minus " + R2 + "?");

                                        User_Input = scnr.nextInt();
                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;                                             //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                                            //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 2://level 1 multiplication
                                        R1 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                        R2 = rand.nextInt(9999);                                       //Used to generate a random number between 0-9 for the question
                                        x = R1 * R2;
                                        System.out.println("How much is " + R1 + " times " + R2 + "?");
                                        User_Input = scnr.nextInt();

                                        if (User_Input == x) {
                                            int Pos_Resp = rand.nextInt(4);                          //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                                              //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;                                               //Used to count the amounts of attempts for the question.

                                            while (User_Input != x) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                User_Input = x;         //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;              //Counts wrong answer
                                            }
                                        }
                                        break;


                                    case 3://level 1 division
                                        double Num = rand.nextInt(9999);          //Used to generate a random number between 0-9 for the question
                                        double Den = rand.nextInt(9999) + 1;      //Used to generate a random number between 0-9 for the question
                                        double y = Num / Den;
                                        System.out.println("How much is " + Num + " divided by " + Den + "?");

                                        Div_Input = scnr.nextDouble();
                                        if (Div_Input == y) {
                                            int Pos_Resp = rand.nextInt(4);         //Used to generate a random number between 0-3(4) for the different responses
                                            switch (Pos_Resp) {                             //Used to switch between each of the responses
                                                case 0:
                                                    System.out.println("Very good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            Cor_Ans++;
                                        } else {
                                            int Attempts = 0;           //Used to count the amounts of attempts for the question.

                                            while (Div_Input != y) {
                                                while (Attempts < 1) {
                                                    int Neg_Resp = rand.nextInt(4);
                                                    switch (Neg_Resp) {
                                                        case 0:
                                                            System.out.println("No. Please try again.");
                                                            break;
                                                        case 1:
                                                            System.out.println("Wrong. Try once more.");
                                                            break;
                                                        case 2:
                                                            System.out.println("Don’t give up!");
                                                            break;
                                                        case 3:
                                                            System.out.println("No. Keep trying.");
                                                            break;
                                                    }
                                                    Attempts++;
                                                }
                                                Div_Input = y;                    //Once the max amount of attempts has been reached, used to cancel the loop to ask user new question
                                                Wro_Ans++;                        //Counts wrong answer
                                            }
                                        }
                                        break;
                                }
                                i++;
                            }
                            System.out.println(Cor_Ans + " Correct Answers");
                            System.out.println(Wro_Ans + " Wrong Answers");


                            if (Cor_Ans < 7.5) {
                                System.out.println("Please ask your teacher for extra help");
                            } else {
                                System.out.println("Congratulations, you are ready to go to the next level!");
                            }
                            System.out.println("Enter 0 to exit the program, enter any other number to continue.");
                            Count = scnr.nextInt();
                            if (Count != 0) {
                                Single_Dig = 0;
                                Wro_Ans = 0.0;
                                Cor_Ans = 0.0;
                                Div_Input = 0;
                                i = 0;
                            }
                        }
                        break;

                }

        }
    }
}
