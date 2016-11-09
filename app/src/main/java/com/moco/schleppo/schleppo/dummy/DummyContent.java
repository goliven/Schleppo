package com.moco.schleppo.schleppo.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();




        static {
            // Add some sample items.
            addItem(new DummyItem("1",  "Parkverbot", "11.10.2016", "Sie stehen im Parkverbot."));
            addItem(new DummyItem("2", "Abgeschleppt", "21.09.2016", "Sie wurden abgeschleppt."));
            addItem(new DummyItem("3", "Parkverbot", "05.08.2016", "Sie behindern meine Einfahrt. Bitte entfernen Sie Ihr Fahrzeug. Andernfalls muss ich Sie abschleppt"));
        }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }



    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String date;
        public final String details;

        public DummyItem(String id, String content, String date, String details) {
            this.id = id;
            this.content = content;
            this.date = date;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }

}
