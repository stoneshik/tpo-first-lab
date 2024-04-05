package lab.third.entities;

public class Flash extends SkyEntity {
    private final Color color;

    public Flash(Color color) {
        super("всполох", "яркий цветной всполох");
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
