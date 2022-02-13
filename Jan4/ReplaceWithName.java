package Jan4;

public class ReplaceWithName {
    public static void main(String[] args) {
        //CWH java chapter 3 question 3
        //Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot”
        // Replace <|name|> with a string (some name)

        //variable
        String letter = "Dear <|name|>, Thanks a lot";

        //output
        System.out.println(letter.replace("<|name|>","SAM"));

    }
}
