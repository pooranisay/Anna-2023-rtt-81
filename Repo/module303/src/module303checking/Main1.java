package module303checking;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cricket cricketTeam = new Cricket();

        // Create a Football team
        Football footballTeam = new Football();

        // Calculate average age for both teams (provide age data as an array)
        int[] cricketAges = { 25, 28, 30, 22, 29, 26, 27, 32, 24, 23, 31 };
        int[] footballAges = { 27, 24, 26, 28, 29, 25, 30, 31, 22, 23, 27 };

       cricketTeam.calculateAvgAge(cricketAges);
     
        footballTeam.calculateAvgAge(footballAges);

        // Retire players
        cricketTeam.retirePlayer(2);
        footballTeam.retirePlayer(5);

        // Player transfer in football
        footballTeam.playerTransfer(1000000, 4);

        // Calculate average age again
        cricketTeam.calculateAvgAge(cricketAges);
        footballTeam.calculateAvgAge(footballAges);
    }
		
	}


