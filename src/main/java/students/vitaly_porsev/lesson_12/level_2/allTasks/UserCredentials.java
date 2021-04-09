package students.vitaly_porsev.lesson_12.level_2.allTasks;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
