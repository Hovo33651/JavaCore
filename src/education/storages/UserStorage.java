package education.storages;

import education.model.User;
import education.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    Map<String, User> users = new HashMap<>();

    public void add(String email, User user) {
        users.put(email, user);
        FileUtil.serializeUser(users);
    }


    public User getByEmail(String email) {
        return users.get(email);
    }

    public void print(){
        System.out.println(users.entrySet());
    }

    public void deleteAdmin(String email) {
        users.remove(email);
        FileUtil.serializeUser(users);
    }

    public void initData(){
        users = FileUtil.deserializeUser();
    }


}
