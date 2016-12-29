package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {

	private String nickName;

	private PokemonType type;

	private int cp;

	public Pokemon(String name, PokemonType type, int cp) {
		this.nickName = name;
		this.cp = cp;
		this.type = type;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getName() {
		return nickName;
	}

	public PokemonType getType() {
		return type;
	}

}