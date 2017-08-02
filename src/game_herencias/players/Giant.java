package game_herencias.players;

import java.util.Random;

public class Giant extends Player {

	private Random random;

	public Giant() {
		this.random = new Random();
		setHealth(10);
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
	        return true;
        }

    }

    @Override
    public void receiveHit(int hit) {

	    setHealth( getHealth() - hit/2 );

    }
}
