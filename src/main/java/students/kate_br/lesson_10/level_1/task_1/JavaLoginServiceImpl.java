package students.kate_br.lesson_10.level_1.task_1;

 class JavaLoginServiceImpl implements JavaLoginService {
     @Override
     public boolean canLogin(String login, String password) {
         return (login != null)
                 && login.equals("javastar")
                 && (password != null)
                 && password.equals("pass");
     }
 }
