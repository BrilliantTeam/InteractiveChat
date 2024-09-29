package com.loohp.interactivechat.objectholders;

import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import org.bukkit.scheduler.BukkitTask;

public class ICTask {
    private static int ID_COUNTER = 0;

    private Object taskObject;
    private int id;

    public ICTask(Object task) {
        taskObject = task;
        id = ++ID_COUNTER;
    }

    public void cancel() {
        if (taskObject instanceof BukkitTask)
            ((BukkitTask) taskObject).cancel();
        else if (taskObject instanceof ScheduledTask)
            ((ScheduledTask) taskObject).cancel();
    }

    public int getId() {
        return id;
    }
}
