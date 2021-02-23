package students.andrew_galashin.lesson_3.level_7.task_28;

class Disc {
    String title;
    String platform;
    int pg;

        Disc (String gameTitle, String gamePlatform, int ratingPg) {
            this.title = gameTitle;
            this.platform = gamePlatform;
            this.pg = ratingPg;
        }
        public void info () {
            System.out.println("Название: " + this.title);
            System.out.println("Игровая платформа: " + this.platform);
            System.out.println("Возростная категория: " + this.pg);


        }
}
