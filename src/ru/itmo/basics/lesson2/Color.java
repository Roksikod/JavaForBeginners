package ru.itmo.basics.lesson2;

public enum Color {

        BLACK("Черный", 123),
        WHITE("", 0),
        BLUE("", 0),
        DARK_BLUE("", 0),
        GREEN("", 0);


        private final String description;
        private final int code;

        Color(String description, int code) {
            this.description = description;
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public int getCode() {
            return code;
        }
}
