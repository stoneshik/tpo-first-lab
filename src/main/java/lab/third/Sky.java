package lab.third;

import lab.third.entities.SkyEntity;

import java.util.ArrayList;
import java.util.List;

public class Sky {
    private final List<SkyEntity> skyEntities;

    public Sky() {
        skyEntities = new ArrayList<>();
    }

    public List<SkyEntity> getSkyEntities() {
        return skyEntities;
    }

    public void addEntity(SkyEntity skyEntity) {
        this.skyEntities.add(skyEntity);
    }

    public void removeEntity(SkyEntity skyEntity) {
        this.skyEntities.remove(skyEntity);
    }
}
