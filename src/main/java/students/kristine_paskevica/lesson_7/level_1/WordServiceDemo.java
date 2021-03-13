package students.kristine_paskevica.lesson_7.level_1;

class WordServiceDemo {

    public static void main(String[] args) {
        WordService method = new WordService();
        String rindkopa = "Pasaulē vislielākās olas ir vaļu haizivij. Tās ola ir apmēram 30 centimetrus gara un sver 150 reižu vairāk nekā liela " +
                "vistas ola. Savukārt, vismazākās olas ir lapsenei. Pieci miljardi lapseņu olu kopā svērtu vienu kilogramu.";
        System.out.println(method.repeatingWord(rindkopa));
    }
}

