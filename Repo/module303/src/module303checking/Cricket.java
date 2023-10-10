package module303checking;

public class Cricket implements Sports{

	
		// TODO Auto-generated method stub
		private int[] playersid;

	    public Cricket() {
	        playersid = new int[11];
	        for (int i = 0; i < playersid.length; i++) {
	            playersid[i] = 1;
	        }
	        System.out.println("A New Cricket Team Has Formed");
	    }

	    @Override
	    public void calculateAvgAge(int[] age) {
	        double sum = 0;
	        int count = 0;

	        for (int i = 0; i < playersid.length; i++) {
	            if (playersid[i] != -1) {
	                sum += age[i];
	                count++;
	            }
	        }

	        if (count > 0) {
	            double avgAge = sum / count;
	            System.out.printf("The average age of the team is %.2f%n", avgAge);
	        } else {
	            System.out.println("The team has no active players.");
	        }
	    }

	    @Override
	    public void retirePlayer(int id) {
	        if (id >= 1 && id <= 11) {
	            if (playersid[id - 1] == -1) {
	                System.out.println("Player with id " + id + " has already retired.");
	            } else {
	                playersid[id - 1] = -1;
	                System.out.println("Player with id " + id + " has retired.");
	            }
	        } else {
	            System.out.println("Invalid player id.");
	        }
	    }
	

	}


