package lab.third;

import lab.third.entities.*;

public class SunriseScene {
    private final Sky sky;
    private final PointLight pointLight;
    private final HalfMoon halfMoon;
    private final Sun firstSun;
    private final Sun secondSun;

    public SunriseScene() {
        sky = new Sky();
        pointLight = new PointLight();
        halfMoon = new HalfMoon();
        firstSun = new Sun("первое солнце");
        secondSun = new Sun("второе солнце");
    }

    public Sky getSky() {
        return sky;
    }

    public void play() {
        blinkPoint();
        pointStretch();
        sunrise();
    }

    public void blinkPoint() {
        this.sky.addEntity(pointLight);
    }

    public void pointStretch() {
        this.sky.removeEntity(pointLight);
        this.sky.addEntity(halfMoon);
    }

    public void sunrise() {
        this.sky.removeEntity(halfMoon);
        this.sky.addEntity(firstSun);
        this.sky.addEntity(secondSun);
        this.sky.addEntity(new Flash(Color.GREEN));
        this.sky.addEntity(new Flash(Color.RED));
        this.sky.addEntity(new Flash(Color.GREEN));
        this.sky.addEntity(new Flash(Color.BLUE));
    }
}
