package third;

import lab.third.SunriseScene;
import lab.third.entities.Color;
import lab.third.entities.Flash;
import lab.third.entities.SkyEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SunriseSceneTest {
    @Test
    @DisplayName("Проверка проигрывания сцены")
    public void checkPlay() {
        SunriseScene sunriseScene = new SunriseScene();
        sunriseScene.play();
        List<SkyEntity> skyEntities = sunriseScene.getSky().getSkyEntities();
        assertAll(
                () -> assertEquals(6, skyEntities.size()),
                () -> assertEquals("солнце", skyEntities.get(0).getTitle()),
                () -> assertEquals("первое солнце", skyEntities.get(0).getDescription()),
                () -> assertEquals("солнце", skyEntities.get(1).getTitle()),
                () -> assertEquals("второе солнце", skyEntities.get(1).getDescription()),
                () -> assertEquals(Color.GREEN, ((Flash) skyEntities.get(2)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(2).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(2).getDescription()),
                () -> assertEquals(Color.RED, ((Flash) skyEntities.get(3)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(3).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(3).getDescription()),
                () -> assertEquals(Color.GREEN, ((Flash) skyEntities.get(4)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(4).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(4).getDescription()),
                () -> assertEquals(Color.BLUE, ((Flash) skyEntities.get(5)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(5).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(5).getDescription())
        );
    }

    @Test
    @DisplayName("Проверка сверкания точки на небе")
    public void checkBlinkPoint() {
        SunriseScene sunriseScene = new SunriseScene();
        sunriseScene.blinkPoint();
        List<SkyEntity> skyEntities = sunriseScene.getSky().getSkyEntities();
        assertAll(
                () -> assertEquals(1, skyEntities.size()),
                () -> assertEquals("точка света", skyEntities.get(0).getTitle()),
                () -> assertEquals("ослепительно яркая точка света", skyEntities.get(0).getDescription())
        );
    }

    @Test
    @DisplayName("Проверка расползания точки на небе")
    public void checkPointStretch() {
        SunriseScene sunriseScene = new SunriseScene();
        sunriseScene.pointStretch();
        List<SkyEntity> skyEntities = sunriseScene.getSky().getSkyEntities();
        assertAll(
                () -> assertEquals(1, skyEntities.size()),
                () -> assertEquals("полумесяц", skyEntities.get(0).getTitle()),
                () -> assertEquals("узкий полумесяц", skyEntities.get(0).getDescription())
        );
    }

    @Test
    @DisplayName("Проверка появления солнц")
    public void checkSunrise() {
        SunriseScene sunriseScene = new SunriseScene();
        sunriseScene.sunrise();
        List<SkyEntity> skyEntities = sunriseScene.getSky().getSkyEntities();
        assertAll(
                () -> assertEquals(6, skyEntities.size()),
                () -> assertEquals("солнце", skyEntities.get(0).getTitle()),
                () -> assertEquals("первое солнце", skyEntities.get(0).getDescription()),
                () -> assertEquals("солнце", skyEntities.get(1).getTitle()),
                () -> assertEquals("второе солнце", skyEntities.get(1).getDescription()),
                () -> assertEquals(Color.GREEN, ((Flash) skyEntities.get(2)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(2).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(2).getDescription()),
                () -> assertEquals(Color.RED, ((Flash) skyEntities.get(3)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(3).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(3).getDescription()),
                () -> assertEquals(Color.GREEN, ((Flash) skyEntities.get(4)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(4).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(4).getDescription()),
                () -> assertEquals(Color.BLUE, ((Flash) skyEntities.get(5)).getColor()),
                () -> assertEquals("всполох", skyEntities.get(5).getTitle()),
                () -> assertEquals("яркий цветной всполох", skyEntities.get(5).getDescription())
        );
    }
}
