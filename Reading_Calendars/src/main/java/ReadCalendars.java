// Import Nylas packages
import com.nylas.NylasClient;

// Import DotEnv to handle .env files
import com.nylas.models.*;
import io.github.cdimascio.dotenv.Dotenv;

import java.util.List;

public class read_calendars {
    public static void main(String[] args) throws NylasSdkTimeoutError, NylasApiError {
        // Load the .env file
        Dotenv dotenv = Dotenv.load();
        // Initialize the Nylas client
        NylasClient nylas = new NylasClient.Builder(dotenv.get("V3_TOKEN")).apiUri(dotenv.get("NYLAS_API_SERVER")).build();
        // Build the event parameters
        ListCalendersQueryParams listCalendersQueryParams = new ListCalendersQueryParams();
        List<Calendar> calendars = nylas.calendars().list(dotenv.get("CALENDAR_ID"), listCalendersQueryParams).getData();
        for (Calendar calendar : calendars){
            System.out.println("Id: " + calendar.getId() +
                               " | Name: " + calendar.getName() +
                               " | Description: " + calendar.getDescription());
        }
    }
}
