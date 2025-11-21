public class CharacterGame{
    private int currentHealth;
    private String name;

    public void takeDamage(int damageAmount) {
        if ((currentHealth - damageAmount) < 0) {
            currentHealth = 0;
        } else currentHealth -= damageAmount;
    }

    public void receiveHealing(int heailngAmount) {
        if ((currentHealth + heailngAmount) > 100) {
            currentHealth = 100;
        } else currentHealth += heailngAmount;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
