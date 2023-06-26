package dev.necr.respawngui.utils;

import lombok.experimental.UtilityClass;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UtilityClass
@SuppressWarnings({"unused", "deprecation"})
public class Utils {

    /**
     * Colorizes string
     *
     * @param text the string to colorize
     * @return colorized string
     */
    public static String colorize(String text) {
        return text == null ? " " : ChatColor.translateAlternateColorCodes('&', text);
    }

    /**
     * Colorizes string array
     *
     * @param lines the string array to colorize
     * @return colorized string array
     */
    public static String[] colorize(String[] lines) {
        return colorize(Arrays.asList(lines.clone())).toArray(new String[0]);
    }

    /**
     * Colorizes list of strings
     *
     * @param s the list of strings to colorize
     * @return colorized list of strings
     */
    public static List<String> colorize(List<String> s) {
        List<String> colorized = new ArrayList<>();
        s.forEach((st) -> colorized.add(colorize(st)));
        return colorized;
    }

}
