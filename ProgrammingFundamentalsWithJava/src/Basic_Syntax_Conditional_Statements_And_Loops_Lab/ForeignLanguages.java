package Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();
        String language;
        if(countryName.equals("England") || countryName.equals("USA")){
            language= "English";
        }else if (countryName.equals("Spain")|| countryName.equals("Argentina") || countryName.equals("Mexico")){
            language = "Spanish";
        }else{
            language = "unknown";
        }
        System.out.println(language);
    }
}
