package example4;

import java.io.FileNotFoundException;
import java.util.List;

public class EmailApplicationMain {

    public static void main(String[] args) throws FileNotFoundException {
       List<Account> accountList = AccountService.getAccountsFromDatabase();



    }
}
