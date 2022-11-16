//Import Java Utilities
import java.io.IOException;
import java.util.List;

//Import Nylas Packages
import com.nylas.*;

//Import DotEnv to handle .env files
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;

//Import DotEnv to handle .env files
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;

public class ReadCalendars {
    public static void main(String[] args) throws RequestFailedException, IOException {
        Dotenv dotenv = Dotenv.load();
        // Create the client object
        NylasClient client = new NylasClient();
        // Connect it to Nylas using the Access Token from the .env file
        NylasAccount account = client.account(dotenv.get("ACCESS_TOKEN"));

        // Access the Calendars endpoint
        Calendars calendars = account.calendars();
        // Read all calendars
        RemoteCollection<Calendar> calendar_list = calendars.list();

        // Loop through calendars
        for (Calendar calendar : calendar_list){
            System.out.println("Id: " + calendar.getId() +
                               " | Name: " + calendar.getName() +
                               " | Description: " + calendar.getDescription());
        }
    }
}