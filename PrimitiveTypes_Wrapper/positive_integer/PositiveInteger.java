public class PositiveInteger {
    private int value;

    public PositiveInteger(String value) {
        int convertedValue = Integer.parseInt(value);
        if (convertedValue < 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        } else this.value = convertedValue;
    }

    public PositiveInteger(int value) {
        if (value < 0) throw new IllegalArgumentException("Value is not a positive integer");
        this.value = value;
    }

    public boolean isPrime() {
        if (value <= 1) return false;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }

        return true;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) throw new IllegalArgumentException("Value is not a positive integer");
        this.value = value;
    }

    public void setValor() {
        
    }
}
