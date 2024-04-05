package lab.third.entities;

public abstract class SkyEntity {
    private final String title;
    private final String description;

    public SkyEntity(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
