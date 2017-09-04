package labyrinth;

import java.util.Arrays;
import java.util.List;

public class LabyrinthTest {

	public static void main(String[] args) {

		testMovePlayer();
		testMovePlayerMultipleTimes();
		testEscape();

		System.out.println("Tests OK!");
	}

	public static void testMovePlayer() {

		List<String> map = Arrays.asList(
			"@@@@@@@",
			"@@ @@  ",
			"@@ ·  @",
			"@@@@@@@"
		);

		LabyrinthReader labyrinthReader = new LabyrinthReader();
		Labyrinth labyrinth = labyrinthReader.build(map);
		Game game = new Game();


		game.movePlayer(Direction.RIGHT);

		Position playerPosition = game.getPlayerPosition();
		TestUtil.assertEquals(playerPosition.getX(), 4);
		TestUtil.assertEquals(playerPosition.getY(), 2);
		TestUtil.assertEquals(game.isPlayerOutsideOfMap(), false);
	}

	public static void testMovePlayerMultipleTimes() {

		List<String> map = Arrays.asList(
			"@ @@@@@",
			"@ @@ @@",
			"@    @@",
			"@@ @@ @",
			"@@  · @",
			"@@@@@@@"
		);

		// Note: we can inline the LabyrinthReader variable
		Labyrinth labyrinth = new LabyrinthReader().build(map);
		Game game = new Game();

		game.movePlayer(Direction.LEFT);
		game.movePlayer(Direction.LEFT);
		game.movePlayer(Direction.LEFT);
		game.movePlayer(Direction.UP);
		game.movePlayer(Direction.UP);
		game.movePlayer(Direction.UP);
		game.movePlayer(Direction.RIGHT);

		Position playerPosition = game.getPlayerPosition();
		TestUtil.assertEquals(playerPosition.getX(), 3);
		TestUtil.assertEquals(playerPosition.getY(), 2);
		TestUtil.assertEquals(game.isPlayerOutsideOfMap(), false);
	}

	public static void testEscape() {

		List<String> map = Arrays.asList(
			"@@@@@@@",
			"@@ @@·@",
			"@@    @",
			"@@ @@@@"
		);

		Labyrinth labyrinth = new LabyrinthReader().build(map);
		Game game = new Game();

		game.movePlayer(Direction.DOWN);
		game.movePlayer(Direction.LEFT);
		game.movePlayer(Direction.LEFT);
		game.movePlayer(Direction.LEFT);
		game.movePlayer(Direction.DOWN);
		game.movePlayer(Direction.DOWN);

		Position playerPosition = game.getPlayerPosition();
		TestUtil.assertEquals(playerPosition.getX(), 2);
		TestUtil.assertEquals(playerPosition.getY(), 4);
		TestUtil.assertEquals(game.isPlayerOutsideOfMap(), true);
	}
}
