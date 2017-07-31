package net.println.kt15;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luliju on 2017/7/19.
 */
public abstract class NullSafetyAbsClass {

    public abstract String formatDate(Date date);

    public @NotNull String formateTime(@NotNull Date date){
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }
}
