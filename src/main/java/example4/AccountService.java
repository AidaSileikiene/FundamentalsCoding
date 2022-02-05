package example4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private static final String MY_DATEBASE_LOCATION = "src/main/resources/datebase.txt";

    public static List<Account> getAccountsFromDatabase() throws FileNotFoundException {


    FileReader fileReader = new FileReader(MY_DATEBASE_LOCATION);
    List<Account> accountList = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        String singleLine;

        while ((singleLine = bufferedReader.readLine()) != null) {
            String[] splitRow = singleLine.split(",");
            Account account = new Account(splitRow[0], splitRow[1], splitRow[3], splitRow[4], splitRow[2]);
            accountList.add(account);
        }

    }   catch(IOException e) {
            System.out.println("Ivyko klaida nuskaitant faila!");
    }

        return accountList;
    }
}