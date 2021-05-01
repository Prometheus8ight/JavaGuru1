package students.alex_kalashnikov.project;

import java.io.Serializable;
import java.util.Objects;

class User implements Serializable {

    private final String userName;
    private final String addressIP;
    private final int port;

    public User(String userName, String addressIP, int port) {
        this.userName = userName;
        this.addressIP = addressIP;
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public int getPort() {
        return port;
    }

    public String getAddressIP() {
        return addressIP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return port == user.port && Objects.equals(userName, user.userName) && Objects.equals(addressIP, user.addressIP);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", addressIP='" + addressIP + '\'' +
                ", port=" + port +
                '}';
    }

}