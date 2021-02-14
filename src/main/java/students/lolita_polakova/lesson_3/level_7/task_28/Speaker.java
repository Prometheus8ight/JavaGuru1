package students.lolita_polakova.lesson_3.level_7.task_28;

class Speaker {

    String company;
    int model;
    String song;

    Speaker(String speakerCompany, int speakerModel, String playedSong) {
        this.company = speakerCompany;
        this.model = speakerModel;
        this.song = playedSong;
    }
    public void info() {
        System.out.println("Copmany: " + this.company);
        System.out.println("Model: " + this.model);
        System.out.println("Currently playing: " + this.song);
    }
    public void changeSong(String secondSong) {
        this.song = secondSong;
        System.out.println("Next song: " + secondSong);
    }

    public void changeSongAgain(String thirdSong) {
        this.song = thirdSong;
        System.out.println("Next: " + thirdSong);
    }
    public void anotherChange(String fourthSong) {
        this.song = fourthSong;
        System.out.println("Finally: " + fourthSong + " !");
    }
}

class SpeakerDemo {

    public static void main(String[] args) {

        Speaker speaker = new Speaker("MadBass", 00123,"Lambada");
        speaker.info();
        speaker.changeSong("Hey Jude");
        speaker.changeSongAgain("Cherry Cherry Lady");
        speaker.anotherChange("Bohemian Rhapsody");
    }
}