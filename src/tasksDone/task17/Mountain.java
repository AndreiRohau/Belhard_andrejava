package tasksDone.task17;

/**
 * Должен быть класс - Mountain,
 * у горы есть характеристики - высота, сложность (числа).
 */
public class Mountain {
    private int height;
    private int complexity;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public Mountain(int height, int complexity) {
        this.height = height;
        this.complexity = complexity;
    }
}
