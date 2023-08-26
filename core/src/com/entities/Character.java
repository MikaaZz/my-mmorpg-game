import com.badlogic.gdx.graphics.g2d.Sprite;

public class Character {
  protected String characterName;
  protected Sprite sprite;
  protected int strengh;
  protected int agility;
  protected int health;

  public Character(Sprite sprite, int health, int strengh, int agility, String characterName) {
    this.characterName = characterName;
    this.strengh = strengh;
    this.agility = agility;
    this.sprite = sprite;
    this.health = health;
  }
}
