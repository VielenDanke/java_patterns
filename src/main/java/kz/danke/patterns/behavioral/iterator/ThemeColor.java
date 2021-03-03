package kz.danke.patterns.behavioral.iterator;

public enum ThemeColor {

    RED, ORANGE, BLACK, WHITE;

    public static Iterator<ThemeColor> iterator() {
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor> {

        private ThemeColor[] colors = ThemeColor.values();
        private int position;

        @Override
        public boolean hasNext() {
            return position < ThemeColor.values().length;
        }

        @Override
        public ThemeColor next() {
            return colors[position++];
        }
    }
}
