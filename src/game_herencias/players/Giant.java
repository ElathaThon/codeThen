package game_herencias.players;

import java.util.Random;

public class Giant extends Player {

	private Random random;
	private Boolean vulnerable;


	public Giant() {
		this.random = new Random();
		setHealth(10);
		this.vulnerable = false;
	}

	@Override
    /** Cuando ataca, dos de cada 3 veces no atina (no hace daño), y una de cada 3 veces hace daño 4-6. */
	public int attack() {

        if (acierta()) {
            return random.nextInt(2) + 4;
        } else {
            return 0;
        }

	}


	private boolean acierta() {

	    if ( random.nextInt(2) > 0 ) {
	        return false;
        } else {
	        this.vulnerable = true;
	        return true;
        }

    }

    @Override
    public void receiveHit(int hit) {

	    super.receiveHit(this.vulnerable ? hit*2 : hit/2);

	    /*
        if (this.vulnerable){
            setHealth(getHealth() - hit*2);
            this.vulnerable = false;
        }else {
            setHealth(getHealth() - hit / 2);
        }
        */
    }

  }
