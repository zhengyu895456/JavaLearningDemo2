package com.zeroten.proxy;

import java.util.List;

public interface UserDao {
    boolean save(User user);
    List query();
    boolean delete();
}
