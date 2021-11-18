import java.util.Arrays;
import java.util.Scanner;

public class Run {

    public static void main(String[] args){
        System.out.println("**************Bank Statement Analyzer**************");
        System.out.println("Enter HELP for list of available commands or EXIT to terminate.");
        AnalyzerController controller = new AnalyzerController();
        CommandParser parser = new CommandParser(controller);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("W> ");
            var input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Analyzer has now terminated its execution. " +
                        "Thank you and goodbye!");
                return;
            }
            parser.executeCommand(Arrays.asList(input.split("\\s+")));
        }
    }
}
