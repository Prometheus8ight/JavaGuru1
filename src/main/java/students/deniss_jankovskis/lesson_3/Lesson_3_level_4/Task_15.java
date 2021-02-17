package students.deniss_jankovskis.lesson_3.Lesson_3_level_4;

class Phone {

    String model;
    Phone(String newModel) {
        this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }