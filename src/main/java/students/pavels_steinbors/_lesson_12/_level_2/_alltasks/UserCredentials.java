package students.pavels_steinbors._lesson_12._level_2._alltasks;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean hasRole(Role role) {
        return roles.contains(role);
    }

}
