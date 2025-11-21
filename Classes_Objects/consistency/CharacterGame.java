public class CharacterGame {
    private String name;
    private int currentHealth;
    private String status;

    CharacterGame(int currentHealth, String name) {
        setCurrentHealth(currentHealth);
        this.name = name;
    }

    public void takeDamage(int damageAmount) {
        if ((currentHealth - damageAmount) < 0) {
            setCurrentHealth(0);
        } else setCurrentHealth(getCurrentHealth() - damageAmount);
    }

    public void receiveHealing(int healingAmount) {
        if ((currentHealth + healingAmount) > 100) {
            currentHealth = 100;
        } else setCurrentHealth(getCurrentHealth() + healingAmount);
    }


    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        if (currentHealth > 0) {
            setStatus("alive");
        } else setStatus("dead");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            return;
        }
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
