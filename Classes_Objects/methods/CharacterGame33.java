public class CharacterGame33 {
    private int currentHealth;
    private String name;

    public void takeDamage(int damageAmount) {
        if ((currentHealth - damageAmount) < 0) {
            currentHealth = 0;
        } else currentHealth -= damageAmount;
    }

    public void receiveHealing(int healingAmount) {
        if ((currentHealth + healingAmount) > 100) {
            currentHealth = 100;
        } else currentHealth += healingAmount;
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
