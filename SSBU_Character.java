package Project_CS201;

public class SSBU_Character extends Application_Class{

private String name;
private String game;
private int id;

public SSBU_Character() {
	name = null;
	game = null;
	id = -1;
}

public SSBU_Character(String name, String game, int id) {
	this.name = name;
	this.game = game;
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setGame(String game) {
	this.game = game;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public String getGame() {
	return game;
}

public int getId() {
	return id;
}

public String toString() {
	return ("Name: " + this.name + " - Game: " + this.game + " - ID: " + this.id);
}
}
